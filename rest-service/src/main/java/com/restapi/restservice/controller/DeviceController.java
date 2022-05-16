package com.restapi.restservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restservice.entity.Device;
import com.restapi.restservice.service.DeviceService;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	
	// add mapping to GET /devices
	@GetMapping("/devices")
	public List<Device> getDevices() {
		
		return deviceService.getDevices();
	}
	
	// add mapping for POST /devices - add new device
	@PostMapping("/devices")
	public Device addDevice(@RequestBody Device theDevice) {
			
		// set Id (imei) to 0 so the device is created instead of updated
		theDevice.setImei(0);
				
		deviceService.saveDevice(theDevice);
		
		return theDevice;
	}
	
	// add mapping for PUT /devices - update existing device
	@PutMapping("/devices")
	public Device updateDevice(@RequestBody Device theDevice) {
		
		deviceService.saveDevice(theDevice);
		
		return theDevice;
	}
	
	// add mapping for DELETE /devices - delete existing device
	@DeleteMapping("/devices/{deviceImei}")
	public String deleteDevice(@PathVariable int deviceImei) {
		
		Device tempDevice = deviceService.getDevice(deviceImei);
		
		// throw exception if null
		if (tempDevice == null) {
			return "Device not found with imei =" + tempDevice.getImei();
		}
		
		deviceService.deleteDevice(deviceImei);
		
		return "Deleted device with Imei = " + deviceImei;
	}
}
