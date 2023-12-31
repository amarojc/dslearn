package com.amarojc.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amarojc.dslearn.dtos.NotificationDTO;
import com.amarojc.dslearn.entities.Notification;
import com.amarojc.dslearn.entities.User;
import com.amarojc.dslearn.repositories.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private AuthService authService;
	
	@Transactional(readOnly = true)
	public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable, boolean unreadOnly){
		User user = authService.authenticated();
		Page<Notification> page = notificationRepository.find(user, unreadOnly, pageable);
		
		return page.map(x -> new NotificationDTO(x));
	}
}
