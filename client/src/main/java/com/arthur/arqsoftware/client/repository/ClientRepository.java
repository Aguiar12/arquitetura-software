package com.arthur.arqsoftware.client.repository;

import com.arthur.arqsoftware.client.model.Client;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ClientRepository {
    private final Map<String, Client> clientsDatabase = new ConcurrentHashMap<>();

    public Client save(Client client) {
        return this.clientsDatabase.put(client.getLogin(), client);
    }

    public Client findByLogin(String login) {
        return this.clientsDatabase.getOrDefault(login, null);
    }
}
