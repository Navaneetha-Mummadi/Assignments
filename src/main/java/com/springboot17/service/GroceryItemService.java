package com.springboot17.service;

import java.util.List;

import com.springboot17.entity.GroceryItem;

public interface GroceryItemService {
    List<GroceryItem> findAll();
    GroceryItem findById(Long id);
    GroceryItem save(GroceryItem item);
    GroceryItem update(Long id, GroceryItem item);
    void delete(Long id);
}