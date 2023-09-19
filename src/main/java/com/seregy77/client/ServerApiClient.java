package com.seregy77.client;

import com.seregy77.server.ServerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "${app.client.url}", name = "server-api-client")
public interface ServerApiClient extends ServerApi {

}
