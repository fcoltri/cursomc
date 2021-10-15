package br.com.treswx.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.treswx.cursomc.domain.Cliente;
import br.com.treswx.cursomc.repositories.ClienteRepository;
import br.com.treswx.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = clienteRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", tipo: " + Cliente.class.getName()));
	}
	
	

}
