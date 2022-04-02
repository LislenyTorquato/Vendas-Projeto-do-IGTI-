package com.citbootcamp.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citbootcamp.vendas.DTO.ClienteDTO;
import com.citbootcamp.vendas.entities.Cliente;
import com.citbootcamp.vendas.services.ClienteService;

@RestController//classe vai ter endpoints/acessar os caminhos no navegador
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<ClienteDTO>>findAll(){
		List<ClienteDTO>lista=clienteService.findAll();
		return ResponseEntity.ok(lista);
	}
}
