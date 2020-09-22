package com.example.reception.model;

public class AvailableDoctor {

	private long id;
	private String name;
	private String days;
	private String timings;
	private int port;
	
	public AvailableDoctor(){}
	public AvailableDoctor(AvailabilityBean bean) {
		this.id = bean.getId();
		this.port = bean.getPort();
		this.name = bean.getName();
		this.days = bean.getDays();
		this.timings = bean.getTimings();
	}
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
	
	
}
