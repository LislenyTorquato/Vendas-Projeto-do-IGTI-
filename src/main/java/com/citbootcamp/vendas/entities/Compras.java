package com.citbootcamp.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_compras")
@Data
@NoArgsConstructor
public class Compras {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")//chave estrangeira
	private Cliente cliente; //relacionadas a um cliente
	
	public Compras(int id, Double totalCompra, LocalDate dataCompra) {
		this.id = id;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
	}
}
