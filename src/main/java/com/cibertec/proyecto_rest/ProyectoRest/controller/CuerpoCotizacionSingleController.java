package com.cibertec.proyecto_rest.ProyectoRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.proyecto_rest.ProyectoRest.service.CuerpoCotizacionSingleService;

@RestController
public class CuerpoCotizacionSingleController {
	@Autowired
	private CuerpoCotizacionSingleService cuerpoCotizacionSingleService;
	
	@DeleteMapping("/cuerpocotizacionsingle/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String deleteCliente(@PathVariable("id") int id) {
		cuerpoCotizacionSingleService.deleteCuerpoCotizacionSingle(id);
		return "deleted";
	}
	
}
