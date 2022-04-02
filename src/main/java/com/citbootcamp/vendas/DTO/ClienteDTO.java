package com.citbootcamp.vendas.DTO;

import com.citbootcamp.vendas.entities.Cliente;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class ClienteDTO {
	
	private int id;
	private String nome;
	private String dn;

	public ClienteDTO(Cliente entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.dn = entidade.getDn();
	}

}