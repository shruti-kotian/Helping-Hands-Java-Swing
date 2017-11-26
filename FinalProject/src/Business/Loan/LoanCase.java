/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Loan;

import Business.Employee.Employee;

/**
 *
 * @author shwetatatiya
 */
public class LoanCase {
    private String caseDetails ;
    private String speciality ;
    private Employee specialityAdder ;
    private int loanAmount ;
    private int loanDuration ;
    private int installment ;
    private String repaymentStartMonth ;
    private String repaymentStartYear;
    private Category category ;
    
    
    public enum Category {
       Health("Health");
        
        private String value ;
        
        private Category(String value){
            this.value = value ;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value ;
        }
        
    }    

    public String getRepaymentStartYear() {
        return repaymentStartYear;
    }

    public void setRepaymentStartYear(String repaymentStartYear) {
        this.repaymentStartYear = repaymentStartYear;
    }

    public LoanCase() {
     
    }

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
    }


    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Employee getSpecialityAdder() {
        return specialityAdder;
    }

    public void setSpecialityAdder(Employee specialityAdder) {
        this.specialityAdder = specialityAdder;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

  

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public String getRepaymentStartMonth() {
        return repaymentStartMonth;
    }

    public void setRepaymentStartMonth(String repaymentStartMonth) {
        this.repaymentStartMonth = repaymentStartMonth;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }
    
}