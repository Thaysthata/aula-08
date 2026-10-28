package br.com.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aula.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
