package com.TSITraining.Library;

public class Main {


    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "Thirty", "J K Rowling", "Hard Back", "Fiction");
        book.getTitle();
        Book book1 = new Book("Poe", "Paperback", "Fiction");
        book1.getAuthor();
        Book book2 = new Book("Stephen Hawking", "Hard back");
        book2.getTitle();
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

        DVD dvd = new DVD ("Avatar", "James Cameron", 2009);
        dvd.getDirector();
    }

}

