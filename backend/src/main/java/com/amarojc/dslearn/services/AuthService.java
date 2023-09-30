package com.amarojc.dslearn.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amarojc.dslearn.entities.User;
import com.amarojc.dslearn.repositories.UserRepository;
import com.amarojc.dslearn.services.exceptions.ForbiddenException;
import com.amarojc.dslearn.services.exceptions.UnauthorizedException;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Retornando o usuário autenticado
	 * @return
	 */
	@Transactional(readOnly =true)
	public User authenticated() {
		try {
			
			String userName = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(userName);
		} catch (Exception e) {
			throw new UnauthorizedException("Invalid user");
		}
		
	}
	
	/**
	 * Método lança uma exceção caso o usuário autenticado não for igual ao userId e se não é ADMIN.
	 * @param userId
	 */
	public void validateSelfOrAdmin(Long userId) {
			User user = authenticated();
			if(!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
				throw new ForbiddenException("Access denied");
			}
	}
	
}
