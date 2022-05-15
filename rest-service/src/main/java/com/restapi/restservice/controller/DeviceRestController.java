package com.restapi.restservice.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.entity.Device;

@RestController
@RequestMapping("/api/testing")
public class DeviceRestController {

	private List <Device> theDevices;
	
	// define @PostContruct to load device data only once
	@PostConstruct
	public void loadData() {
		
		theDevices = new ArrayList<>();
		
		theDevices.add(new Device(1,"1","1","1","1"));
	}
	
	
	// define enpoint for /devices
	
	@GetMapping("/devices")
	public List<Device> getDevices() {
		return theDevices;		
	}
	
	// define endpoint for "/devices/{deviceIme}" - return device by index
	
	@GetMapping("/devices/{deviceIndex}")
	public Device getDevice(@PathVariable int deviceIndex) {
		
		//index into the list
		
		return theDevices.get(deviceIndex);
	}
}
