package com.br.personal.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.br.personal.service.PersonalService;
import com.br.personal.core.model.Personal;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("v1/admin/personal")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api(value = "Endpoints to manage personal")
public class PersonalController {

		private final PersonalService ps;
		
		
		@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
		@ApiOperation(value = "List all available personal", response = Personal[].class)
		public ResponseEntity<Iterable<Personal>> list(Pageable pg){
			return new ResponseEntity<>(ps.list(pg),HttpStatus.OK);
		}
}