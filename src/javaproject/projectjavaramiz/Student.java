/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjavaramiz;

/**
 *
 * @author Smart
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student implements Display {
    private String id;
    private String name;
    private String address;
    private Date birthDate;
    private String major;
    private List<Book> borrowedBooks;

    public Student(String id, String name, String address, Date birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getInfo() {
        return String.format("ID: %s, Name: %s, Address: %s, Birth Date: %s, Major: %s",
                id, name, address, birthDate.toString(), major);
    }

    @Override
    public boolean inLoan() {
        return !borrowedBooks.isEmpty();
    }

    public void borrowBook(Book book) {
        if (borrowedBooks.size() < 3) {
            borrowedBooks.add(book);
            System.out.println(name + " has borrowed the book: " + book.getTitle());
        } else {
            System.out.println(name + " cannot borrow more than 3 books at a time.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            System.out.println(name + " has returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow the book: " + book.getTitle());
        }
    }

    @Override
    public void dis(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
