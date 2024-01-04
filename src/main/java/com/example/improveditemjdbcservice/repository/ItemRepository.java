package com.example.improveditemjdbcservice.repository;

import com.example.improveditemjdbcservice.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class ItemRepository {

    private ItemResolver itemResolver;

    @Autowired
    public ItemRepository(ItemResolver itemResolver) {
        this.itemResolver = itemResolver;
    }

    private final String URL = "jdbc:postgresql://localhost:5432/item_service";
    private final String USER = "admin";
    private final String PASSWORD = "1234";


    public void saveItem(Item item) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            itemResolver.createTable(connection);
            itemResolver.insertItem(connection, item);
        } catch (SQLException exception) {
            throw new RuntimeException();
        }
    }
}
