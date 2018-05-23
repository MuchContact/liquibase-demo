package com.example.demo.controller;

import com.example.demo.MyJpa;
import com.example.demo.TableLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MyJpa jpa;

    @RequestMapping(method = RequestMethod.POST)
    public String get() {
        TableLock s = new TableLock();
        s.setUnicode("testa");
        jpa.save(s);
        return "liquibase demo";
    }
}
