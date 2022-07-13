package com.cap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.enity.FormData;
import com.cap.service.FormDataService;

@RestController
public class FormDatController {
	
	@Autowired
	private FormDataService service;
	
	
	@PostMapping("/save")
	public FormData create(@RequestBody FormData frm) throws Exception
	{
		  return service.saveData(frm);
	}
	
	@GetMapping("/AllData")
	public List<FormData> getAllData() throws Exception
	{
		return service.allList();
	}
}
