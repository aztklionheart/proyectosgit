package com.examen.pedidos.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name="PEDIDOS_DETALLE_W" )
@Getter
@Setter
public class PedidoDetalleW {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer idPedido;
	private String sku;
	private Double amout;
	private Double price;
	

}
