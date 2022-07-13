package com.cap.enity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class FormData {
	
	@Id
	public String id;
	
	public String name;
	
	public String address;
	
	public String email;
	
	public long ph;
	
//	public String picName;
//	public byte[] pic;
	

}
