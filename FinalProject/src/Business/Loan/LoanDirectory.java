/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Loan;

import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class LoanDirectory {
    private ArrayList<Loan> loanList ;

    public LoanDirectory() {
        loanList = new ArrayList<>();
    }

    public ArrayList<Loan> getLoanList() {
        return loanList;
    }

    public void setLoanList(ArrayList<Loan> loanList) {
        this.loanList = loanList;
    }
    
    public void addLoan(Loan loan)
    {
        loanList.add(loan);
    }

 
}
