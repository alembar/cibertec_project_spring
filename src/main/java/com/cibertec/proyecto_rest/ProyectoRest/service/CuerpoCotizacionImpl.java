package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.model.CuerpoCotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.repository.CuerpoCotizacionRepository;

@Service
public class CuerpoCotizacionImpl implements CuerpoCotizacionService {
	
	@Autowired
	private CuerpoCotizacionRepository cuerpoCotizacionRepository;
	
	@Override
	public CuerpoCotizacion saveCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion) {
		return cuerpoCotizacionRepository.save(cuerpoCotizacion);
	}

	@Override
	public CuerpoCotizacion updateCuerpoCotizacion(CuerpoCotizacion cuerpoCotizacion, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCuerpoCotizacion(int id) {
		cuerpoCotizacionRepository.deleteById(id);
	}

	@Override
	public List<CuerpoCotizacion> findCuerpoCotizacionByIdCotizacion(int idCotizacion) {
		return cuerpoCotizacionRepository.findByCotizacionId(idCotizacion);
	}
	
	

	
	

}
