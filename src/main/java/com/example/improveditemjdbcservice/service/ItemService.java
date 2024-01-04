package com.example.improveditemjdbcservice.service;

import com.example.improveditemjdbcservice.model.Item;
import com.example.improveditemjdbcservice.model.ItemDto;
import com.example.improveditemjdbcservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private ItemRepository repository;

    @Autowired
    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public void save(ItemDto itemDto) {
        Item item = Item.builder().name(itemDto.getName()).price(itemDto.getPrice()).build();
        repository.saveItem(item);
    }
}
