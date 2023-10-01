package com.amarojc.dslearn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amarojc.dslearn.dtos.DeliverRevisionDTO;
import com.amarojc.dslearn.entities.Deliver;
import com.amarojc.dslearn.repositories.DeliverRepository;

@Service
public class DeliverService {

	@Autowired
	private DeliverRepository deliverRepository;
	
	@PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
	@Transactional
	public void saveRevision(Long id, DeliverRevisionDTO deliverDTO) {
		Deliver deliver = deliverRepository.getOne(id);
		deliver.setStatus(deliverDTO.getStatus());
		deliver.setFeedback(deliverDTO.getFeedback());
		deliver.setCorrectCount(deliverDTO.getCorrectCount());
		deliverRepository.save(deliver);
	}
}
