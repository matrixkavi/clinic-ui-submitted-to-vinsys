package com.example.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appointment.bean.Appointment;
import com.example.appointment.repository.AppointmentsRepository;
import com.example.appointment.error.ResourceNotFoundException;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentsRepository appointmentRepo;
	
	public List<Appointment> getAll(){
		return appointmentRepo.findAll();
	}
	
	public Appointment getOne(Long id) throws ResourceNotFoundException{
		return appointmentRepo.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Appointment not found for id :: " + id));
	}
	
	public Appointment create(Appointment appointment){
		return appointmentRepo.save(appointment);
	}

	public Appointment update(Appointment appointment, Long id) throws ResourceNotFoundException{
		Appointment old = appointmentRepo.findById(id).
				orElseThrow(() -> new ResourceNotFoundException("Appointment not found for id :: " + id));
		old.setDay(appointment.getDay());
		old.setDoctorname(appointment.getDoctorname());
		old.setPatientname(appointment.getPatientname());
		return appointmentRepo.save(old);
	}
	
	public void delete(Long id){
		appointmentRepo.deleteById(id);
	}
	
}
