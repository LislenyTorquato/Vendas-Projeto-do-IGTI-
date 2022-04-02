package com.citbootcamp.vendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_cliente")
@Data
@NoArgsConstructor
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//incremento
	private int id;
	private String nome;
	private String dn;
	
	@OneToMany(mappedBy ="cliente")//um cliente pode fazer varias compras
	                               //lado fraco, cada compra terá um cliente
	private List<Compras>compras = new ArrayList<>();
	
	public Cliente (int id, String nome, String dn) {
		this.id = id;
		this.nome = nome;
		this.dn = dn;
	}
}
