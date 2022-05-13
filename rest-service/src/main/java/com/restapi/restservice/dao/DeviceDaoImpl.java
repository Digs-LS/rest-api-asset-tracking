package com.restapi.restservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.restapi.restservice.entity.Device;

public class DeviceDaoImpl implements DeviceDao{

	// inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Device> getDevices() {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query
		Query<Device> theQuery = 
				currentSession.createQuery("from Device", Device.class);
		
		// execute query and get result lis
		List<Device> devices = theQuery.getResultList();
		
		// return results
		return devices;
		
	}

	@Override
	public void saveDevice(Device theDevice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDevice(int theImei) {
		// TODO Auto-generated method stub
		
	}
	
}
