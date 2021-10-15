package com.TSITraining.Library;


public class Main {

    private static LibraryItems book;

    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "Thirty", "J K Rowling", "Hard Back", "Fiction");
        book.getTitle();
        Book book1 = new Book("Poe", "Paperback","Fiction");
        book1.getAuthor();
        Book book2 = new Book("Stephen Hawking", "Hard back");
        book2.getTitle();
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

    }
}

