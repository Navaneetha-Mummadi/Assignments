package com.springboot17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class GroceryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroceryApplication.class, args);
    }
}
/*

http://localhost:8080/api/grocery
📁 GroceryItem CRUD Collection

1️⃣ Create Grocery Item (POST)
Method: POST
URL: http://localhost:8080/api/grocery
Body (JSON):

{
  "name": "Milk",
  "quantity": 2,
  "price": 45.50
}
Headers:
Content-Type: application/json


2️⃣ Get All Grocery Items (GET)
Method: GET
URL: http://localhost:8080/api/grocery

3️⃣ Get Grocery Item by ID (GET)
Method: GET
URL: http://localhost:8080/api/grocery/1
(Replace 1 with any valid ID)

4️⃣ Update Grocery Item (PUT)
Method: PUT
URL: http://localhost:8080/api/grocery/1
Body (JSON):
{
  "name": "Milk",
  "quantity": 3,
  "price": 48.00
}
(Replace 1 with the ID of the item you want to update)

5️⃣ Delete Grocery Item (DELETE)
Method: DELETE
URL: http://localhost:8080/api/grocery/1
(Replace 1 with the ID to delete)


*/