package br.com.treswx.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treswx.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
