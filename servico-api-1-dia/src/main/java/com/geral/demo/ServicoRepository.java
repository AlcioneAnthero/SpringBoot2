package com.geral.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<ServicoModel, Long>{

	
	public List<ServicoModel> findByNome(String string);
}
