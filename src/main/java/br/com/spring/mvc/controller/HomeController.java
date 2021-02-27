package br.com.spring.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.mvc.model.Pedido;
import br.com.spring.mvc.model.StatusPedido;
import br.com.spring.mvc.repository.PedidoRepository;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public String home(Model model) {
	    List<Pedido> pedidos = pedidoRepository.findAll();
	    model.addAttribute("pedidos", pedidos);
	
	    return "home"; 
	}  
	
	@GetMapping("/${status}")
	public String porStatus(@PathVariable("status") String status, Model model) {
	    List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
	    model.addAttribute("pedidos", pedidos);
	    model.addAttribute("status", status);
	    
	    return "home"; 
	}  
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		
		return "redirect:/home";
		
	}
	
}
