
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Loan.Loan;
import Business.Loan.LoanCase;
import Business.Loan.LoanDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shwetatatiya
 */
public class HelpingHandsEnterprise extends Enterprise{
    
    private LoanDirectory loanDirectory ;

    public HelpingHandsEnterprise(String name, EnterpriseType enterpriseType) {
        super(name, enterpriseType);
        loanDirectory = new LoanDirectory();        
    }
    
    public HelpingHandsEnterprise(){
        super();
        loanDirectory = new LoanDirectory();
    }

    public LoanDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }

    

    @Override
    public ArrayList<Role> getSupportedRole() {    
       return null; 
    }

    public Loan getLoanFromLoanCase(LoanCase loanCase) {
        for(Loan loan : this.getLoanDirectory().getLoanList()){
            if(loan.getLoanCase().equals(loanCase)){
                return loan ;
            }
        }
        return null ;
    } 
 
}
