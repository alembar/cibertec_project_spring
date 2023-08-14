package com.cibertec.proyecto_rest.ProyectoRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/cuerpocotizacion")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<CuerpoCotizacion> saveCuerpoCotizacion(@RequestBody CuerpoCotizacion cuerpoCotizacion) {
		try {
			CuerpoCotizacion cuerpocoti = new CuerpoCotizacion();
			cuerpocoti = cuerpoCotizacionService.saveCuerpoCotizacion(cuerpoCotizacion);
			return new ResponseEntity<>(cuerpocoti, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/cuerpocotizacion/{idCotizacion}")
	@CrossOrigin(origins = "http://localhost:3000")
    public List<CuerpoCotizacion> getCuerpoCotizacionByIdCotizacion(@PathVariable int idCotizacion) {
        return cuerpoCotizacionService.findCuerpoCotizacionByIdCotizacion(idCotizacion);
    }
	
	@DeleteMapping("/cuerpocotizacion/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String deleteItem(@PathVariable("id") int id) {
		cuerpoCotizacionService.deleteCuerpoCotizacion(id);
		return "deleted";
	}
}
