package com.geral.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class Controller {

	@Autowired
	private ServicoRepository repository;
	
	@GetMapping("/Servicos")
	public java.util.List<ServicoModel> pegarTodos () {

		return repository.findAll();
		
	}
	
	@PostMapping ("/servicos")
	public ServicoModel criar(@RequestBody ServicoModel model) {
		repository.save(model);
		return model;
		
	}
}
