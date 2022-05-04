package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
