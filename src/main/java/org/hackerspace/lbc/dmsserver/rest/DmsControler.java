package org.hackerspace.lbc.dmsserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DmsControler {

    @GetMapping(path = "/hello")
    public String getHello (){
        return "Hello";
    }
}
