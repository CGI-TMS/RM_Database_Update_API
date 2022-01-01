package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Rm_Position_Info_db;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RM_Position_Info_Repository extends JpaRepository<Rm_Position_Info_db, String> {
    @Query("select rm_position_info_id from  rm_position_info u where u.rm_request_id = :rm_request_id")
    String findRm_Position_Info_Id(@Param("rm_request_id") String rm_request_id);

}
