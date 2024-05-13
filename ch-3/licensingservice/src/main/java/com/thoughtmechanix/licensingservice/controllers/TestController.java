package com.thoughtmechanix.licensingservice.controllers;

import com.thoughtmechanix.licensingservice.config.ServiceConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class TestController {
    private final ServiceConfig serviceConfig;

    @GetMapping(value = "/test")
    public String testEndpoint() {
        return "Example property:" + serviceConfig.getExampleProperty();
    }
}
