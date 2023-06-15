package com.arthur.arqsoftware.client.controller;

import com.arthur.arqsoftware.client.model.Client;
import com.arthur.arqsoftware.client.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("{login}")
    public ResponseEntity<Client> getByLogin(@PathVariable("login") String login) {
        Client client = clientService.findByLogin(login);

        if (Objects.isNull(client)) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(client);
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody CreateClientRequest request) {
        Client client = clientService.createClient(request.getLogin(), request.getName());
        return ResponseEntity.ok(client);
    }

}
