package com.restapi.restservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restapi.restservice.entity.Device;

@Repository
public class DeviceDaoImpl implements DeviceDao{

	// inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Device> getDevices() {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Device> theQuery = currentSession.createQuery("from Device", Device.class);
		
		// execute query and get result lis
		List<Device> devices = theQuery.getResultList();
		
		// return results
		return devices;
		
	}

	@Override
	public void saveDevice(Device theDevice) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/update device
		currentSession.saveOrUpdate(theDevice);
	}

	@Override
	public void deleteDevice(int theImei) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object by using primary key
		Query theQuery = currentSession.createQuery("delete from Device where imei=:deviceImei");
		theQuery.setParameter("deviceImei", theImei);
		
		theQuery.executeUpdate();
	}
	
}
