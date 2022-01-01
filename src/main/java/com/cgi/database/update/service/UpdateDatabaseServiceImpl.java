package com.cgi.database.update.service;

import com.cgi.database.update.Models.request.UpdateDatabaseRequest;
import com.cgi.database.update.entity.*;
import com.cgi.database.update.exception.ResourceNotFoundException;
import com.cgi.database.update.exception.UpdateDatabaseException;
import com.cgi.database.update.repository.*;
import com.cgi.database.update.utils.Helper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Locale;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Component
@Slf4j
public class UpdateDatabaseServiceImpl implements UpdateDatabaseService {
    private Bpm_Task_Repository bpm_task_repository;
    private Helper helper;
    private Bpm_Instance_Repository bpm_instance_repository;
    private Bpm_Work_Notes_Repository bpm_work_notes_repository;
    private RM_Request_Repository rm_request_repository;
    public RM_Position_Info_Repository rm_position_info_repository;
    public RM_Position_SKillset_Info_Repository rm_position_sKillset_info_repository;


    @Override
    @Transactional
    public String updateDB(UpdateDatabaseRequest request) throws UpdateDatabaseException {

        try {
            String task_id = bpm_task_repository.findtaskid(request.task_name.toUpperCase(Locale.ROOT));
            String instance_id = bpm_instance_repository.find_instance_id(request.getRm_request_id());

            new Bpm_Task();
            Bpm_Task bpm_task;
            String rm_Info_Id = rm_position_info_repository.findRm_Position_Info_Id(request.rm_request_id);
            switch (request.getTask_name().toLowerCase(Locale.ROOT).replaceAll("\\s", "")) {
                case "updatesonumber":

                    bpm_task_repository.updatebpmtaskstatus(Timestamp.from(Instant.now()), task_id, "SYSTEM");


                    if ((request.getAction().toLowerCase(Locale.ROOT).replaceAll("\\s", "").equals("correctionneeded"))) {
                        bpm_task = helper.createBPMTask(bpm_task_repository.getNextSeriesId().toString(), "CHANGES NEEDED ON RM REQUEST", "DCS", instance_id, request.getUpdated_by());

                        bpm_task_repository.save(bpm_task);
                    } else {
                        bpm_task = helper.createBPMTask(bpm_task_repository.getNextSeriesId().toString(), "UPDATE NJOYN ID", "OPS", instance_id, request.getUpdated_by());

                        bpm_task_repository.save(bpm_task);

                    }
                    if (request.getBpmWorkNotes() != null) {
                        Bpm_Work_Notes notes = helper.bpm_work_note_entry(request.getBpmWorkNotes(), instance_id, task_id);
                        bpm_work_notes_repository.save(notes);
                    }

                    break;
                case "changesneededonrmrequest":

                    bpm_task_repository.updatebpmtaskstatus(Timestamp.from(Instant.now()), task_id, "SYSTEM");

                    bpm_task = helper.createBPMTask(bpm_task_repository.getNextSeriesId().toString(), "UPDATE SO NUMBER", "OPS", instance_id, request.getUpdated_by());

                    bpm_task_repository.save(bpm_task);


                    if (request.getBpmWorkNotes() != null) {
                        Bpm_Work_Notes notes = helper.bpm_work_note_entry(request.getBpmWorkNotes(), instance_id, task_id);
                        bpm_work_notes_repository.save(notes);
                    }
                    if (request.getRmRequest() != null) {
                        Rm_Request rmRequest = (rm_request_repository.findById(request.getRm_request_id())
                                .orElseThrow(() -> new ResourceNotFoundException("RM Request not found for this id :: " + request.getRm_request_id())));
                        Rm_Request updated_request = helper.mapRmRequest(rmRequest, request.getRmRequest());
                        rm_request_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Request empty in the changes needed on rm request task ");
                    }
                    if (request.getRm_position_info() != null) {
                        Rm_Position_Info_db rm_position_infoDb = (rm_position_info_repository.findById(rm_Info_Id)
                                .orElseThrow(() -> new ResourceNotFoundException("RM Position not found for this id :: " + request.getRm_request_id())));
                        Rm_Position_Info_db updated_request = helper.mapRm_Postion_info(rm_position_infoDb, request.getRm_position_info());
                        rm_position_info_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Position Info empty in the changes needed on rm request task ");
                    }
                    if (request.getRm_position_skillset_info() != null) {
                        String skillsetInfo_id = rm_position_sKillset_info_repository.find_skillset_id(rm_Info_Id);
                        Rm_Position_Skillset_Info_Db rm_position_infoDb = rm_position_sKillset_info_repository.findById(skillsetInfo_id)
                                .orElseThrow(() -> new ResourceNotFoundException("Position Skillset Info not found "));
                        Rm_Position_Skillset_Info_Db updated_request = helper.mapRm_Position_Skillset_Info(rm_position_infoDb, request.getRm_position_skillset_info());
                        rm_position_sKillset_info_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Position Skillset Info empty in the changes needed on rm request task ");
                    }

                    break;
                case "updatenjoynid":
                    bpm_task_repository.updatebpmtaskstatus(Timestamp.from(Instant.now()), task_id, "SYSTEM");
                    if (request.getBpmWorkNotes() != null) {
                        Bpm_Work_Notes notes = helper.bpm_work_note_entry(request.getBpmWorkNotes(), instance_id, task_id);
                        bpm_work_notes_repository.save(notes);
                    }
                    if (request.getRmRequest() != null) {
                        Rm_Request rmRequest = (rm_request_repository.findById(request.getRm_request_id())
                                .orElseThrow(() -> new ResourceNotFoundException("RM Request not found for this id :: " + request.getRm_request_id())));
                        Rm_Request updated_request = helper.mapRmRequest(rmRequest, request.getRmRequest());
                        rm_request_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Request empty in the changes needed on rm request task ");
                    }
                    if (request.getRm_position_info() != null) {
                        Rm_Position_Info_db rm_position_infoDb = (rm_position_info_repository.findById(rm_Info_Id)
                                .orElseThrow(() -> new ResourceNotFoundException("RM Position not found for this id :: " + request.getRm_request_id())));
                        Rm_Position_Info_db updated_request = helper.mapRm_Postion_info(rm_position_infoDb, request.getRm_position_info());
                        rm_position_info_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Position Info empty in the changes needed on rm request task ");
                    }
                    if (request.getRm_position_skillset_info() != null) {
                        String skillsetInfo_id = rm_position_sKillset_info_repository.find_skillset_id(rm_Info_Id);
                        Rm_Position_Skillset_Info_Db rm_position_infoDb = rm_position_sKillset_info_repository.findById(skillsetInfo_id)
                                .orElseThrow(() -> new ResourceNotFoundException("Position Skillset Info not found "));
                        Rm_Position_Skillset_Info_Db updated_request = helper.mapRm_Position_Skillset_Info(rm_position_infoDb, request.getRm_position_skillset_info());
                        rm_position_sKillset_info_repository.save(updated_request);
                    } else {
                        throw new ResourceNotFoundException("RM Position Skillset Info empty in the changes needed on rm request task ");
                    }
                    bpm_instance_repository.completeBpmInstance(Timestamp.from(Instant.now()), request.getUpdated_by(), Timestamp.from(Instant.now()), instance_id);
                    break;

                default:
                    throw new ResourceNotFoundException("Task Name not in the list");
            }

        } catch (Exception e) {
            log.error("Exception Occured while updating tables: ", e);
            throw new UpdateDatabaseException(e.getMessage());
        }
        return "";


    }


}
