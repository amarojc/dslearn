package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
