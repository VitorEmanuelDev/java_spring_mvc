package br.com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.mvc.model.Pedido;
import br.com.spring.mvc.repository.PedidoRepository;

@RestController
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		
		return "home";
				
	}
	
}
