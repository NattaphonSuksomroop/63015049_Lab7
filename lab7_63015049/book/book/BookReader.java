package com.solid.book;

import java.util.List;

public class BookReader implements Scan{

    public static void main(String[] args) {

        BookReader bookreader = new BookReader();
        bookreader.printToScreen(); //Print
    }

    @Override
    public void printToScreen() {
        Book book = new Book("Alive", List.of("Do", "not", "stop", "your", "dream"));
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}