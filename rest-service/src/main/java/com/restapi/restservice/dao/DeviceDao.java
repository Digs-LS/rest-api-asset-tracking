package com.restapi.restservice.dao;

import java.util.List;

import com.restapi.restservice.entity.Device;

public interface DeviceDao {
	
	public List<Device> getDevices();
	public void saveDevice(Device theDevice);
	public void deleteDevice(int theImei);
}
