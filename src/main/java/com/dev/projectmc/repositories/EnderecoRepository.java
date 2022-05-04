package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
