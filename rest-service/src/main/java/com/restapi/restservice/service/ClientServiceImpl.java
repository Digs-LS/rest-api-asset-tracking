package com.restapi.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.restservice.dao.ClientDao;
import com.restapi.restservice.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Override
	@Transactional
	public List<Client> getClients() {
		return clientDao.getClients();
	}

	@Override
	@Transactional
	public void saveClient(Client theClient) {
		clientDao.saveClient(theClient);
	}

	@Override
	@Transactional
	public Client getClient(int theId) {
		return clientDao.getClient(theId);
	}

	@Override
	@Transactional
	public void deleteClient(int theId) {

		clientDao.deleteClient(theId);
	}

}
