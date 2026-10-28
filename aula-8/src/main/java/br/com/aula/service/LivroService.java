package br.com.aula.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.aula.model.Livro;
import br.com.aula.repository.LivroRepository;

@Service
public class LivroService {
	private final LivroRepository livroRepository;
	
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro salvar (Livro livro) {
		return livroRepository.save(livro);
		}
	
	public LivroRepository getLivroRepository() {
		return livroRepository;
	}

	public List<Livro> listarTodos(){
		return livroRepository.findAll();
	}
	

	public Livro livroFindById(Long id) {
	    return livroRepository.findById(id).get();
	}
}