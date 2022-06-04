package com.restapi.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.ClientNotFoundException;
import com.restapi.restservice.entity.Client;
import com.restapi.restservice.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/clients")
	public List<Client> getClients() {

		return clientService.getClients();
	}

	@GetMapping("/clients/{clientId}")
	public Client getClient(@PathVariable int clientId) {

		Client theClient = clientService.getClient(clientId);

		if (theClient == null) {
			throw new ClientNotFoundException("Client id not found - " + clientId);
		}

		return theClient;
	}

	@PostMapping("/clients")
	public Client addClient(@RequestBody Client theClient) {

		theClient.setId(0);

		clientService.saveClient(theClient);

		return theClient;
	}

	@PutMapping("/clients")
	public Client updateClient(@RequestBody Client theClient) {

		clientService.saveClient(theClient);

		return theClient;
	}

	@DeleteMapping("/clients/{clientId}")
	public String deleteClient(@PathVariable int clientId) {

		Client tempClient = clientService.getClient(clientId);

		if (tempClient == null) {
			throw new ClientNotFoundException("Client id not found - " + clientId);
		}

		clientService.deleteClient(clientId);

		return "Deleted client with id = " + clientId;
	}
}
