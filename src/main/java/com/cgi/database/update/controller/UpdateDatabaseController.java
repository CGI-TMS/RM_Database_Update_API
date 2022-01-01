package com.cgi.database.update.controller;


import com.cgi.database.update.Models.request.UpdateDatabaseRequest;
import com.cgi.database.update.exception.UpdateDatabaseException;
import com.cgi.database.update.service.UpdateDatabaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@Slf4j
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UpdateDatabaseController {
    private UpdateDatabaseService service;


    @PostMapping("/update/db")
    public ResponseEntity updateDB(
            @RequestBody UpdateDatabaseRequest updateDatabaseRequest) throws UpdateDatabaseException {
        return new ResponseEntity(service.updateDB(updateDatabaseRequest), HttpStatus.OK);

    }



}
