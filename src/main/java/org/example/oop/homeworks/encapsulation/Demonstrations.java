package org.example.oop.homeworks.encapsulation;

public class Demonstrations {
    public static void main(String[] args) {
        Book book = new Book("Kein and Abel","Jeffrey Archer",2014);
        Book book1 = new Book();
        System.out.println("Success case : ");
        System.out.println();
        System.out.println("Book data : ");
        System.out.println();
        System.out.println("Title : " + book.getTitle());
        System.out.println("Author : " + book.getAuthor());
        System.out.println("Publication year : " + book.getPublicationYear());
        System.out.println();
        System.out.println("Fail case : ");
        System.out.println();
        book1.setTitle("");
        book1.setAuthor("");
        book1.setPublicationYear(-2014);

    }
}
