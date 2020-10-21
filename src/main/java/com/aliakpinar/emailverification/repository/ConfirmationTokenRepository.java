package com.aliakpinar.emailverification.repository;

import org.springframework.data.repository.CrudRepository;

import com.aliakpinar.emailverification.entity.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String>{
	
	ConfirmationToken findByConfirmationToken(String confirmationToken);

}
