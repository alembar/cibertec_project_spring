package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto_rest.ProyectoRest.model.Item;

public interface ItemService {
	Item saveItem(Item item);
	List<Item> listItem();
	Item updateItem(Item item, int id);
	void deleteItem(int id);
	Optional<Item> findItemById(int id);
}
