package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long>{

}
