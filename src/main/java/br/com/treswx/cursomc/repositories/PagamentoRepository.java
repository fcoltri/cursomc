package br.com.treswx.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treswx.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
