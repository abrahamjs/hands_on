package com.company.studentrepository.dao;

import com.company.studentrepository.model.Course;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Table;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {

}
