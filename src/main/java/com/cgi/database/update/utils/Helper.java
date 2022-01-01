package com.cgi.database.update.utils;

import com.cgi.database.update.Models.request.BpmWorkNotes;
import com.cgi.database.update.Models.request.RMRequest;
import com.cgi.database.update.Models.request.Rm_Position_Info;
import com.cgi.database.update.Models.request.Rm_Position_Skillset_info;
import com.cgi.database.update.entity.*;
import com.cgi.database.update.repository.Bpm_Work_Notes_Repository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;

@Component

public class Helper {
    @Autowired
    private Bpm_Work_Notes_Repository bpm_work_notes_repository;

    public Bpm_Task createBPMTask(String task_id, String task_name, String group_name, String instance_id, String updated_by) {
        Bpm_Task bpm_task = new Bpm_Task();
        bpm_task.setTask_id(task_id);
        bpm_task.setTask_name(task_name);
        bpm_task.setTask_status("ACTIVE");
        bpm_task.setGroup_assigned(group_name);
        bpm_task.setInstance_id(instance_id);
        bpm_task.setCreated_by("SYSTEM");
        bpm_task.setCreated_ts(Timestamp.from(Instant.now()));
        bpm_task.setUpdated_by(updated_by);
        bpm_task.setUpdated_dt(Timestamp.from(Instant.now()));
        return bpm_task;
    }

    public Bpm_Work_Notes bpm_work_note_entry(BpmWorkNotes bpmWorkNotes, String instance_id, String task_id) {
        Bpm_Work_Notes request = new Bpm_Work_Notes();
        request.setWork_note_id(bpm_work_notes_repository.getWork_notes_id().toString());
        request.setWork_note(bpmWorkNotes.getWork_note());
        request.setUser_id(bpmWorkNotes.getUser_id());
        request.setUser_name(bpmWorkNotes.getUser_name());
        request.setInstance_id(instance_id);
        request.setTask_id(task_id);
        request.setCreated_by(bpmWorkNotes.getCreated_by());
        request.setCreated_ts(Timestamp.from(Instant.now()));
        request.setUpdated_by(bpmWorkNotes.getUpdated_by());
        request.setUpdated_ts(Timestamp.from(Instant.now()));
        return request;
    }

    public Rm_Request mapRmRequest(Rm_Request RmdbData, RMRequest request) {

        RmdbData.setProject_name(request.getProject_name());
        RmdbData.setBusiness_unit_id(request.getBusiness_unit_id());
        RmdbData.setProject_cd(request.getProject_cd());
        RmdbData.setPriority_id(request.getPriority_id());
        RmdbData.setClient_name(request.getClient_name());
        RmdbData.setHr_dept_cd(request.getHr_dept_cd());
        RmdbData.setRole_confedentiality_flag(request.getRole_confedentiality_flag());
        RmdbData.setUpdated_by(request.getUpdated_by());
        RmdbData.setUpdated_ts(Timestamp.from(Instant.now()));
        return RmdbData;


    }

    public Rm_Position_Info_db mapRm_Postion_info(Rm_Position_Info_db databaseRequest, Rm_Position_Info rm_position_info) {

        if (rm_position_info.getRequested_date() != null) {
            databaseRequest.setRequested_date(rm_position_info.getRequested_date());
        }
        if (rm_position_info.getBillablity_type_flag() != null) {
            databaseRequest.setBillablity_type_flag(rm_position_info.getBillablity_type_flag());
        }
        if (rm_position_info.getStart_date() != null) {
            databaseRequest.setStart_date(rm_position_info.getStart_date());
        }
        if (rm_position_info.getEnd_date() != null) {
            databaseRequest.setEnd_date(rm_position_info.getEnd_date());
        }
        if (rm_position_info.getPosition_tittle_id() != null) {
            databaseRequest.setPosition_tittle_id(rm_position_info.getPosition_tittle_id());
        }
        if (rm_position_info.getPosition_type_id() != null) {
            databaseRequest.setPosition_type_id(rm_position_info.getPosition_type_id());
        }
        if (rm_position_info.getPosition_type_id() != null) {
            databaseRequest.setPosition_type_id(rm_position_info.getPosition_type_id());
        }
        if (rm_position_info.getCgi_designation_id() != null) {
            databaseRequest.setCgi_designation_id(rm_position_info.getCgi_designation_id());
        }
        if (rm_position_info.getJob_id() != null) {
            databaseRequest.setJob_id(rm_position_info.getJob_id());
        }
        if (rm_position_info.getTotal_req_resources() != null) {
            databaseRequest.setTotal_req_resources(rm_position_info.getTotal_req_resources());
        }
        if (rm_position_info.getTravel_requirement_id() != null) {
            databaseRequest.setTravel_requirement_id(rm_position_info.getTravel_requirement_id());
        }
        if (rm_position_info.getResource_type_id() != null) {
            databaseRequest.setResource_type_id(rm_position_info.getResource_type_id());
        }
        if (rm_position_info.getWork_location_id() != null) {
            databaseRequest.setWork_location_id(rm_position_info.getWork_location_id());
        }
        if (rm_position_info.getCenter_of_excellence_id() != null) {
            databaseRequest.setCenter_of_excellence_id(rm_position_info.getCenter_of_excellence_id());
        }
        if (rm_position_info.getWork_location_address() != null) {
            databaseRequest.setWork_location_address(rm_position_info.getWork_location_address());
        }
        if (rm_position_info.getSalary_range() != null) {
            databaseRequest.setSalary_range(rm_position_info.getSalary_range());
        }
        if (rm_position_info.getWork_location_state() != null) {
            databaseRequest.setWork_location_state(rm_position_info.getWork_location_state());
        }
        if (rm_position_info.getPayment_type_id() != null) {
            databaseRequest.setPayment_type_id(rm_position_info.getPayment_type_id());
        }
        if (rm_position_info.getOffer_relocation_comp_flag() != null) {
            databaseRequest.setOffer_relocation_comp_flag(rm_position_info.getOffer_relocation_comp_flag());
        }
        if (rm_position_info.getTravelers_accepted_flag() != null) {
            databaseRequest.setTravelers_accepted_flag(rm_position_info.getTravelers_accepted_flag());
        }
        if (rm_position_info.getRemote_acceptance_id() != null) {
            databaseRequest.setRemote_acceptance_id(rm_position_info.getRemote_acceptance_id());
        }

        if (rm_position_info.getHiring_manager_id() != null) {
            databaseRequest.setHiring_manager_id(rm_position_info.getHiring_manager_id());
        }
        if (rm_position_info.getPoc_contact_method_id() != null) {
            databaseRequest.setPoc_contact_method_id(rm_position_info.getPoc_contact_method_id());
        }
        if (rm_position_info.getPoc_oth_thn_hm_name() != null) {
            databaseRequest.setPoc_oth_thn_hm_name(rm_position_info.getPoc_oth_thn_hm_name());
        }
        if (rm_position_info.getInt_hires_sponsorship_flag() != null) {
            databaseRequest.setInt_hires_sponsorship_flag(rm_position_info.getInt_hires_sponsorship_flag());
        }
        if (rm_position_info.getRequest_type_id() != null) {
            databaseRequest.setRequest_type_id(rm_position_info.getRequest_type_id());
        }
        if (rm_position_info.getApplication_mnemonic() != null) {
            databaseRequest.setApplication_mnemonic(rm_position_info.getApplication_mnemonic());
        }
        if (rm_position_info.getClient_cio() != null) {
            databaseRequest.setClient_cio(rm_position_info.getClient_cio());
        }
        if (rm_position_info.getClient_hiring_manager() != null) {
            databaseRequest.setClient_hiring_manager(rm_position_info.getClient_hiring_manager());
        }
        if (rm_position_info.getClient_rate_card() != null) {
            databaseRequest.setClient_rate_card(rm_position_info.getClient_rate_card());
        }
        if (rm_position_info.getConfidence_level() != null) {
            databaseRequest.setConfidence_level(rm_position_info.getConfidence_level());
        }
        if (rm_position_info.getAdditional_comments() != null) {
            databaseRequest.setAdditional_comments(rm_position_info.getAdditional_comments());
        }
        if (rm_position_info.getCreated_by() != null) {
            databaseRequest.setCreated_by(rm_position_info.getCreated_by());
        }
        if (rm_position_info.getCreated_ts() != null) {
            databaseRequest.setCreated_ts(rm_position_info.getCreated_ts());
        }
        if (rm_position_info.getUpdated_by() != null) {
            databaseRequest.setUpdated_by(rm_position_info.getUpdated_by());
        }

        databaseRequest.setUpdated_ts(Timestamp.from(Instant.now()));


        return databaseRequest;
    }

    public Rm_Position_Skillset_Info_Db mapRm_Position_Skillset_Info(Rm_Position_Skillset_Info_Db databaseRequest, Rm_Position_Skillset_info rm_position_skillset_info) {
        if (rm_position_skillset_info.getSkill_set_id() != null) {
            databaseRequest.setSkill_set_id(rm_position_skillset_info.getSkill_set_id());
        }
        if (rm_position_skillset_info.getRm_position_info_id() != null) {
            databaseRequest.setRm_position_info_id(rm_position_skillset_info.getRm_position_info_id());
        }
        if (rm_position_skillset_info.getYears_of_experience() != null) {
            databaseRequest.setYears_of_experience(rm_position_skillset_info.getYears_of_experience());
        }
        if (rm_position_skillset_info.getProficiency_level_id() != null) {
            databaseRequest.setProficiency_level_id(rm_position_skillset_info.getProficiency_level_id());
        }
        if (rm_position_skillset_info.getCreated_by() != null) {
            databaseRequest.setCreated_by(rm_position_skillset_info.getCreated_by());
        }
        if (rm_position_skillset_info.getUpdated_by() != null) {
            databaseRequest.setUpdated_by(rm_position_skillset_info.getUpdated_by());
        }
        databaseRequest.setUpdated_ts(Timestamp.from(Instant.now()));
        return databaseRequest;
    }
}
