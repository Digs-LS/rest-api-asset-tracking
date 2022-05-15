package com.restapi.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.dao.DeviceDaoImpl;
import com.restapi.restservice.entity.Device;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@Autowired
	private DeviceDaoImpl deviceService;
	
	// add mapping to GET /devices
	@GetMapping("/devices")
	public List<Device> getDevices() {
		
		return deviceService.getDevices(); 
	}
	
	// add mapping for POST /devices
	@PostMapping("/devices")
	public Device addDevice(@RequestBody Device theDevice) {
				
		theDevice.setImei(0);
				
		deviceService.saveDevice(theDevice);
		
		return theDevice;
	}
}
