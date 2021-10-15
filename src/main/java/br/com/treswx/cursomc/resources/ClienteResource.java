package br.com.treswx.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treswx.cursomc.domain.Cliente;
import br.com.treswx.cursomc.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{clienteId}")
	public ResponseEntity<?> find(@PathVariable Integer clienteId){
		
		Cliente obj = clienteService.buscar(clienteId);
		
		return ResponseEntity.ok().body(obj);
		
		
	}

}
