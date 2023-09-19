package com.seregy77.server;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ServerController implements ServerApi {

  @Autowired
  private HttpServletRequest httpServletRequest;

  @Override
  public ResponseEntity<ApiResponse> createResource(MultipartFile file, String category,
      int priority) {
    String queryString = httpServletRequest.getQueryString();
    ApiResponse response = new ApiResponse(
        String.format("Received file '%s' with category '%s' and priority '%s', query string was '%s'",
            file.getOriginalFilename(), category, priority, queryString));

    return ResponseEntity.ok(response);
  }
}
