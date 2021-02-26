package com.examen.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.pedidos.entity.PedidosW;

@Repository
public interface PedidosRepository extends JpaRepository<PedidosW, Integer> {

}
