package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Bpm_Task;
import com.cgi.database.update.entity.Bpm_Work_Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Bpm_Work_Notes_Repository extends JpaRepository<Bpm_Work_Notes, String> {

    @Query(value = "SELECT nextval('rm.bpm_work_notes_id_generator')", nativeQuery =
            true)
    Long getWork_notes_id();

}
