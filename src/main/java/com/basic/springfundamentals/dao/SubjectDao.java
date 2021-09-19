package com.basic.springfundamentals.dao;

import com.basic.springfundamentals.model.SubjectModel;
import com.basic.springfundamentals.response.SubjectResponse;

public interface SubjectDao {
	public SubjectResponse save(SubjectModel model);
	
	public SubjectResponse read(Long id);
}
