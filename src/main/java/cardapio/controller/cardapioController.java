package cardapio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comanda.Comanda;

@Controller
public class cardapioController {

	@RequestMapping( value = "/cardapio", method = RequestMethod.GET)
	public String cardapio() {

		
		return file:///home/aluno/Downloads/projeto1/src/main/resources/templates/Comanda.html;
	
		
	}
}
				
    