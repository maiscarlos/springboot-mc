package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
