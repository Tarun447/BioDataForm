package com.cap.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cap.enity.FormData;

public interface FormDataRepository extends MongoRepository<FormData, String> {

}
