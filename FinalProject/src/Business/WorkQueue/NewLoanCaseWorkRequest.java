<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Loan.Loan;
import Business.Person.Borrower;

/**
 *
 * @author Shrutik
 */
public class NewLoanCaseWorkRequest extends WorkRequest {

    private Borrower borrower;
    private Loan loan;
    private Status status;

    @Override
    public String getNameOfRelevantOrg() {
        return borrower.getName();
    }

    public enum Status {
        NewLoanCase("New Loan Case"),
        RepresentativeApproved("Representative Approved"),
        RepresentativeRejected("Representative Rejected"),
        TrusteeApproved("Trustee Approved"),
        TrusteeRejected("Trustee Rejected"),
        Complete("Complete");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

    }

    public NewLoanCaseWorkRequest() {
        super();
        status = NewLoanCaseWorkRequest.Status.NewLoanCase;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    @Override
    public String getStatus() {
        return status.getValue();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return borrower.getName();
    }

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Loan.Loan;
import Business.Person.Borrower;
import Business.Loan.LoanCase;


/**
 *
 * @author Shrutik
 */
public class NewLoanCaseWorkRequest extends WorkRequest{
    
    private Borrower borrower ;
    private Loan loan ;
    private Status status ;

    @Override
    public String getNameOfRelevantOrg() {
        return borrower.getName();
    }
    
    public enum Status{
        NewLoanCase("New Loan Case"),
        RepresentativeApproved("Representative Approved"),
        RepresentativeRejected("Representative Rejected"),        
        TrusteeApproved("Trustee Approved"),
        TrusteeRejected("Trustee Rejected"),
        Complete("Complete") ;
        
        private String value ;
        
        Status(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        
    }    

    public NewLoanCaseWorkRequest() {
        super();
        status = NewLoanCaseWorkRequest.Status.NewLoanCase ;
    }
    
    

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    @Override
    public String getStatus() {
        return status.getValue();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    @Override
    public String toString ()
    {
        return borrower.getName();
    }
    
}
>>>>>>> master
