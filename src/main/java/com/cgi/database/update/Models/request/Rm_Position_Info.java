package com.cgi.database.update.Models.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@JsonDeserialize
public class Rm_Position_Info {

    public String rm_position_info_id;
    public String rm_request_id;
    public Date requested_date;
    public Boolean billablity_type_flag;
    public Date start_date;
    public Date end_date;
    public String position_tittle_id;
    public String position_type_id;
    public String cgi_designation_id;
    public String job_id;
    public String total_req_resources;
    public String travel_requirement_id;
    public String resource_type_id;
    public String work_location_id;
    public String center_of_excellence_id;
    public String work_location_address;
    public String salary_range;
    public String work_location_state;
    public String payment_type_id;
    public Boolean offer_relocation_comp_flag;
    public Boolean travelers_accepted_flag;
    public String remote_acceptance_id;
    public String hiring_manager_id;
    public String poc_contact_method_id;
    public String poc_oth_thn_hm_name;
    public Boolean int_hires_sponsorship_flag;
    public String request_type_id;
    public String application_mnemonic;
    public String client_cio;
    public String client_hiring_manager;
    public String client_rate_card;
    public String confidence_level;
    public String additional_comments;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;


}
