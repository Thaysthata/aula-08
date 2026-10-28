package br.com.aula.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula.model.Livro;
import br.com.aula.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	private final LivroService livroService;
	
	public LivroController(LivroService livroService) {
		this.livroService= livroService;
	}
	
	@PostMapping
	public Livro salvar (@RequestBody Livro livro) {
		return livroService.salvar(livro);
	}
	
	@GetMapping
	public List<Livro> listarTodos(){
		return livroService.listarTodos();
	}
	@GetMapping("/livro/{id}")
	public ResponseEntity<Livro> livroFindById(@PathVariable("id") Long id){
	    Livro entity = livroService.livroFindById(id);
	    return ResponseEntity.ok(entity);
	}

}
