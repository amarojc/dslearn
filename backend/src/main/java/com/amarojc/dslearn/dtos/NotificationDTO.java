package com.amarojc.dslearn.dtos;

import java.io.Serializable;

import com.amarojc.dslearn.entities.Notification;

public class NotificationDTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
		
	private Long id;
	private String text;
	private boolean read;
	private String route;	
	private Long userId;
	

	public NotificationDTO() {
	}


	public NotificationDTO(Long id, String text, boolean read, String route, Long userId) {
		this.id = id;
		this.text = text;
		this.read = read;
		this.route = route;
		this.userId = userId;
	}
	
	public NotificationDTO(Notification notification) {
		id = notification.getId();
		text = notification.getText();
		read = notification.isRead();
		route = notification.getRoute();
		userId = notification.getUser().getId();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public boolean isRead() {
		return read;
	}


	public void setRead(boolean read) {
		this.read = read;
	}


	public String getRoute() {
		return route;
	}


	public void setRoute(String route) {
		this.route = route;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
