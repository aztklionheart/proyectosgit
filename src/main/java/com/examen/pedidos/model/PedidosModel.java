package com.examen.pedidos.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PedidosModel {
	
	private Integer id;
	
	private Double total;
	private LocalDate dateSale;
	

}
