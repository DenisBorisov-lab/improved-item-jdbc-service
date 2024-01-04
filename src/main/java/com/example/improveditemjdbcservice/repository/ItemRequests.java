package com.example.improveditemjdbcservice.repository;

public class ItemRequests {
    public static final String CREATE_ITEM_TABLE = "create table if not exists item(" +
            "    id bigserial primary key," +
            "    name varchar (50)," +
            "    price float" +
            ")";
    public static final String INSERT_ITEM = "insert into item (name, price) values (?, ?)";
}
