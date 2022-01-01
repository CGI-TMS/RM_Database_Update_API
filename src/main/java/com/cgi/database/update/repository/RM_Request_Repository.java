package com.cgi.database.update.repository;

import com.cgi.database.update.entity.Bpm_Task;
import com.cgi.database.update.entity.Rm_Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RM_Request_Repository extends JpaRepository<Rm_Request, String> {


}
