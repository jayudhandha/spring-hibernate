package com.basic.springfundamentals.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.basic.springfundamentals.convertor.ModelEntityConvertor;
import com.basic.springfundamentals.entity.ESubject;
import com.basic.springfundamentals.model.SubjectModel;
import com.basic.springfundamentals.repository.SubjectRepository;
import com.basic.springfundamentals.response.ApiStatus;
import com.basic.springfundamentals.response.SubjectResponse;

import javassist.NotFoundException;

// Business logic
@Service 
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public SubjectResponse read(Long id) {
		Optional<ESubject> subEntity = subjectRepository.findById(id);
		
		if(subEntity.isEmpty()) {
			System.out.println("Subject not found");
			return new SubjectResponse(ApiStatus.FAILURE, HttpStatus.NOT_FOUND.value(), null);
//			throw new NotFoundException("Subject not found");
		}
		
		return new SubjectResponse(ApiStatus.SUCCESS, HttpStatus.OK.value(), 
				ModelEntityConvertor.convertSubjectEntittyToModel(subEntity.get()));
	}

	@Override
	public SubjectResponse save(SubjectModel model) {
		ESubject subEntity = ModelEntityConvertor.convertSubjectModelToEntitty(model);
		ESubject savedEntity = subjectRepository.save(subEntity);
		
		System.out.println("Data saved successfully, Id: "+savedEntity.getId());
		
		return new SubjectResponse(ApiStatus.SUCCESS, HttpStatus.OK.value(), 
				ModelEntityConvertor.convertSubjectEntittyToModel(savedEntity));
	}

}
