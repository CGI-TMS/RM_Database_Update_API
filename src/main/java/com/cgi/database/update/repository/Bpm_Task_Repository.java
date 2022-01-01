package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Bpm_Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
@Repository
public interface Bpm_Task_Repository extends JpaRepository<Bpm_Task,String> {
    @Modifying
    @Query("update bpm_task u set u.task_status = 'COMPLETE',u.updated_by = :updated_by,updated_dt = :updated_dt where u.task_id = :task_id")
    void updatebpmtaskstatus(@Param("updated_dt") Timestamp date,@Param("task_id")String task_id,@Param("updated_by") String updated_by);

    @Query("select task_id from  bpm_task u where u.task_name = :task_name")
    String findtaskid(@Param("task_name") String task_name);


    @Query(value = "SELECT nextval('rm.bpm_task_id_generator')", nativeQuery =
            true)
    Long getNextSeriesId();


}
