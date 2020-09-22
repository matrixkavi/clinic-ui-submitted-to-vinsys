package com.example.reception.feign;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.reception.model.AvailabilityBean;

@RibbonClient(name="appointment-service")
//@FeignClient(name="appointment-service",url="localhost:8000")
@FeignClient(name="appointment-service")
public interface AvailabilityCheckerProxy {

	@GetMapping("enquiry/specialization/{specialization}")
	public List<AvailabilityBean> retrieveDoctors(
			@PathVariable("specialization") String specialization);
}

//http://localhost:8001/currency-exchange/from/{from}/to/{to}