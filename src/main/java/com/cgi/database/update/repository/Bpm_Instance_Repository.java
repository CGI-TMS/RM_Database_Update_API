package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Bpm_Instance;
import com.cgi.database.update.entity.Bpm_Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface Bpm_Instance_Repository extends JpaRepository<Bpm_Instance, String> {


    @Query("select instance_id from  bpm_instance u where u.rm_request_id = :rm_request_id")
    String find_instance_id(@Param("rm_request_id") String rm_request_id);
    @Query(value = "SELECT nextval('rm.bpm_task_id_generator')", nativeQuery =
            true)
    Long getNewInstanceId();
    @Modifying
    @Query("update bpm_instance u set u.completed_dt = :completed_dt,u.updated_by = :updated_by,updated_dt = :updated_dt where u.instance_id = :instance_id")
    void completeBpmInstance(@Param("completed_dt") Timestamp completed_dt,@Param("updated_by") String updated_by,@Param("updated_dt") Timestamp date,@Param("instance_id")String instance_id);

}
