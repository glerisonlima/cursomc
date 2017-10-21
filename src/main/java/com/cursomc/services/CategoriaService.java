package com.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepositories;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepositories repositorie;
	
	public Categoria buscar(Integer id) {
		return repositorie.findOne(id);
	}
}
