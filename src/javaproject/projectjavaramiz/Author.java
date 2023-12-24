/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjavaramiz;

/**
 *
 * @author Smart
 */ import java.util.Date;
    public class Author implements Display {
    private String id;
    private String name;
    private String address;
    private Date birthDate;

    public Author(String id, String name, String address, Date birthDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String getInfo() {
        return String.format("ID: %s, Name: %s, Address: %s, Birth Date: %s",
                id, name, address, birthDate.toString());
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


  