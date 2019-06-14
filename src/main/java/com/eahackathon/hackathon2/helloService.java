package com.eahackathon.hackathon2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class helloService {
    public String hello() {
        return "Hello World";
    }
}
