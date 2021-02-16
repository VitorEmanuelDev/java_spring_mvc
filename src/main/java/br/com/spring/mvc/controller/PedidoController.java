package br.com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.mvc.dto.RequisicaoNovoPedido;
import br.com.spring.mvc.model.Pedido;
import br.com.spring.mvc.repository.PedidoRepository;

@RestController
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("formulario")
	public String foamulario() {
		
		return "pedido/formulario";
		
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovoPedido requisicao) {
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		
		return "pedido/formulario";
	}

}
