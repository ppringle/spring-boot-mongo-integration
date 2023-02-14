package com.pringweb.mongodb.grocer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/groceries")
@AllArgsConstructor
public class GroceryController {

    private final GroceryItemRepository groceryItemRepository;

    @PostMapping(value = "")
    public List<GroceryItem> createGroceryItems(@RequestBody List<GroceryItem> groceryItems) {
        return groceryItemRepository.saveAll(groceryItems);
    }

    @GetMapping("")
    public List<GroceryItem> getGroceryItems() {
        return groceryItemRepository.findAll();
    }

    @GetMapping("/category/{categoryName}")
    public List<GroceryItem> getGroceryItemsByCategory(@PathVariable String categoryName) {
        return groceryItemRepository.findAllByCategory(categoryName);
    }

    @DeleteMapping(value = "")
    public void deleteAll() {
        groceryItemRepository.deleteAll();
    }

}
