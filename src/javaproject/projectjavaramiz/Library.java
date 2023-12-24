/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.projectjavaramiz;

/**
 *
 * @author Smart
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void saveBooksToFile(String fileName) {
        List<String> bookData = new ArrayList<>();
        for (Book book : books) {
            bookData.add(book.getTitle() + "," + book.getAuthor().getName() + "," + book.getNo() + ","
                    + book.getGenre() + "," + book.getVersion() + "," + book.getDate().toString());
        }
        FileHandler.saveData(bookData, fileName);
    }

    public void loadBooksFromFile(String fileName) {
        List<String> bookData = FileHandler.loadData(fileName);
        books.clear(); // Clear existing books before loading new data

        for (String line : bookData) {
            String[] parts = line.split(",");
            if (parts.length == 6) {
                String title = parts[0];
                String authorName = parts[1];
                String no = parts[2];
                String genre = parts[3];
                int version = Integer.parseInt(parts[4]);
                String dateStr = parts[5];

                // Assuming you have a method to get an author by name
                Author author = getAuthorByName(authorName);

                // Assuming you have a method to parse date string to Date object
                Date date = parseDateString(dateStr);

                Book book = new Book(title, author, no, genre, version, date);
                books.add(book);
            }
        }
    }

    // Additional methods for managing authors and parsing dates
    // ...

    private Author getAuthorByName(String authorName) {
        // Implement logic to get an author by name
        // Dummy implementation
        return new Author("1", authorName, "Address", new Date());
    }

    private Date parseDateString(String dateStr) {
        // Implement logic to parse date string to Date object
        // Dummy implementation
        return new Date();
    }

    
}
