package com.eahackathon.hackathon2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

        @RequestMapping("/hello")
        public ResponseEntity<String> getHello() {
            return ResponseEntity.ok(new helloService().hello());
        }
}
