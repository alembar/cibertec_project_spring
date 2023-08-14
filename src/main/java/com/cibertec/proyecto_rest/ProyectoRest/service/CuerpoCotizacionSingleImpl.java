package com.cibertec.proyecto_rest.ProyectoRest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.repository.CuerpoCotizacionSingleRepository;
@Service
public class CuerpoCotizacionSingleImpl implements CuerpoCotizacionSingleService {
	
	@Autowired
	private CuerpoCotizacionSingleRepository cuerpoCotizacionSingleRepository;

	@Override
	public void deleteCuerpoCotizacionSingle(int id) {
		cuerpoCotizacionSingleRepository.deleteById(id);
	}

}
