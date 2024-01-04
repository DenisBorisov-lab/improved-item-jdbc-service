package com.example.improveditemjdbcservice.repository;


import com.example.improveditemjdbcservice.model.Item;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class ItemResolver {
    public void insertItem(Connection connection, Item item) {
        try (PreparedStatement statement = connection.prepareStatement(ItemRequests.INSERT_ITEM)) {
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createTable(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(ItemRequests.CREATE_ITEM_TABLE);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
