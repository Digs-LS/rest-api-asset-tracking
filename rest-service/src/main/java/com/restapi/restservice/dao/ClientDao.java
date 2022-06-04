package com.restapi.restservice.dao;

import java.util.List;

import com.restapi.restservice.entity.Client;

public interface ClientDao {

	public List<Client> getClients();

	public void saveClient(Client theClient);

	public Client getClient(int theId);

	public void deleteClient(int theId);

}
