package com.cibertec.proyecto_rest.ProyectoRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.proyecto_rest.ProyectoRest.model.Item;
import com.cibertec.proyecto_rest.ProyectoRest.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item saveItem(Item item) {
		return itemRepository.save(item);
		
	}

	@Override
	public List<Item> listItem() {
		return itemRepository.findAll();
	}

	@Override
	public Item updateItem(Item item, int id) {
		Item itemFound = itemRepository.findById(id).get();
		itemFound.setNombreItem(item.getNombreItem());
		itemFound.setDescription(item.getDescription());
		itemFound.setPrecio_unitario(item.getPrecio_unitario());
		
		return itemRepository.save(itemFound);
	}

	@Override
	public void deleteItem(int id) {
		itemRepository.deleteById(id);
		
	}	
	
	@Override
	public Optional<Item> findItemById(int id) {
		return itemRepository.findById(id);
	}
}
