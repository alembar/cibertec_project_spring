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
@Table(name = "cotizacion")
@Data
public class Cotizacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre_cotizacion")
	private String nombreCotizacion;

	@Column(name = "nro_cotizacion")
	private int nroCotizacion;

	@Column(name = "tiempo_entrega")
	private String tiempo_entrega;
	
	@Column(name = "asunto_cotizacion")
	private String asuntoCotizacion;
	
	@Column(name = "estado")
	private int estado;
	

	@ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCotizacion() {
		return nombreCotizacion;
	}

	public void setNombreCotizacion(String nombreCotizacion) {
		this.nombreCotizacion = nombreCotizacion;
	}

	public int getNroCotizacion() {
		return nroCotizacion;
	}

	public void setNroCotizacion(int nroCotizacion) {
		this.nroCotizacion = nroCotizacion;
	}

	public String getTiempo_entrega() {
		return tiempo_entrega;
	}

	public void setTiempo_entrega(String tiempo_entrega) {
		this.tiempo_entrega = tiempo_entrega;
	}

	public String getAsuntoCotizacion() {
		return asuntoCotizacion;
	}

	public void setAsuntoCotizacion(String asuntoCotizacion) {
		this.asuntoCotizacion = asuntoCotizacion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//	public int getIdCliente() {
//		return idCliente;
//	}
//
//	public void setIdCliente(int idCliente) {
//		this.idCliente = idCliente;
//	}
	
}
