package com.amarojc.dslearn.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarojc.dslearn.dtos.DeliverRevisionDTO;
import com.amarojc.dslearn.services.DeliverService;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResoucer {

	@Autowired
	private DeliverService deliverService;
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<DeliverRevisionDTO> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO deliverDTO){
		deliverService.saveRevision(id, deliverDTO);
		return ResponseEntity.noContent().build();
	}
}
