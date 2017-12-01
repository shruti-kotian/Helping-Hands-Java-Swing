/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LenderRole;

import Business.Loan.Loan;
import javax.swing.JPanel;

/**
 *
 * @author Shrutik
 */
public class ViewBorrowerLoanCaseJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer ;
    private Loan loan;
    /**
     * Creates new form ViewBorrowerLoanCaseJPanel
     */
    public ViewBorrowerLoanCaseJPanel(JPanel userProcessContainer,Loan loan) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.loan = loan;
        
        populateData();
    }
    
      public void populateData()
    {
        txtStory.setText(loan.getLoanCase().getCaseDescripton());
        labelYearlyIncome.setText(String.valueOf(loan.getBorrower().getYearlyIncome()));
        labelLoanLength.setText(String.valueOf(loan.getLoanCase().getLoanLength()));
        labelLoanAnmount.setText(String.valueOf(loan.getLoanCase().getLoanAmount()));
        labelRepaymentMonthlyInstalment.setText(String.valueOf(loan.getLoanCase().getInstallment()));
        labelRepaymentSrtmont.setText(loan.getLoanCase().getRepaymentStartMonth());
        labelRepaymntStartyr.setText(loan.getLoanCase().getRepaymentStartYear());
        labelFullName.setText(loan.getBorrower().getName());
        labelAddress.setText(loan.getBorrower().getAddress());
        labelOccupation.setText(loan.getBorrower().getOccupation());
        labelFiledPartnerName.setText(loan.getFieldPartnerContact().getName());
       
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStory = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelFullName = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelOccupation = new javax.swing.JLabel();
        labelYearlyIncome = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        labelLoanLength = new javax.swing.JLabel();
        labelCategory = new javax.swing.JLabel();
        labelRepaymentMonthlyInstalment = new javax.swing.JLabel();
        labelRepaymentSrtmont = new javax.swing.JLabel();
        labelRepaymntStartyr = new javax.swing.JLabel();
        labelFiledPartnerName = new javax.swing.JLabel();
        labelLoanAnmount = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  BORROWER LOAN CASE  ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 64));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  LOAN CASE DETAILS  ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  STORY/MOTIVATION  ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtStory.setColumns(20);
        txtStory.setRows(5);
        txtStory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane1.setViewportView(txtStory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 355, 184));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("  BORROWER DETAILS  ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  FULL NAME  ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  ADDRESS  ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("  AGE  ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  OCCUPATION  ");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("  YEARLY INCOME  ");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 690, -1, -1));

        labelFullName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelFullName.setForeground(new java.awt.Color(255, 255, 255));
        labelFullName.setText("Full Name");
        add(labelFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 535, -1, -1));

        labelAddress.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(255, 255, 255));
        labelAddress.setText("Address");
        add(labelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 578, -1, -1));

        labelAge.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelAge.setForeground(new java.awt.Color(255, 255, 255));
        labelAge.setText("Age");
        add(labelAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 605, -1, -1));

        labelOccupation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelOccupation.setForeground(new java.awt.Color(255, 255, 255));
        labelOccupation.setText("labelOccupatrion");
        add(labelOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 644, -1, -1));

        labelYearlyIncome.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelYearlyIncome.setForeground(new java.awt.Color(255, 255, 255));
        labelYearlyIncome.setText("yearlyIncome");
        add(labelYearlyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 687, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  LOAN LENGTH  ");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 200, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("  CATEGORY  ");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 259, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("  REPAYMENT MONTHLY INSTALLMENT  ");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 302, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("  REPAYMENT START MONTH  ");
        jLabel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 345, -1, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("  REPAYMENT START YEAR  ");
        jLabel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 388, -1, -1));

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("  FIELD PARTNER  ");
        jLabel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 431, -1, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("  LOAN AMOUNT  ");
        jLabel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 513, -1, -1));

        labelLoanLength.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelLoanLength.setForeground(new java.awt.Color(255, 255, 255));
        labelLoanLength.setText("Loan Length");
        add(labelLoanLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 217, -1, -1));

        labelCategory.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelCategory.setForeground(new java.awt.Color(255, 255, 255));
        labelCategory.setText("Category");
        add(labelCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, -1, 28));

        labelRepaymentMonthlyInstalment.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelRepaymentMonthlyInstalment.setForeground(new java.awt.Color(255, 255, 255));
        labelRepaymentMonthlyInstalment.setText("repayment Monthly instalment");
        add(labelRepaymentMonthlyInstalment, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 305, -1, -1));

        labelRepaymentSrtmont.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelRepaymentSrtmont.setForeground(new java.awt.Color(255, 255, 255));
        labelRepaymentSrtmont.setText("repayment srt mont");
        add(labelRepaymentSrtmont, new org.netbeans.lib.awtextra.AbsoluteConstraints(847, 354, -1, -1));

        labelRepaymntStartyr.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelRepaymntStartyr.setForeground(new java.awt.Color(255, 255, 255));
        labelRepaymntStartyr.setText("repaymnt start yr");
        add(labelRepaymntStartyr, new org.netbeans.lib.awtextra.AbsoluteConstraints(869, 396, -1, -1));

        labelFiledPartnerName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelFiledPartnerName.setForeground(new java.awt.Color(255, 255, 255));
        labelFiledPartnerName.setText("filed partner name");
        add(labelFiledPartnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 438, -1, 16));

        labelLoanAnmount.setText("loan amount");
        add(labelLoanAnmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(949, 522, -1, -1));

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("  FIELD PARTNER RISK RATING  ");
        jLabel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 605, 308, 44));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelFiledPartnerName;
    private javax.swing.JLabel labelFullName;
    private javax.swing.JLabel labelLoanAnmount;
    private javax.swing.JLabel labelLoanLength;
    private javax.swing.JLabel labelOccupation;
    private javax.swing.JLabel labelRepaymentMonthlyInstalment;
    private javax.swing.JLabel labelRepaymentSrtmont;
    private javax.swing.JLabel labelRepaymntStartyr;
    private javax.swing.JLabel labelYearlyIncome;
    private javax.swing.JTextArea txtStory;
    // End of variables declaration//GEN-END:variables
}
