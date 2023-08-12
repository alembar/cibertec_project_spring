package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cotizacion;

public interface CotizacionService {
	Cotizacion saveCotizacion(Cotizacion cotizacion);
	List<Cotizacion> listCotizacion();
	Cotizacion updateCotizacion(Cotizacion cotizacion, int id);
	void deleteCotizacion(int id);
	Optional<Cotizacion> findCotizacionById(int id);
}
