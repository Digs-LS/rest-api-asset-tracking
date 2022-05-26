package com.restapi.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="imei")
	private String imei;
	
	@Column(name="gps_location")
	private String gpsLocation;
	
	@Column(name="accelerometer_data")
	private String accelerometerData;
	
	@Column(name="temperature")
	private String temperature;
	
	@Column(name="battery_level")
	private String batteryLevel;
	
	public Device() {
		
	}

	public Device(int id, String imei, String gpsLocation, String accelerometerData, String temperature,
			String batteryLevel) {
		super();
		this.id = id;
		this.imei = imei;
		this.gpsLocation = gpsLocation;
		this.accelerometerData = accelerometerData;
		this.temperature = temperature;
		this.batteryLevel = batteryLevel;
	}

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

	@Override
	public String toString() {
		return "Device [id=" + id + ", imei=" + imei + ", gpsLocation=" + gpsLocation + ", accelerometerData="
				+ accelerometerData + ", temperature=" + temperature + ", batteryLevel=" + batteryLevel + "]";
	}
}