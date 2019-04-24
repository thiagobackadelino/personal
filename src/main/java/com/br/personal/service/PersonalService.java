package com.br.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.br.personal.model.Personal;
import com.br.personal.repository.PersonalRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonalService {
	private final PersonalRepository personalRepository;
    public Iterable<Personal> list(Pageable pageable) {
        log.info("Listing all personals");
        return personalRepository.findAll(pageable);
}

}