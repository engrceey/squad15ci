package com.projectreadiness.projectreadiness.controller;

import com.projectreadiness.projectreadiness.dto.TestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(tags = "anything")
@Slf4j
@RestController
@RequestMapping(path = "test")
public class User {

    // Document
    // APIs
    // Models

    // Logging ==> Log Level

    @ApiOperation(
            value = "perform self bank transfer",
            notes = "initiates self transfer",
            response = String.class
    )
    @GetMapping
   public ResponseEntity<?> fetchCustomerDetails(@RequestBody @Valid TestDto request ) {
        log.info("request received");
        log.warn("this depends on developer");
        log.error("this should be in error blocks");

        // Logging ==> Log Level
        // Info
        // Trace
        // Debug

        return ResponseEntity.ok("Welcome Devs");
    }
}
