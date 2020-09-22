package com.example.reception.model;

public class AvailabilityBean {

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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
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
	@Override
	public String toString() {
		return "AvailabilityBean [id=" + id + ", port=" + port + ", name=" + name + ", specialization=" + specialization
				+ ", days=" + days + ", timings=" + timings + "]";
	}
	
	
}
