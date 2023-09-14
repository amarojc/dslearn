package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{

}
