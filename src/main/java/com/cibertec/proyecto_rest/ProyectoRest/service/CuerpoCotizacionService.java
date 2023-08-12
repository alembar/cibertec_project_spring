package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;

import com.cibertec.proyecto_rest.ProyectoRest.model.CuerpoCotizacion;

public interface CuerpoCotizacionService {
	CuerpoCotizacion saveCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion);
	CuerpoCotizacion updateCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion, int id);
	void deleteCuerpoCotizacion(int id);
    List<CuerpoCotizacion> findCuerpoCotizacionByIdCotizacion(int idCotizacion);
}
	