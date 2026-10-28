package br.com.aula.DTO;

public record LivroDto(
    Long id,
    String titulo,
    String autor,
    String anoPublicacao
) {}