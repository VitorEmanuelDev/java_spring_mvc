package br.com.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.mvc.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
