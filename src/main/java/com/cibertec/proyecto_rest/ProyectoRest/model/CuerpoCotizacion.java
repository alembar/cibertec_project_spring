package com.cibertec.proyecto_rest.ProyectoRest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuerpo_cotizacion")
@Data
public class CuerpoCotizacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "cantidad")
	private String cantidad;

	@ManyToOne
    @JoinColumn(name = "idCotizacion")	
	private Cotizacion cotizacion;
	
	@ManyToOne
    @JoinColumn(name = "idItem")
	private Item item;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public Cotizacion getCotizacion() {
		return cotizacion;
	}

	public void setCotizacion(Cotizacion cotizacion) {
		this.cotizacion = cotizacion;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	
}
