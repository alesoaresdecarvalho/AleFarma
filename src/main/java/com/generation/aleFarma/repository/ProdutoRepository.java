package com.generation.aleFarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.aleFarma.model.Categoria;
import com.generation.aleFarma.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto,Long>{
	
	
	static List<Produto> findByCategoria(Categoria categoria) {
		List<Produto> produtos = ProdutoRepository.findByCategoria(categoria);
	    
	    return produtos;
	}
	
	static List<Produto> findAllByNomeContainingIgnoreCase(String nome) {
        List<Produto> produtos = ProdutoRepository.findAllByNomeContainingIgnoreCase(nome);
        return produtos;

}

}