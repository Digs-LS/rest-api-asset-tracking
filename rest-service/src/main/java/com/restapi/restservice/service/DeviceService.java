package com.restapi.restservice.service;

import java.util.List;

import com.restapi.restservice.dto.DeviceDto;
import com.restapi.restservice.entity.Device;

public interface DeviceService {

	public List<Device> getDevices();

	public void saveDevice(DeviceDto theDevice);

	public Device getDevice(int theId);

	public void deleteDevice(int theId);
}
