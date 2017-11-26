/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Loan;

import Business.Person.Borrower;



/**
 *
 * @author shwetatatiya
 */
public class Loan {
   
    private LoanCase loanCase ;
    private Borrower borrower ;
    private LoanStatus loanStatus ;


    
    public enum LoanStatus {
        FundingNeeded("Funding Needed"),
        PartlyFunded("Partly Funded"),
        FullyFunded("FullyFunded. Waiting for Repayment"),
        PartlyRepayed("Partly Repayed"),
        FullyRepayed("Fully Repayed");
        
        private String value ;
        
        LoanStatus(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    } 

    public LoanCase getLoanCase() {
        return loanCase;
    }

    public void setLoanCase(LoanCase loanCase) {
        this.loanCase = loanCase;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

  

    public LoanStatus getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.loanStatus = loanStatus;
    }

   
     
    

    
    @Override
    public String toString(){
        return borrower.getName();
    }
    
     
    
}
