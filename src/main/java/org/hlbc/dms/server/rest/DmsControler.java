package org.hlbc.dms.server.rest;

import org.hackerspace.lbc.api.HslbcDmsApi;
import org.hackerspace.lbc.model.RegisterDeviceRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DmsControler implements HslbcDmsApi {

    @GetMapping(path = "/hello")
    public String getHello (){
        return "Hello";
    }

    @Override
    public ResponseEntity<String> hslbcDmsRegisterDevicePost(RegisterDeviceRequest registerDeviceRequestBody) {
        return null;
    }
}
