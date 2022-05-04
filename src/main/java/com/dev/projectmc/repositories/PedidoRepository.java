package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud Pedido
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
