package org.hlbc.dms.server.rest;


import org.hlbc.dms.server.api.HslbcDmsApi;
import org.hlbc.dms.server.model.RegisterDeviceRequest;
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
