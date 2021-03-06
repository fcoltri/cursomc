package br.com.treswx.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treswx.cursomc.domain.Categoria;
import br.com.treswx.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource{

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/{categoriaId}")
	public ResponseEntity<?> find(@PathVariable Integer categoriaId) {
		
		Categoria obj = categoriaService.buscar(categoriaId);
		
		return ResponseEntity.ok().body(obj);
		
	}
	

}
