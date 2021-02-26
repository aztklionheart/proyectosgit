package com.examen.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.pedidos.entity.PedidoDetalleW;

@Repository
public interface PedidoDetalleRepository extends JpaRepository<PedidoDetalleW, Integer> {

}
