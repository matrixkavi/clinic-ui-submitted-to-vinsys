package com.example.appointment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.appointment.bean.Appointment;
import com.example.appointment.error.ResourceNotFoundException;
import com.example.appointment.service.AppointmentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppointmentsController {

	@Autowired
	private AppointmentService appSvc;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointments(){
		return appSvc.getAll();
	}
	
	@GetMapping("/appointments/{id}")
	public ResponseEntity<Appointment> getAppointmentById(@PathVariable(value = "id") Long id) throws ResourceNotFoundException{
		Appointment app = appSvc.getOne(id);
		return ResponseEntity.ok(app);
	}
	
	@PostMapping("/appointments")
	public Appointment create(@RequestBody Appointment app){
		logger.info("inside create appointments method. Got the following to create:");
		logger.info(app.toString());
		return appSvc.create(app);
	}
	
	@PutMapping("/appointments/{id}")
	public ResponseEntity<Appointment> update(@PathVariable(value="id")Long id, @RequestBody Appointment app) throws ResourceNotFoundException{
		Appointment updatedAppointment = appSvc.update(app, id);
		return ResponseEntity.ok(updatedAppointment);
	}
	
	@DeleteMapping("/appointments/{id}")
	public Map<String, Boolean> deleteAppointment(@PathVariable(value = "id") Long id){
		appSvc.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
