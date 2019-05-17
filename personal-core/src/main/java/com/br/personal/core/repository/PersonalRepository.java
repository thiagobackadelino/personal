package com.br.personal.core.repository;


import com.br.personal.core.model.Personal;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PersonalRepository extends PagingAndSortingRepository<Personal, Long> {
}
