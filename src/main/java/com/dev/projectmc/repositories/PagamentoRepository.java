package com.dev.projectmc.repositories;

import com.dev.projectmc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//crud Pagamento
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
