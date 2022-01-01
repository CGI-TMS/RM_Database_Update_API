package com.cgi.database.update.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity(name = "rm_request")
@Table(name = "rm_request")
public class Rm_Request {
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

    @Id
    @Column(name = "rm_request_id", nullable = true)
    public String getRm_request_id() {
        return rm_request_id;
    }

    public void setRm_request_id(String rm_request_id) {
        this.rm_request_id = rm_request_id;
    }
    @Column(name = "project_name", nullable = true)
    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    @Column(name = "business_unit_id", nullable = true)
    public String getBusiness_unit_id() {
        return business_unit_id;
    }

    public void setBusiness_unit_id(String business_unit_id) {
        this.business_unit_id = business_unit_id;
    }
    @Column(name = "project_cd", nullable = true)
    public String getProject_cd() {
        return project_cd;
    }

    public void setProject_cd(String project_cd) {
        this.project_cd = project_cd;
    }
    @Column(name = "priority_id", nullable = true)
    public String getPriority_id() {
        return priority_id;
    }

    public void setPriority_id(String priority_id) {
        this.priority_id = priority_id;
    }
    @Column(name = "client_name", nullable = true)
    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
    @Column(name = "hr_dept_cd", nullable = true)
    public String getHr_dept_cd() {
        return hr_dept_cd;
    }

    public void setHr_dept_cd(String hr_dept_cd) {
        this.hr_dept_cd = hr_dept_cd;
    }
    @Column(name = "role_confedentiality_flag", nullable = true)
    public Boolean getRole_confedentiality_flag() {
        return role_confedentiality_flag;
    }

    public void setRole_confedentiality_flag(Boolean role_confedentiality_flag) {
        this.role_confedentiality_flag = role_confedentiality_flag;
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
