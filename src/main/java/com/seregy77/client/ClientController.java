package com.seregy77.client;

import com.seregy77.server.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ClientController {

  private final ServerApiClient serverApiClient;

  public ClientController(ServerApiClient serverApiClient) {
    this.serverApiClient = serverApiClient;
  }

  @PostMapping("/client/resources")
  public ResponseEntity<ApiResponse> createResourceViaClient(MultipartFile file, String category,
      int priority) {
    return serverApiClient.createResource(file, category, priority);
  }
}
