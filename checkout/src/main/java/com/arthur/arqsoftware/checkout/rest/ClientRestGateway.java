package com.arthur.arqsoftware.checkout.rest;

import com.arthur.arqsoftware.checkout.dto.ClientResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientRestGateway {
    private static final String GET_URI = "%s/clients/%s";
    private RestTemplate restTemplate;
    private String clientServiceUrl;

    public ClientRestGateway(RestTemplate restTemplate, @Value("rest.services.client.url") String clientServiceUrl) {
        this.restTemplate = restTemplate;
        this.clientServiceUrl = clientServiceUrl;
    }

    public ClientResponse getClientInfo(String login) {
        return this.restTemplate.getForObject(buildURI(login), ClientResponse.class);
    }

    private String buildURI(String login) {
        return String.format(GET_URI, clientServiceUrl, login);
    }

}
