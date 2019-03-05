package com.hibernate.webapp.controller;

import com.hibernate.webapp.dynamicSegments.DynamicSegment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DynamicSegmentController {

    @PostMapping(value = "/segment")
    public ResponseEntity createSegment(@RequestBody DynamicSegment segment) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
