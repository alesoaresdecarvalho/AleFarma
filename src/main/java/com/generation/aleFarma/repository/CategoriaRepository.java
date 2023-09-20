package com.generation.aleFarma.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.aleFarma.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria,Long>{
	
	Optional<Categoria> findByNome(String nome);

}
