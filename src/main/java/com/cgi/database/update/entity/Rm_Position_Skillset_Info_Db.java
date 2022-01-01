package com.cgi.database.update.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity(name = "rm_position_skillset_info")
@Table(name = "rm_position_skillset_info")
public class Rm_Position_Skillset_Info_Db {
    public String skill_set_id;
    public String rm_position_info_id;
    public String years_of_experience;
    public String proficiency_level_id;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;
    @Id
    @Column(name = "skill_set_id", nullable = false)
    public String getSkill_set_id() {
        return skill_set_id;
    }

    public void setSkill_set_id(String skill_set_id) {
        this.skill_set_id = skill_set_id;
    }
    @Column(name = "rm_position_info_id", nullable = true)
    public String getRm_position_info_id() {
        return rm_position_info_id;
    }

    public void setRm_position_info_id(String rm_position_info_id) {
        this.rm_position_info_id = rm_position_info_id;
    }
    @Column(name = "years_of_experience", nullable = true)
    public String getYears_of_experience() {
        return years_of_experience;
    }

    public void setYears_of_experience(String years_of_experience) {
        this.years_of_experience = years_of_experience;
    }
    @Column(name = "proficiency_level_id", nullable = true)
    public String getProficiency_level_id() {
        return proficiency_level_id;
    }

    public void setProficiency_level_id(String proficiency_level_id) {
        this.proficiency_level_id = proficiency_level_id;
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
