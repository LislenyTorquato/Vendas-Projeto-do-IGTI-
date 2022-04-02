package com.citbootcamp.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citbootcamp.vendas.DTO.ComprasDTO;
import com.citbootcamp.vendas.services.ComprasService;

@RestController
@RequestMapping(value = "/compras")
public class ComprasController {
	
	@Autowired
	private ComprasService comprasService;
	
	@GetMapping
	public ResponseEntity<List<ComprasDTO>>findAll(){
		List<ComprasDTO>lista=comprasService.findAll();
		return ResponseEntity.ok(lista);
	}

}
