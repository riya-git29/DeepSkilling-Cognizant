package com.mockitoadvanced.service;

import com.mockitoadvanced.client.NetworkClient;

public class NetworkService {

    private NetworkClient networkClient;

    public NetworkService(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    public String connectToServer() {
        return "Connected to " + networkClient.connect();
    }
}