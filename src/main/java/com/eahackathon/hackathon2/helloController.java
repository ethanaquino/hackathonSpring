package com.eahackathon.hackathon2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @Autowired
    helloService helloService;

        @RequestMapping("/hello")
        public ResponseEntity<String> getHello() {
            return ResponseEntity.ok(helloService.hello());
        }
}
