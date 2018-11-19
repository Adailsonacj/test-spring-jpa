package com.logan.br.testspringjpa.repository;

import com.logan.br.testspringjpa.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepo extends JpaRepository<Livro, Integer> {
}
