package com.cgi.database.update.Models.request;


import com.cgi.database.update.entity.Rm_Position_Info_db;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

@JsonDeserialize
@Data
public class UpdateDatabaseRequest {
    public String action;
    public  String task_status;
    public String task_name;
    public String rm_request_id;
    private String updated_by;
    public BpmWorkNotes bpmWorkNotes;
    public RMRequest rmRequest;
    public Rm_Position_Info rm_position_info;
    public  Rm_Position_Skillset_info rm_position_skillset_info;


}

