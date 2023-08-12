package com.cibertec.proyecto_rest.ProyectoRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto_rest.ProyectoRest.model.CuerpoCotizacion;

public interface CuerpoCotizacionRepository extends JpaRepository<CuerpoCotizacion, Integer>{
	List<CuerpoCotizacion> findByCotizacionId(int idCotizacion);
}
