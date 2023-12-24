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
public class Journal implements Display {
    private String conferenceName;
    private String conferenceNo;

    public Journal(String conferenceName, String conferenceNo) {
        this.conferenceName = conferenceName;
        this.conferenceNo = conferenceNo;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public String getConferenceNo() {
        return conferenceNo;
    }

    @Override
    public String getInfo() {
        return String.format("Conference Name: %s, Conference No: %s", conferenceName, conferenceNo);
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