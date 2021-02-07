package br.com.spring.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.mvc.model.Pedido;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Razer Blade 15");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/81mIXd99GrL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com/Razer-Blade-Advanced-Gaming-Laptop/dp/B086MHT6LB/ref=sr_1_7?dchild=1&qid=1612652952&refinements=p_n_feature_four_browse-bin%3A2289792011%2Cp_computer_cpu_speed-bin%3A3+GHz+%26+Up%2Cp_72%3A1248879011&rnid=1248877011&s=pc&sr=1-7");
		pedido.setDescricao("Advanced Gaming Laptop 2020: Intel Core i7-10875H 8-Core, NVIDIA GeForce RTX 2080 SUPER Max-Q, 15.6” FHD 300Hz, 16GB RAM, 1TB SSD, CNC Aluminum, Chroma RGB Lighting, Thunderbolt 3");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
				
	}
	
}
