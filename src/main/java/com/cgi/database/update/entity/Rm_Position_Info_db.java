package com.cgi.database.update.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "rm_position_info")
@Table(name = "rm_position_info")
public class Rm_Position_Info_db {
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

    @Id
    @Column(name = "rm_position_info_id", nullable = false)
    public String getRm_position_info_id() {
        return rm_position_info_id;
    }

    public void setRm_position_info_id(String rm_position_info_id) {
        this.rm_position_info_id = rm_position_info_id;
    }

    @Column(name = "rm_request_id", nullable = true)
    public String getRm_request_id() {
        return rm_request_id;
    }

    public void setRm_request_id(String rm_request_id) {
        this.rm_request_id = rm_request_id;
    }

    @Column(name = "requested_date", nullable = true)
    public Date getRequested_date() {
        return requested_date;
    }

    public void setRequested_date(Date requested_date) {
        this.requested_date = requested_date;
    }

    @Column(name = "billablity_type_flag", nullable = true)
    public Boolean getBillablity_type_flag() {
        return billablity_type_flag;
    }

    public void setBillablity_type_flag(Boolean billablity_type_flag) {
        this.billablity_type_flag = billablity_type_flag;
    }

    @Column(name = "start_date", nullable = true)
    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    @Column(name = "end_date", nullable = true)
    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    @Column(name = "position_tittle_id", nullable = true)
    public String getPosition_tittle_id() {
        return position_tittle_id;
    }

    public void setPosition_tittle_id(String position_tittle_id) {
        this.position_tittle_id = position_tittle_id;
    }

    @Column(name = "position_type_id", nullable = true)
    public String getPosition_type_id() {
        return position_type_id;
    }

    public void setPosition_type_id(String position_type_id) {
        this.position_type_id = position_type_id;
    }

    @Column(name = "cgi_designation_id", nullable = true)
    public String getCgi_designation_id() {
        return cgi_designation_id;
    }

    public void setCgi_designation_id(String cgi_designation_id) {
        this.cgi_designation_id = cgi_designation_id;
    }

    @Column(name = "job_id", nullable = true)
    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    @Column(name = "total_req_resources", nullable = true)
    public String getTotal_req_resources() {
        return total_req_resources;
    }

    public void setTotal_req_resources(String total_req_resources) {
        this.total_req_resources = total_req_resources;
    }

    @Column(name = "travel_requirement_id", nullable = true)
    public String getTravel_requirement_id() {
        return travel_requirement_id;
    }

    public void setTravel_requirement_id(String travel_requirement_id) {
        this.travel_requirement_id = travel_requirement_id;
    }

    @Column(name = "resource_type_id", nullable = true)
    public String getResource_type_id() {
        return resource_type_id;
    }

    public void setResource_type_id(String resource_type_id) {
        this.resource_type_id = resource_type_id;
    }

    @Column(name = "work_location_id", nullable = true)
    public String getWork_location_id() {
        return work_location_id;
    }

    public void setWork_location_id(String work_location_id) {
        this.work_location_id = work_location_id;
    }

    @Column(name = "center_of_excellence_id", nullable = true)
    public String getCenter_of_excellence_id() {
        return center_of_excellence_id;
    }

    public void setCenter_of_excellence_id(String center_of_excellence_id) {
        this.center_of_excellence_id = center_of_excellence_id;
    }

    @Column(name = "work_location_address", nullable = true)
    public String getWork_location_address() {
        return work_location_address;
    }

    public void setWork_location_address(String work_location_address) {
        this.work_location_address = work_location_address;
    }

    @Column(name = "salary_range", nullable = true)
    public String getSalary_range() {
        return salary_range;
    }

    public void setSalary_range(String salary_range) {
        this.salary_range = salary_range;
    }

    @Column(name = "work_location_state", nullable = true)
    public String getWork_location_state() {
        return work_location_state;
    }

    public void setWork_location_state(String work_location_state) {
        this.work_location_state = work_location_state;
    }

    @Column(name = "payment_type_id", nullable = true)
    public String getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(String payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    @Column(name = "offer_relocation_comp_flag", nullable = true)
    public Boolean getOffer_relocation_comp_flag() {
        return offer_relocation_comp_flag;
    }

    public void setOffer_relocation_comp_flag(Boolean offer_relocation_comp_flag) {
        this.offer_relocation_comp_flag = offer_relocation_comp_flag;
    }

    @Column(name = "travelers_accepted_flag", nullable = true)
    public Boolean getTravelers_accepted_flag() {
        return travelers_accepted_flag;
    }

    public void setTravelers_accepted_flag(Boolean travelers_accepted_flag) {
        this.travelers_accepted_flag = travelers_accepted_flag;
    }

    @Column(name = "remote_acceptance_id", nullable = true)
    public String getRemote_acceptance_id() {
        return remote_acceptance_id;
    }

    public void setRemote_acceptance_id(String remote_acceptance_id) {
        this.remote_acceptance_id = remote_acceptance_id;
    }

    @Column(name = "hiring_manager_id", nullable = true)
    public String getHiring_manager_id() {
        return hiring_manager_id;
    }

    public void setHiring_manager_id(String hiring_manager_id) {
        this.hiring_manager_id = hiring_manager_id;
    }

    @Column(name = "poc_contact_method_id", nullable = true)
    public String getPoc_contact_method_id() {
        return poc_contact_method_id;
    }

    public void setPoc_contact_method_id(String poc_contact_method_id) {
        this.poc_contact_method_id = poc_contact_method_id;
    }

    @Column(name = "poc_oth_thn_hm_name", nullable = true)
    public String getPoc_oth_thn_hm_name() {
        return poc_oth_thn_hm_name;
    }

    public void setPoc_oth_thn_hm_name(String poc_oth_thn_hm_name) {
        this.poc_oth_thn_hm_name = poc_oth_thn_hm_name;
    }

    @Column(name = "int_hires_sponsorship_flag", nullable = true)
    public Boolean getInt_hires_sponsorship_flag() {
        return int_hires_sponsorship_flag;
    }

    public void setInt_hires_sponsorship_flag(Boolean int_hires_sponsorship_flag) {
        this.int_hires_sponsorship_flag = int_hires_sponsorship_flag;
    }

    @Column(name = "request_type_id", nullable = true)
    public String getRequest_type_id() {
        return request_type_id;
    }

    public void setRequest_type_id(String request_type_id) {
        this.request_type_id = request_type_id;
    }

    @Column(name = "application_mnemonic", nullable = true)
    public String getApplication_mnemonic() {
        return application_mnemonic;
    }

    public void setApplication_mnemonic(String application_mnemonic) {
        this.application_mnemonic = application_mnemonic;
    }

    @Column(name = "client_cio", nullable = true)
    public String getClient_cio() {
        return client_cio;
    }

    public void setClient_cio(String client_cio) {
        this.client_cio = client_cio;
    }

    @Column(name = "client_hiring_manager", nullable = true)
    public String getClient_hiring_manager() {
        return client_hiring_manager;
    }

    public void setClient_hiring_manager(String client_hiring_manager) {
        this.client_hiring_manager = client_hiring_manager;
    }

    @Column(name = "client_rate_card", nullable = true)
    public String getClient_rate_card() {
        return client_rate_card;
    }

    public void setClient_rate_card(String client_rate_card) {
        this.client_rate_card = client_rate_card;
    }

    @Column(name = "confidence_level", nullable = true)
    public String getConfidence_level() {
        return confidence_level;
    }

    public void setConfidence_level(String confidence_level) {
        this.confidence_level = confidence_level;
    }

    @Column(name = "additional_comments", nullable = true)
    public String getAdditional_comments() {
        return additional_comments;
    }

    public void setAdditional_comments(String additional_comments) {
        this.additional_comments = additional_comments;
    }

    @Column(name = "created_by", nullable = true)
    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Column(name = "created_ts", nullable = true)
    public Timestamp getCreated_ts() {
        return created_ts;
    }

    public void setCreated_ts(Timestamp created_ts) {
        this.created_ts = created_ts;
    }

    @Column(name = "updated_by", nullable = true)
    public String getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }

    @Column(name = "updated_ts", nullable = true)
    public Timestamp getUpdated_ts() {
        return updated_ts;
    }

    public void setUpdated_ts(Timestamp updated_ts) {
        this.updated_ts = updated_ts;
    }


}
