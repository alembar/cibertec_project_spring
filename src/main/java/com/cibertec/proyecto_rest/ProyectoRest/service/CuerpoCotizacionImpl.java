package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.model.CuerpoCotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.repository.CuerpoCotizacionRepository;

@Service
public class CuerpoCotizacionImpl implements CuerpoCotizacionService {
	
	@Autowired
	private CuerpoCotizacionRepository cuerpoCotizacionRepository;
	
	@Override
	public CuerpoCotizacion saveCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CuerpoCotizacion updateCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCuerpoCotizacion(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CuerpoCotizacion> findCuerpoCotizacionByIdCotizacion(int idCotizacion) {
		return cuerpoCotizacionRepository.findByCotizacionId(idCotizacion);
	}
	
	

	
	

}
