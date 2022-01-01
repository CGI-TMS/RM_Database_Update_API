package com.cgi.database.update.service;

import com.cgi.database.update.Models.request.UpdateDatabaseRequest;
import com.cgi.database.update.exception.UpdateDatabaseException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service

public interface UpdateDatabaseService {
    public String updateDB(UpdateDatabaseRequest updateDatabaseRequest) throws UpdateDatabaseException;

}

