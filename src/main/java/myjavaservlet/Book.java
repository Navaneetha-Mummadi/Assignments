package myjavaservlet;

public class Book {
    private int id;
    private String title;
    private String author;
    private float price;

    public Book() {}

    public Book(int id, String title, String author, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters and Setters
}
