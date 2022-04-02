package com.citbootcamp.vendas.DTO;

import java.time.LocalDate;

import com.citbootcamp.vendas.entities.Compras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComprasDTO {
	private int id;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	public ComprasDTO(Compras entidade) {
		this.id = entidade.getId();
		this.totalCompra = entidade.getTotalCompra();
		this.dataCompra = entidade.getDataCompra();
	}
}
