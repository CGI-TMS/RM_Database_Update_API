package com.cgi.database.update.Models.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.sql.Timestamp;

@Data
@JsonDeserialize
public class RMRequest {
    public String rm_request_id;
    public String project_name;
    public String business_unit_id;
    public String project_cd;
    public String priority_id;
    public String client_name;
    public String hr_dept_cd;
    public Boolean role_confedentiality_flag;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;



}
