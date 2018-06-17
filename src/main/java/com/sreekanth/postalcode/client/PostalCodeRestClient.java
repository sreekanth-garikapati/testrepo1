package com.sreekanth.postalcode.client;

import com.sreekanth.postalcode.controller.resource.PostalCodeSearchResponse;
import feign.Headers;
import feign.RequestLine;

public interface PostalCodeRestClient {

    @RequestLine("GET /6176ee09-3d56-4a3b-8115-21841576b2f6?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=json&offset=0&limit=1000")
    @Headers("Content-Type: application/json")
    PostalCodeSearchResponse getPostalCodes();
}
