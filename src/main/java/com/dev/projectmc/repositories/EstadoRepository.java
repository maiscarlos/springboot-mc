package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud categoria
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
