package com.arthur.arqsoftware.client.service;

import com.arthur.arqsoftware.client.model.Client;
import com.arthur.arqsoftware.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(String login, String name) {
        Client newClient = Client.builder().login(login).name(name).build();
        return this.clientRepository.save(newClient);
    }

    public Client findByLogin(String login) {
        return this.clientRepository.findByLogin(login);
    }
}
