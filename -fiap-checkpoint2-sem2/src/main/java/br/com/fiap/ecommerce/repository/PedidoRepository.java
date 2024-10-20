package br.com.fiap.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.ecommerce.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    <T> T findByStatus(String status, Class<T> type);

    <T> List<T> findAllByStatus(String status, Class<T> type);

    <T> List<T> findAllByStatusContains(String status, Class<T> type);
}
