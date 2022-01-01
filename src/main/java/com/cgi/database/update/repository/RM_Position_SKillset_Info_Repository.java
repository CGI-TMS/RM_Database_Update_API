package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Rm_Position_Skillset_Info_Db;
import com.cgi.database.update.entity.Rm_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RM_Position_SKillset_Info_Repository extends JpaRepository<Rm_Position_Skillset_Info_Db, String> {

    @Query("select skill_set_id from  rm_position_skillset_info u where u.rm_position_info_id = :rm_position_info_id")
    String find_skillset_id(@Param("rm_position_info_id") String rm_position_info_id);
}
