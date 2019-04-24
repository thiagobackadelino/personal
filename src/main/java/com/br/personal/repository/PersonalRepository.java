package com.br.personal.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.br.personal.model.Personal;

public interface PersonalRepository extends PagingAndSortingRepository<Personal,Long> {

}