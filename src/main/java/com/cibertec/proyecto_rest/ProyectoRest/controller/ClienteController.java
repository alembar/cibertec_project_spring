package com.cibertec.proyecto_rest.ProyectoRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cliente;
import com.cibertec.proyecto_rest.ProyectoRest.service.ClienteService;

@RestController
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente) {		
		
		try {
			clienteService.saveCliente(cliente);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/cliente")
	public List<Cliente> listCliente(){
		return clienteService.listCliente();
	}
	
	@PutMapping("/cliente/{id}")
	public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente,
			@PathVariable("id") int id) {
		try {
			clienteService.updateCliente(cliente, id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/cliente/{id}")
	public String deleteCliente(@PathVariable("id") int id) {
		clienteService.deleteCliente(id);
		return "Eliminado exitosamente";
	}
	
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> FindClienteById(@PathVariable("id") int id) {
		if(clienteService.findClientById(id).isPresent()) {
			return new ResponseEntity<>(clienteService.findClientById(id).get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
