package com.example.appointment.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	private long id;
	private int port;
	private String name;
	private String specialization;
	private String days;
	private String timings;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", days=" + days
				+ ", timings=" + timings + ", port=" + port + "]";
	}
	

}
