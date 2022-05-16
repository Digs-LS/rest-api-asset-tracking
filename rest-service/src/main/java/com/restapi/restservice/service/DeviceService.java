package com.restapi.restservice.service;

import java.util.List;

import com.restapi.restservice.entity.Device;

public interface DeviceService {

	public List<Device> getDevices();

	public void saveDevice(Device theDevice);
	
	public Device getDevice(int theImei);

	public void deleteDevice(int theImei);
}
