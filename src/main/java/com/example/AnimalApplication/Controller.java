package com.example.AnimalApplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {

    @GetMapping("/v1/test1")
    public Response hello (@RequestParam(required = false) String param){
        log.info("Request recieved");
        Response response = new Response();
        response.setB("f");
        return response;
    }
}
