package com.restapi.restservice.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restapi.restservice.entity.Device;

@Repository
public class DeviceDaoImpl implements DeviceDao {

	private EntityManager entityManager;

	// using constructor injection
	@Autowired
	public DeviceDaoImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Device> getDevices() {

		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Device> theQuery = currentSession.createQuery("from Device", Device.class);

		// execute query and get result list
		List<Device> devices = theQuery.getResultList();

		// return results
		return devices;

	}

	@Override
	public void saveDevice(Device theDevice) {

		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// save/update device
		currentSession.saveOrUpdate(theDevice);
	}

	@Override
	public void deleteDevice(int theId) {

		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// delete object by using primary key
		Query theQuery = currentSession.createQuery("delete from Device where id=:deviceId");
		theQuery.setParameter("deviceId", theId);

		theQuery.executeUpdate();
	}

	@Override
	public Device getDevice(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		// retrieve/read from database using the priamry key
		Device theDevice = currentSession.get(Device.class, theId);

		return theDevice;
	}

}
