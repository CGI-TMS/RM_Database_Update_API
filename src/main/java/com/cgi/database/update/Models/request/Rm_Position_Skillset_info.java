package com.cgi.database.update.Models.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@JsonDeserialize
public class Rm_Position_Skillset_info {
    public String skill_set_id;
    public String rm_position_info_id;
    public String years_of_experience;
    public String proficiency_level_id;
    public String created_by;
    public Timestamp created_ts;
    public String updated_by;
    public Timestamp updated_ts;

}
