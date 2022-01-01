package com.cgi.database.update.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity(name = "bpm_work_notes")
@Table(name = "bpm_work_notes")
public class Bpm_Work_Notes {
    public String work_note_id;
    public String work_note;
    public String user_id;
    public String user_name;
    public String instance_id;
    public String task_id;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;

    @Id
    @Column(name = "work_note_id", nullable = false)
    public String getWork_note_id() {
        return work_note_id;
    }

    public void setWork_note_id(String work_note_id) {
        this.work_note_id = work_note_id;
    }
    @Column(name = "work_note", nullable = true)
    public String getWork_note() {
        return work_note;
    }

    public void setWork_note(String work_note) {
        this.work_note = work_note;
    }
    @Column(name = "user_id", nullable = true)
    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    @Column(name = "user_name", nullable = true)
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    @Column(name = "instance_id", nullable = true)
    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }
    @Column(name = "task_id", nullable = true)
    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
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
