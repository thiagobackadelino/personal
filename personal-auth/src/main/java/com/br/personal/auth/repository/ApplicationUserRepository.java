package com.br.personal.auth.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.br.personal.auth.model.ApplicationUser;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser,Long> {

		public ApplicationUser findByUsername(String username);
}