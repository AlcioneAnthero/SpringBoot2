package com.servicoapi1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servicoapi1.ServicoModel;

public interface ServicoRepository extends JpaRepository<ServicoModel, Long>{

	public List<ServicoModel> findByNome (String nome);

	
}
