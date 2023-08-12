package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cliente;

public interface ClienteService {
	Cliente saveCliente(Cliente cliente);
	List<Cliente> listCliente();
	Cliente updateCliente(Cliente cliente, int id);
	void deleteCliente(int id);
	Optional<Cliente> findClientById(int id);
	
}
