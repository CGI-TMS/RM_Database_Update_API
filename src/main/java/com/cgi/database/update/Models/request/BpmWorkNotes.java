package com.cgi.database.update.Models.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

@Data
@JsonDeserialize
public class BpmWorkNotes {
    public String work_note_id;
    public String work_note;
    public String user_id;
    public String user_name;
    public String created_by;
    public String updated_by;


}
