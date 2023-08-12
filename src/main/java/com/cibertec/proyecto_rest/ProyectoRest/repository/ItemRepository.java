package com.cibertec.proyecto_rest.ProyectoRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.proyecto_rest.ProyectoRest.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
