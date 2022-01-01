package com.cgi.database.update.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity(name = "bpm_instance")
@Table(name = "bpm_instance")
public class Bpm_Instance {
    public String instance_id;
    public String instance_name;
    public String instance_status;
    public Timestamp due_dt;
    public Timestamp completed_dt;
    public String user_initiated;
    public String rm_request_id;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;
    @Id
    @Column(name = "instance_id", nullable = false)
    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }
    @Column(name = "instance_name", nullable = true)
    public String getInstance_name() {
        return instance_name;
    }

    public void setInstance_name(String instance_name) {
        this.instance_name = instance_name;
    }
    @Column(name = "instance_status", nullable = true)
    public String getInstance_status() {
        return instance_status;
    }

    public void setInstance_status(String instance_status) {
        this.instance_status = instance_status;
    }
    @Column(name = "due_dt", nullable = true)
    public Timestamp getDue_dt() {
        return due_dt;
    }

    public void setDue_dt(Timestamp due_dt) {
        this.due_dt = due_dt;
    }
    @Column(name = "completed_dt", nullable = true)
    public Timestamp getCompleted_dt() {
        return completed_dt;
    }

    public void setCompleted_dt(Timestamp completed_dt) {
        this.completed_dt = completed_dt;
    }
    @Column(name = "user_initiated", nullable = true)
    public String getUser_initiated() {
        return user_initiated;
    }

    public void setUser_initiated(String user_initiated) {
        this.user_initiated = user_initiated;
    }
    @Column(name = "rm_request_id", nullable = true)
    public String getRm_request_id() {
        return rm_request_id;
    }

    public void setRm_request_id(String rm_request_id) {
        this.rm_request_id = rm_request_id;
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
