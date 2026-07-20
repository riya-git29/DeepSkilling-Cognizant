package com.mockitoadvanced.service;

import com.mockitoadvanced.client.RestClient;

public class ApiService {

    private RestClient restClient;

    public ApiService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String fetchData() {
        return "Fetched " + restClient.getResponse();
    }
}