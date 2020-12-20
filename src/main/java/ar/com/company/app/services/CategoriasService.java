package ar.com.company.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.company.app.model.Categoria;
import ar.com.company.app.repository.CategoriaRepository;

@Service
public class CategoriasService {

	@Autowired
	private CategoriaRepository categoriasRepository;
	
	public List<Categoria> getCategorias() {
		return categoriasRepository.findAll();
	}
}
