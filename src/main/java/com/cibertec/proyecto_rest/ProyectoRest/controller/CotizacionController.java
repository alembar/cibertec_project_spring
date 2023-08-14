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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cotizacion;
import com.cibertec.proyecto_rest.ProyectoRest.service.CotizacionService;

@RestController
public class CotizacionController {
	@Autowired
	private CotizacionService cotizacionService;
	
	@PostMapping("/cotizacion")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Cotizacion> saveCotizacion(@RequestBody Cotizacion cotizacion) {		
		try {
			Cotizacion coti = new Cotizacion();
			coti = cotizacionService.saveCotizacion(cotizacion);
			return new ResponseEntity<>(coti, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/cotizacion")
	@CrossOrigin(origins = "http://localhost:3000")
	public List<Cotizacion> listItem(){
		return cotizacionService.listCotizacion();
	}
	
	@PutMapping("/cotizacion/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Cotizacion> updateItem(@RequestBody Cotizacion cotizacion,
			@PathVariable("id") int id) {
		try {
			cotizacionService.updateCotizacion(cotizacion, id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/cotizacion/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public String deleteItem(@PathVariable("id") int id) {
		cotizacionService.deleteCotizacion(id);
		return "deleted";
	}
	
	@GetMapping("/cotizacion/{id}")
	@CrossOrigin(origins = "http://localhost:3000")
	public ResponseEntity<Cotizacion> FindItemById(@PathVariable("id") int id) {
		if(cotizacionService.findCotizacionById(id).isPresent()) {
			return new ResponseEntity<>(cotizacionService.findCotizacionById(id).get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
