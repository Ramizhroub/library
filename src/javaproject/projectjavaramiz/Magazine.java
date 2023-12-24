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

public class Magazine implements Display {
    private String issueNo;
    private Date releaseDate;

    public Magazine(String issueNo, Date releaseDate) {
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public String getIssueNo() {
        return issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String getInfo() {
        return String.format("Issue No: %s, Release Date: %s", issueNo, releaseDate.toString());
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
