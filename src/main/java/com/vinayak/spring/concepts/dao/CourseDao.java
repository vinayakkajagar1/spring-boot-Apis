package com.vinayak.spring.concepts.dao;


import com.vinayak.spring.concepts.entity.CourseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends CrudRepository<CourseEntity,Integer> {
}
