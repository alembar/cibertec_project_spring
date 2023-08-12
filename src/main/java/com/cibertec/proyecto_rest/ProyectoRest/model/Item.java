package com.cibertec.proyecto_rest.ProyectoRest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="item")
@Data
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre_item")
	private String nombreItem;
	
	@Column(name="description")
	private String description;
	
	@Column(name="precio_unitario")
	private double precioUnitario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrecio_unitario() {
		return precioUnitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precioUnitario = precio_unitario;
	}
	
	
}
