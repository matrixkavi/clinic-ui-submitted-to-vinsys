package com.example.appointment.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String doctorname;
	private String patientname;
	// for simplicity, we consider appointments for only one week. So, value contained in String day
	// can be anyone from SUN, MON, TUE,WED, THU, FRI, and SAT.
	private String day;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", doctorname=" + doctorname + ", patientname=" + patientname + ", day=" + day
				+ "]";
	}
	
	
	
}
