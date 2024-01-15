package com.sample.configclient.controller;

import com.sample.configclient.model.MyConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final MyConfig myConfig;

    @GetMapping("/config")
    public ResponseEntity<String> config() {
        return ResponseEntity.ok(myConfig.getName());
    }
}
