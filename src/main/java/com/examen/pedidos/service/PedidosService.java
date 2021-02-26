package com.examen.pedidos.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.pedidos.entity.PedidoDetalleW;
import com.examen.pedidos.entity.PedidosW;
import com.examen.pedidos.model.PedidoDetalleModel;
import com.examen.pedidos.model.PedidosModel;
import com.examen.pedidos.repository.PedidoDetalleRepository;
import com.examen.pedidos.repository.PedidosRepository;

@Service
public class PedidosService {

	@Autowired
	PedidosRepository pedidosRepository;
	@Autowired
	PedidoDetalleRepository pedidoDetalleRepository;
	
	ModelMapper m = new ModelMapper();

	public PedidosModel guardaPedido(PedidosModel pedidosModel) {

		//ModelMapper m = new ModelMapper();
		pedidosModel.setDateSale(LocalDate.now());
		return m.map(pedidosRepository.save(m.map(pedidosModel, PedidosW.class)), PedidosModel.class);

	}

	public List<PedidosModel> obtienePedidos() {
		//ModelMapper m = new ModelMapper();
		return pedidosRepository.findAll().stream().map(p -> m.map(p, PedidosModel.class)).collect(Collectors.toList());
	}

	public PedidoDetalleModel guardaDetalle(PedidoDetalleModel pedidoDetalleModel) {
		
		return m.map(  pedidoDetalleRepository.save(m.map(pedidoDetalleModel, PedidoDetalleW.class))  , PedidoDetalleModel.class);
		
	}
	
	public List<PedidoDetalleModel> obtieneDetalle(){
		return pedidoDetalleRepository.findAll().stream().map(d -> m.map(d, PedidoDetalleModel.class) ).collect(Collectors.toList());
	}

}
