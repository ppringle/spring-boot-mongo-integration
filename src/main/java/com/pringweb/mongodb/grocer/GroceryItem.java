package com.pringweb.mongodb.grocer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("groceryItems")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroceryItem {

    @Id
    private String id;

    private String name;

    private int quantity;

    private String category;

}