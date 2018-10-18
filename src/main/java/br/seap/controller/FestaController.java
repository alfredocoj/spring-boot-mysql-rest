package br.seap.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.seap.model.Convidado;
import br.seap.service.ConvidadoService;

@RestController
@RequestMapping(value="/")
public class FestaController {
	
	@Autowired
	private ConvidadoService service;
	
	@RequestMapping(value="festa", method=RequestMethod.POST)
	public Object create(@RequestBody Convidado convidado) {
		return new ResponseEntity<Convidado>(service.save(convidado), HttpStatus.OK);
	}
	
	@RequestMapping(value= {"festa", "/{id}"}, method=RequestMethod.GET)
	public Object read(@PathVariable Optional<Integer> id) {
		return new ResponseEntity<List<Convidado>>(service.findAll(), HttpStatus.OK);
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}