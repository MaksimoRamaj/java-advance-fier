package org.example.oop.interfaces.example1;

public class Document implements Printable {

    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("Te dhenat e dokumentit: " +
                content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
