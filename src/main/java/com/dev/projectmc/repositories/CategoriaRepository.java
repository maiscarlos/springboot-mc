package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
