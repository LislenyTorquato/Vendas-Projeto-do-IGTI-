package com.citbootcamp.vendas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citbootcamp.vendas.DTO.ClienteDTO;
import com.citbootcamp.vendas.entities.Cliente;
import com.citbootcamp.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
    private ClienteRepository clienteRepository;

	
	public List<ClienteDTO> findAll() {
		List<Cliente>res=clienteRepository.findAll();
		return res.stream().map(c->new ClienteDTO(c)).collect(Collectors.toList());
		//return lista;
	}
/*
	@Override
	public Cliente saveCliente() {
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Pedro");
		c1.setDn("14/08/2002");
		
		Cliente c2 = new Cliente();
		c2.setId(2);
		c2.setNome("Jacqueline");
		c2.setDn("10/05/2000");
		
		lista=Arrays.asList(c1,c2);
		return null;
	}
*/
}
