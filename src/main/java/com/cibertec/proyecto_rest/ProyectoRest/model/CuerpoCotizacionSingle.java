package com.cibertec.proyecto_rest.ProyectoRest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuerpo_cotizacion")
@Data
public class CuerpoCotizacionSingle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
