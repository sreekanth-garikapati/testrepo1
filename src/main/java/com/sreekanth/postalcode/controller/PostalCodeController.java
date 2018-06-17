package com.sreekanth.postalcode.controller;

import com.sreekanth.postalcode.client.PostalCodeRestClient;
import com.sreekanth.postalcode.controller.resource.PostalCodeSearchResponse;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostalCodeController {


    @GetMapping("postal/search")
    public ResponseEntity<PostalCodeSearchResponse> getPostalCodes() {
        PostalCodeRestClient postalCodeRestClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(PostalCodeRestClient.class))
                .logLevel(Logger.Level.FULL)
                .target(PostalCodeRestClient.class, "https://api.data.gov.in/resource");
        return ResponseEntity.ok(postalCodeRestClient.getPostalCodes());

    }
}
