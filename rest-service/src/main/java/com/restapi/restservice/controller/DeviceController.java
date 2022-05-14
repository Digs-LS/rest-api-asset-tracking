package com.restapi.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.dao.DeviceDaoImpl;
import com.restapi.restservice.entity.Device;

@RestController
@RequestMapping("/devices")
public class DeviceController {

	@Autowired
	private DeviceDaoImpl deviceDaoImpl;
	
	// add mapping to get /devices
	@GetMapping
	public List<Device> getDevices() {
		
		return deviceDaoImpl.getDevices(); 
	}
	
	
}
