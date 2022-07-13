package com.cap.service;

import java.util.List;

import com.cap.enity.FormData;

public interface FormDataService {
	
	public FormData saveData(FormData frm);
	
	public List<FormData> allList();

}
