package com.br.personal.core.repository;


import com.br.personal.core.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);

}
