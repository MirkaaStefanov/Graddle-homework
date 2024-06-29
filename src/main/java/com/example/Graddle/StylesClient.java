package com.example.Graddle;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "movieClient", url = "https://api.iconfinder.com", configuration = StylesConfig.class)
public interface StylesClient {

    @GetMapping("/v4/styles")
    StylesResponse returnStyles();
}
