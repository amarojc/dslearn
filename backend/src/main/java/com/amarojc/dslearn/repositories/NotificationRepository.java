package com.amarojc.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarojc.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long>{

}
