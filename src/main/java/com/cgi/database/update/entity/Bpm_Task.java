package com.cgi.database.update.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "bpm_task")
@Table(name = "bpm_task")
public class Bpm_Task {
    public String task_id;
    public String task_name;
    public String priority;
    public String task_status;
    public String user_assigned;
    public String group_assigned;
    public Timestamp task_due_dt;
    public String instance_id;
    public String task_reassigned_to_group;
    public Timestamp task_reassigned_dt;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_dt;


    @Id
    @Column(name = "task_id", nullable = false)
    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    @Column(name = "task_name", nullable = true)
    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    @Column(name = "priority", nullable = true)
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Column(name = "task_status", nullable = true)
    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    @Column(name = "user_assigned", nullable = true)
    public String getUser_assigned() {
        return user_assigned;
    }

    public void setUser_assigned(String user_assigned) {
        this.user_assigned = user_assigned;
    }

    @Column(name = "group_assigned", nullable = true)
    public String getGroup_assigned() {
        return group_assigned;
    }

    public void setGroup_assigned(String group_assigned) {
        this.group_assigned = group_assigned;
    }

    @Column(name = "task_due_dt", nullable = true)
    public Timestamp getTask_due_dt() {
        return task_due_dt;
    }

    public void setTask_due_dt(Timestamp task_due_dt) {
        this.task_due_dt = task_due_dt;
    }

    @Column(name = "instance_id", nullable = true)
    public String getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }

    @Column(name = "task_reassigned_to_group", nullable = true)
    public String getTask_reassigned_to_group() {
        return task_reassigned_to_group;
    }

    public void setTask_reassigned_to_group(String task_reassigned_to_group) {
        this.task_reassigned_to_group = task_reassigned_to_group;
    }

    @Column(name = "task_reassigned_dt", nullable = true)
    public Timestamp getTask_reassigned_dt() {
        return task_reassigned_dt;
    }

    public void setTask_reassigned_dt(Timestamp task_reassigned_dt) {
        this.task_reassigned_dt = task_reassigned_dt;
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

    @Column(name = "updated_dt", nullable = true)
    public Timestamp getUpdated_dt() {
        return updated_dt;
    }

    public void setUpdated_dt(Timestamp updated_dt) {
        this.updated_dt = updated_dt;
    }


}
