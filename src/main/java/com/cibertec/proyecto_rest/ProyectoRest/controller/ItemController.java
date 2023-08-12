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

import com.cibertec.proyecto_rest.ProyectoRest.model.Item;
import com.cibertec.proyecto_rest.ProyectoRest.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;
	
	@PostMapping("/item")
	public ResponseEntity<Item> saveItem(@RequestBody Item item) {
		try {
			itemService.saveItem(item);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/item")
	public List<Item> listItem(){
		return itemService.listItem();
	}
	
	@PutMapping("/item/{id}")
	public ResponseEntity<Item> updateItem(@RequestBody Item item,
			@PathVariable("id") int id) {
		try {
			itemService.updateItem(item, id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/item/{id}")
	public String deleteItem(@PathVariable("id") int id) {
		itemService.deleteItem(id);
		return "Eliminado exitosamente";
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<Item> FindItemById(@PathVariable("id") int id) {
		if(itemService.findItemById(id).isPresent()) {
			return new ResponseEntity<>(itemService.findItemById(id).get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
