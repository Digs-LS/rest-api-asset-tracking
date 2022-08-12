package com.restapi.restservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restapi.restservice.dao.DeviceDao;
import com.restapi.restservice.dto.DeviceDto;
import com.restapi.restservice.entity.Device;

@Service
public class DeviceServiceImpl implements DeviceService {

	// inject device DAO
	@Autowired
	private DeviceDao deviceDao;

	@Override
	@Transactional
	public List<Device> getDevices() {
		return deviceDao.getDevices();
	}

	@Override
	@Transactional
	public void saveDevice(DeviceDto theDevice) {
		deviceDao.saveDevice(toEntity(theDevice));
	}

	private Device toEntity(DeviceDto theDevice) {
		Device deviceEntity = new Device();
		
		return deviceEntity;
	}

	@Override
	@Transactional
	public void deleteDevice(int theId) {
		deviceDao.deleteDevice(theId);
	}

	@Override
	@Transactional
	public Device getDevice(int theId) {
		return deviceDao.getDevice(theId);
	}

}
