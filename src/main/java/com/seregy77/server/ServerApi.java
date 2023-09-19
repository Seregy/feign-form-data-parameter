package com.seregy77.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

public interface ServerApi {

  @RequestMapping(method = RequestMethod.POST,
      value = "/server/resources",
      produces = {"application/json"},
      consumes = {"multipart/form-data"})
  ResponseEntity<ApiResponse> createResource(@RequestPart(value = "file") MultipartFile file,
      @RequestParam(value = "category", required = false) String category,
      @RequestParam(value = "priority") int priority);
}
