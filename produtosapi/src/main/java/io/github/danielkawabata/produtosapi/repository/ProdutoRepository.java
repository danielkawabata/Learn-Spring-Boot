package io.github.danielkawabata.produtosapi.repository;

import io.github.danielkawabata.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {


    List<Produto> findByNome(String nome);
}
