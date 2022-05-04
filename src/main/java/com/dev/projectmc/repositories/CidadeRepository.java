package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Categoria;
import com.dev.projectmc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
