package com.cibertec.proyecto_rest.ProyectoRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto_rest.ProyectoRest.model.CuerpoCotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.service.CuerpoCotizacionService;

@RestController
public class CuerpoCotizacionController {
	@Autowired
	private CuerpoCotizacionService cuerpoCotizacionService;
	
	@Autowired
    public CuerpoCotizacionController(CuerpoCotizacionService cuerpoCotizacionService) {
        this.cuerpoCotizacionService = cuerpoCotizacionService;
    }
	
	@GetMapping("/cuerpocotizacion/{idCotizacion}")
	@CrossOrigin(origins = "http://localhost:3000")
    public List<CuerpoCotizacion> getCuerpoCotizacionByIdCotizacion(@PathVariable int idCotizacion) {
        return cuerpoCotizacionService.findCuerpoCotizacionByIdCotizacion(idCotizacion);
    }
}
