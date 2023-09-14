package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
