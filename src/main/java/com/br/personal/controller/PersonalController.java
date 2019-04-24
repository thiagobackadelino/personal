package com.br.personal.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.personal.service.PersonalService;
import com.br.personal.model.Personal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("v1/admin/personal")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PersonalController {

		private final PersonalService ps;
		
		
		@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		public ResponseEntity<Iterable<Personal>> list(Pageable pg){
			return new ResponseEntity<>(ps.list(pg),HttpStatus.OK);
		}
}