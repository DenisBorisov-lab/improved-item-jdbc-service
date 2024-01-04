package com.example.improveditemjdbcservice.controller;

import com.example.improveditemjdbcservice.model.Item;
import com.example.improveditemjdbcservice.model.ItemDto;
import com.example.improveditemjdbcservice.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/item")
public class ItemController {
    private ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> saveItem(@RequestBody ItemDto itemDto) {
        itemService.save(itemDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/delete_by_id")
    public ResponseEntity<String> removeItemById(@RequestParam Integer id) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/delete_by_name")
    public ResponseEntity<String> removeItemByName(@RequestParam String name) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get/{itemId}")
    public Item getItemById(@PathVariable Integer itemId) {
        return null;
    }

    @GetMapping("/get/{itemName}")
    public Item getItemByName(@PathVariable String itemName) {
        return null;
    }

    @PostMapping("/change")
    public ResponseEntity<String> changeItem(@RequestBody ItemDto itemDto) {
        return ResponseEntity.ok().build();
    }
}
