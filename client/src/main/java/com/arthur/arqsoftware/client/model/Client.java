package com.arthur.arqsoftware.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String login;

    private String name;

    private Set<Order> orders;
}
