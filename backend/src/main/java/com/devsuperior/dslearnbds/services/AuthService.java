package com.devsuperior.dslearnbds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.exceptions.UnauthorizedUserException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.UserRepository;
import com.devsuperior.dslearnbds.services.exceptions.ForbiddenException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	// Função pega o usuário logado, utilizaremos para controlar o acesso;
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);
		} catch (Exception e) {
			throw new UnauthorizedUserException("Invalid user");
		}
	}

	// Função para verificar se é um admin ou se é o próprio usuário que está
	// logodo;
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		// Se o usuário autenticado não for ao da id e se não for admin, nega o acesso;
		if (!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
			throw new ForbiddenException("Acess denied");
		}
	}
}