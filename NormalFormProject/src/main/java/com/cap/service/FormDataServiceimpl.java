package com.cap.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.enity.FormData;
import com.cap.repo.FormDataRepository;

@Service
public class FormDataServiceimpl implements FormDataService {

	@Autowired
	private FormDataRepository repository;
	
	@Override
	public FormData saveData(FormData frm) {
		try {
//			frm.setPicName(null);
			FormData fm = repository.save(frm);
			return fm;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@Override
	public List<FormData> allList() {
		try
		{
			List<FormData> frmData = repository.findAll();
			return frmData;
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
