package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.repository.CotizacionRepository;

@Service
public class CotizacionImpl implements CotizacionService {
	
	@Autowired
	private CotizacionRepository cotizacionRepository;

	@Override
	public Cotizacion saveCotizacion(Cotizacion cotizacion) {
		return cotizacionRepository.save(cotizacion);
	}

	@Override
	public List<Cotizacion> listCotizacion() {
		return cotizacionRepository.findAll();
	}

	@Override
	public Cotizacion updateCotizacion(Cotizacion cotizacion, int id) {
		Cotizacion cotizacionFound = cotizacionRepository.findById(id).get();
		cotizacionFound.setNombreCotizacion(cotizacion.getNombreCotizacion());
		cotizacionFound.setNroCotizacion(cotizacion.getNroCotizacion());
		cotizacionFound.setTiempo_entrega(cotizacion.getTiempo_entrega());
		cotizacionFound.setAsuntoCotizacion(cotizacion.getAsuntoCotizacion());
		cotizacionFound.setEstado(cotizacion.getEstado());
//		cotizacionFound.setIdCliente(cotizacion.getIdCliente());
		
		
		return cotizacionRepository.save(cotizacionFound);
	}

	@Override
	public void deleteCotizacion(int id) {
		cotizacionRepository.deleteById(id);
		
	}

	@Override
	public Optional<Cotizacion> findCotizacionById(int id) {
		return cotizacionRepository.findById(id);
	}

}
