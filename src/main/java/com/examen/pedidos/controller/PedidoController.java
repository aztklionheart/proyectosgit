package com.examen.pedidos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.pedidos.model.PedidoDetalleModel;
import com.examen.pedidos.model.PedidosModel;
import com.examen.pedidos.service.PedidosService;

@RestController
@RequestMapping( "/V1/pedidos" )
public class PedidoController {

	@Autowired
	PedidosService pedidosService;
	
	@PostMapping("")
	public PedidosModel guardapedido(@RequestBody PedidosModel pedidosModel) {
		
		return pedidosService.guardaPedido(pedidosModel);
	}
	
	@GetMapping("")
	public List<PedidosModel> obtienePedidos(){
		return pedidosService.obtienePedidos();
	}
	
	@PostMapping("/detalle")
	public PedidoDetalleModel guardaDetalle(@RequestBody PedidoDetalleModel pedidoDetalleModel) {
		return pedidosService.guardaDetalle(pedidoDetalleModel);
	}
	
	@GetMapping("/detalle")
	public List<PedidoDetalleModel> obtieneDetalle(){
		return pedidosService.obtieneDetalle();
	}
	
	public PedidoDetalleModel obtieneDetallePorPedido( Integer idPedido ){
		//
		return null;
	}
	
	
}
