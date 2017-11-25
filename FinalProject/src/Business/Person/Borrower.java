/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;


/**
 *
 * @author shwetatatiya
 */
public class Borrower extends Person {
    private String occupation ;
    private int yearlyIncome ;
    private int dOb ;
    private String emailId ;
    private String contactNo ;
    
    public Borrower() {
    //no need to instantiate accountManagement or loan here    
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(int yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getdOb() {
        return dOb;
    }

    public void setdOb(int dOb) {
        this.dOb = dOb;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString(){
        return this.getName();
    }
    
}
