package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.model.Cliente;
import com.cibertec.proyecto_rest.ProyectoRest.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
		
	}

	@Override
	public List<Cliente> listCliente() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente updateCliente(Cliente cliente, int id) {
		Cliente clienteFound = clienteRepository.findById(id).get();
		clienteFound.setRazonSocial(cliente.getRazonSocial());
		clienteFound.setRuc(cliente.getRuc());
		clienteFound.setCorreoElectronico(cliente.getCorreoElectronico());
		
		return clienteRepository.save(clienteFound);
	}

	@Override
	public void deleteCliente(int id) {
		clienteRepository.deleteById(id);
		
	}
	
	@Override
	public Optional<Cliente> findClientById(int id) {
		return clienteRepository.findById(id);
	}
	
}
