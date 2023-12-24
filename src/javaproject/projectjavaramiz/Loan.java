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

public class Loan implements Display {
    private Date dueDate;

    public Loan(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public String getInfo() {
        return String.format("Due Date: %s", dueDate.toString());
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
    

