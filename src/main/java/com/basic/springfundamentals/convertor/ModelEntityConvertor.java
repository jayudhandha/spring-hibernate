package com.basic.springfundamentals.convertor;

import com.basic.springfundamentals.entity.ESubject;
import com.basic.springfundamentals.model.SubjectModel;

public class ModelEntityConvertor {
	
	public static ESubject convertSubjectModelToEntitty(SubjectModel model) {
		ESubject sub = new ESubject();
		sub.setName(model.getName());
		sub.setCode(model.getCode());
		
		return sub;
	}
	
	public static SubjectModel  convertSubjectEntittyToModel(ESubject entity) {
		SubjectModel sub = new SubjectModel();
		sub.setId(entity.getId());
		sub.setName(entity.getName());
		sub.setCode(entity.getCode());
		
		return sub;
	}
}
