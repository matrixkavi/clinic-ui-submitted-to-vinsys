package com.example.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.appointment.bean.Doctor;

@Repository
public interface DoctorsRepository extends JpaRepository<Doctor, Long> {

	public List<Doctor> findBySpecialization(String specialization);
}
