package com.examen.pedidos.model;

import lombok.Data;

@Data
public class PedidoDetalleModel {
	
	private Integer id;
	private Integer idPedido;
	private String sku;
	private Double amout;
	private Double price;

}
