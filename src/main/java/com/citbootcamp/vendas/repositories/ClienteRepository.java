package com.citbootcamp.vendas.repositories;


//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citbootcamp.vendas.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	/*public List<Cliente>findAll();
	
	public Cliente saveCliente();*/
}
