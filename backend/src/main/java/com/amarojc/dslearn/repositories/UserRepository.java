package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String name);

}
