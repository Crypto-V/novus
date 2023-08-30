package week2.libraryApp;

import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        var myBooks = new ArrayList<Book>();

        var book1 = new Book("Tackle", new Author("Jully Cooper", "jc@gmail.com", 'F'), 11, 11);
        var book2 = new Book("Breakfast Club Adventures", new Author("Marcus Rashford", "mr@gmail.com", 'M'), 4, 20);
        var book3 = new Book("The Cruise", new Author("Caroline James", "cj@gmail.com", 'F'), 8.27, 15);

        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);

        for (Book b : myBooks) {
            System.out.println(b + " by " + b.getAuthor().getName());
        }


    }
}
