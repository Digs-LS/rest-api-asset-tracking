package com.restapi.restservice.dto;

import com.restapi.restservice.entity.Client;

public class DeviceDto {

	private int id;

	private String imei;

	private String gpsLocation;

	private String accelerometerData;

	private String temperature;

	private String batteryLevel;

	private Client client;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getGpsLocation() {
		return gpsLocation;
	}

	public void setGpsLocation(String gpsLocation) {
		this.gpsLocation = gpsLocation;
	}

	public String getAccelerometerData() {
		return accelerometerData;
	}

	public void setAccelerometerData(String accelerometerData) {
		this.accelerometerData = accelerometerData;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
