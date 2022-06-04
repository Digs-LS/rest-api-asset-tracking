package com.restapi.restservice.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restapi.restservice.entity.Client;

@Repository
public class ClientDaoImpl implements ClientDao {

	private EntityManager entityManager;

	@Autowired
	public ClientDaoImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Client> getClients() {

		// get current Hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		// create a query
		Query<Client> theQuery = currentSession.createQuery("from Client", Client.class);

		// execute query and get result list
		List<Client> clients = theQuery.getResultList();

		// return results
		return clients;
	}

	@Override
	public void saveClient(Client theClient) {
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// save/update device
		currentSession.saveOrUpdate(theClient);
	}

	@Override
	public Client getClient(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);

		// retrieve/read from database using the priamry key
		Client theClient = currentSession.get(Client.class, theId);

		return theClient;
	}

	@Override
	public void deleteClient(int theId) {

		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// delete object by using primary key
		Query theQuery = currentSession.createQuery("delete from Client where id=:clientId");
		theQuery.setParameter("clientId", theId);

		theQuery.executeUpdate();
	}

}
