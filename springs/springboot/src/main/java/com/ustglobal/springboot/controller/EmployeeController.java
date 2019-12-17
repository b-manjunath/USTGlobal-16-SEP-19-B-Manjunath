package com.ustglobal.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.springboot.dto.EmployeeBean;
import com.ustglobal.springboot.dto.EmployeeResponce;
import com.ustglobal.springboot.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce addEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponce responce = new EmployeeResponce();
		if(service.addEmployee(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Data Added to the DB");
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data Not Added to the DB");
		}
		return responce;
	}//end of addEmployee


	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce modifyEmployee(@RequestBody EmployeeBean bean) {
		EmployeeResponce responce = new EmployeeResponce();
		if(service.modifyEmployee(bean)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Data modify from the DB");
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data Not modefy from the DB");
		}

		return responce;
	}//end of modifyEmployee


	@DeleteMapping(path="/delete/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce deleteEmployee(@PathVariable("id") int id) {
		EmployeeResponce responce = new EmployeeResponce();
		if(service.deleteEmployee(id)) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Data deleted from the DB");
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data Not deletede from the DB");
		}
		return responce;
	}//end of deleteEmployee


	@GetMapping(path="/get",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce getEmployee(@RequestParam("id") int id) {
		EmployeeResponce responce = new EmployeeResponce();
		EmployeeBean bean = service.getEmployee(id);
		if(bean!=null) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Data found in the DB");
			responce.setEmployeebeans(Arrays.asList(bean));
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data Not not found in the DB");
		}
		return responce;
	}//end of getEmployee

	@GetMapping(path = "/get-all",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeResponce getAllEmployee(){
		EmployeeResponce responce = new EmployeeResponce();
		List<EmployeeBean> beans = service.getAllEmployee();
		if(!beans.isEmpty()) {
			responce.setStatusCode(201);
			responce.setMessage("Success");
			responce.setDescription("Data found in the DB");
			responce.setEmployeebeans(beans);
		}else {
			responce.setStatusCode(401);
			responce.setMessage("Failure");
			responce.setDescription("Data Not not found in the DB");
		}
		return responce;
	}//end  of getAllEmployee
	
	
	@GetMapping(path = "/exce",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void createException() {
		int i = 1/0;
	}//end of createException()

}
