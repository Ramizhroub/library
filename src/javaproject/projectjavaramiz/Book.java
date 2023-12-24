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
import java.util.Date;

public class Book implements Display {
    private String title;
    private Author author;
    private String no;
    private String genre;
    private int version;
    private Date date;

    public Book(String title, Author author, String no, String genre, int version, Date date) {
        this.title = title;
        this.author = author;
        this.no = no;
        this.genre = genre;
        this.version = version;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNo() {
        return no;
    }

    public String getGenre() {
        return genre;
    }

    public int getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getInfo() {
        return String.format("Title: %s, Author: %s, No: %s, Genre: %s, Version: %d, Date: %s",
                title, author.getName(), no, genre, version, date.toString());
    }

    @Override
    public boolean inLoan() {
        return false;
    }

    @Override
    public void dis(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
