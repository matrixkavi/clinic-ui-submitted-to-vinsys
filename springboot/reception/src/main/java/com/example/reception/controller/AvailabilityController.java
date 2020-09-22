package com.example.reception.controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.reception.feign.AvailabilityCheckerProxy;
import com.example.reception.model.AvailabilityBean;
import com.example.reception.model.AvailableDoctor;

@RestController
public class AvailabilityController {

	@Autowired
	private AvailabilityCheckerProxy serviceProxy;

	@LoadBalanced
	private RestTemplate restTemplate;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/availability-feign/specialization/{specialization}/timing/{timing}")
	public AvailableDoctor getAvailableDoctors(@PathVariable String specialization, @PathVariable String timing) {
		System.out.println("Implementing the Controller with the Feign Implemenatation");

		List<AvailabilityBean> response = serviceProxy.retrieveDoctors(specialization);
		logger.info("{}" + response);
		String timingStr = timing.equals("FN") ? "8am-12pm" : "4pm-8pm";
		AvailableDoctor doctor = null;
		for (AvailabilityBean bean : response) {
			if (bean.getTimings().equalsIgnoreCase(timingStr)) {
				doctor = new AvailableDoctor(bean);
				break;
			}
		}

		return doctor;
	}
}
