package com.basic.springfundamentals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.basic.springfundamentals.entity.ESubject;


@Repository
public interface SubjectRepository extends JpaRepository<ESubject, Long> {

	@Query(value = "select * from subject where name = ?")
	public ESubject getSubByName(String name);
}
