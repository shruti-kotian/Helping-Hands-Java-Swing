/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepresentativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpingHandsEnterprise;
import Business.Loan.Loan;
import Business.Loan.LoanCase;
import Business.Organization.FieldPartnerOrganization;
import Business.Organization.TrusteeOrganization;
import Business.Person.Borrower;
import Business.WorkQueue.NewLoanCaseWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shrutik
 */
public class RepresentativeLoanCaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HelpingHandsEnterprise business;
    private NewLoanCaseWorkRequest newLoanCaseWorkRequest;
    private TrusteeOrganization trusteeOrganization;
    private Employee representative;

    /**
     * Creates new form RepresentativeLoanCaseJPanel
     */
    public RepresentativeLoanCaseJPanel() {
        initComponents();
    }

    RepresentativeLoanCaseJPanel(JPanel userProcessContainer, Enterprise business, NewLoanCaseWorkRequest newLoanCaseWorkRequest, TrusteeOrganization trusteeOrganization, Employee representative) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = (HelpingHandsEnterprise) business;
        this.newLoanCaseWorkRequest = newLoanCaseWorkRequest;
        this.trusteeOrganization = trusteeOrganization;
        this.representative = representative;
        populateScreenData();
    }

     public void populateScreenData(){
     
        Borrower borrower = newLoanCaseWorkRequest.getBorrower() ;
        Loan loan = newLoanCaseWorkRequest.getLoan() ;
        LoanCase loanCase = loan.getLoanCase();
        
    lblAmount.setText(String.valueOf(loanCase.getLoanAmount()));
    lblBorrower.setText(borrower.getName());
    lblCategory.setText(String.valueOf(loanCase.getCategory().getValue()));
    lblFieldPartner.setText(String.valueOf(loan.getFieldPartnerContact()));
    lblFullName.setText(borrower.getName());
    lblLength.setText(String.valueOf(loanCase.getLoanLength()));
    lblMonthlyInstallment.setText(String.valueOf(loanCase.getInstallment()));
    lblOccupation.setText(borrower.getOccupation());
    lblStartMonth.setText(loanCase.getRepaymentStartMonth());
    lblStartYear.setText(loanCase.getRepaymentStartYear());
    lblYearlyIncome.setText(String.valueOf(borrower.getYearlyIncome()));
    txtStory.setText(loanCase.getCaseDescripton());        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLength = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtStory = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        lblBorrower = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMonthlyInstallment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblStartMonth = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblStartYear = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblYearlyIncome = new javax.swing.JLabel();
        lblBorrowerHistory1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnSendToTrustee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblFieldPartner = new javax.swing.JLabel();
        btnFieldPartner = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOAN CASE DETAILS -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 250, 36));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STORY");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 68, 24));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("LOAN LENGTH ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 100, 191, 24));

        lblLength.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLength.setText("label");
        jPanel1.add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 99, 123, 24));

        txtStory.setEditable(false);
        txtStory.setColumns(20);
        txtStory.setRows(5);
        txtStory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane1.setViewportView(txtStory);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 355, 211));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("BORROWER ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 131, 191, 24));

        lblBorrower.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblBorrower.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrower.setText("label");
        jPanel1.add(lblBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 130, 123, 24));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("CATEGORY ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 162, 191, 24));

        lblCategory.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategory.setText("label");
        jPanel1.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 161, 123, 24));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText(" REPAYMENT MONTHLY INSTALLEMNT ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, -1, 24));

        lblMonthlyInstallment.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMonthlyInstallment.setForeground(new java.awt.Color(255, 255, 255));
        lblMonthlyInstallment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonthlyInstallment.setText("label");
        jPanel1.add(lblMonthlyInstallment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 192, 123, 24));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("REPAYMENT START MONTH ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 224, 292, 24));

        lblStartMonth.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartMonth.setForeground(new java.awt.Color(255, 255, 255));
        lblStartMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartMonth.setText("label");
        jPanel1.add(lblStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 223, 123, 24));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("REPAYMENT START YEAR ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 255, 292, 24));

        lblStartYear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartYear.setForeground(new java.awt.Color(255, 255, 255));
        lblStartYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartYear.setText("label");
        jPanel1.add(lblStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 254, 123, 24));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BORROWER DETAILS -");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 250, 37));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText(" FULL NAME ");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 137, 24));

        lblFullName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFullName.setText("label");
        jPanel1.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 123, 24));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("OCCUPATION ");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 137, 24));

        lblOccupation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblOccupation.setForeground(new java.awt.Color(255, 255, 255));
        lblOccupation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOccupation.setText("label");
        jPanel1.add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 123, 24));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("YEARLY INCOME ");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 137, 24));

        lblYearlyIncome.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblYearlyIncome.setForeground(new java.awt.Color(255, 255, 255));
        lblYearlyIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYearlyIncome.setText("label");
        jPanel1.add(lblYearlyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 123, 24));

        lblBorrowerHistory1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBorrowerHistory1.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrowerHistory1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrowerHistory1.setText("REPRESENTATIVE FEEDBACK -");
        lblBorrowerHistory1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(lblBorrowerHistory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 710, 250, 32));

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("THIS LOAN IS SIGNIFICANT BECAUSE...");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 760, 270, 24));

        txtFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 800, 903, 43));

        btnSendToTrustee.setBackground(new java.awt.Color(153, 153, 153));
        btnSendToTrustee.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSendToTrustee.setForeground(new java.awt.Color(51, 0, 51));
        btnSendToTrustee.setText(" APPROVE - SEND TO TRUSTEE ORGANIZATION >>");
        btnSendToTrustee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnSendToTrustee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToTrusteeActionPerformed(evt);
            }
        });
        jPanel1.add(btnSendToTrustee, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 870, -1, 42));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 51));
        btnBack.setText("<<BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 870, 157, 42));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("LOAN AMOUNT ");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 292, 292, 24));

        lblAmount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmount.setText("label");
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 291, 123, 24));

        btnReject.setBackground(new java.awt.Color(153, 153, 153));
        btnReject.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(51, 0, 51));
        btnReject.setText("REJECT THE LOAN >>");
        btnReject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        jPanel1.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 870, 249, 42));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("FIELD PARTNER CONTACT ");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, -1, -1));

        lblFieldPartner.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFieldPartner.setForeground(new java.awt.Color(255, 255, 255));
        lblFieldPartner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFieldPartner.setText("label");
        jPanel1.add(lblFieldPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, -1, -1));

        btnFieldPartner.setBackground(new java.awt.Color(153, 153, 153));
        btnFieldPartner.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnFieldPartner.setForeground(new java.awt.Color(51, 0, 51));
        btnFieldPartner.setText("VIEW FIELD PARTNER >>");
        btnFieldPartner.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnFieldPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFieldPartnerActionPerformed(evt);
            }
        });
        jPanel1.add(btnFieldPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REPRESENTATIVE LOAN CASE");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendToTrusteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToTrusteeActionPerformed
        // TODO add your handling code here:
        String feedback = txtFeedback.getText().trim();
        if (feedback == "") {
            JOptionPane.showMessageDialog(null, "Please enter a feedback", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        newLoanCaseWorkRequest.getLoan().getLoanCase().setSpeciality(feedback);
        newLoanCaseWorkRequest.getLoan().getLoanCase().setSpecialityAdder(representative);

        newLoanCaseWorkRequest.setRepresentative(representative);
        newLoanCaseWorkRequest.setMessage("Please review this aplication for new Loan");
        newLoanCaseWorkRequest.setStatus(NewLoanCaseWorkRequest.Status.RepresentativeApproved);
        trusteeOrganization.getWorkQueue().addWorkRequest(newLoanCaseWorkRequest);

        JOptionPane.showMessageDialog(null, "Work Request sent to Trustee Organization", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSendToTrusteeActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        newLoanCaseWorkRequest.setRepresentative(representative);
        newLoanCaseWorkRequest.setMessage("");
        newLoanCaseWorkRequest.setStatus(NewLoanCaseWorkRequest.Status.RepresentativeRejected);

        JOptionPane.showMessageDialog(null, "Work Request rejected and sent to Borrower", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        int length = userProcessContainer.getComponentCount();
        RepresentativeWorkAreaJPanel awajp = (RepresentativeWorkAreaJPanel) userProcessContainer.getComponent(length - 1);
        awajp.populateTblRepresentativeOrganizationWorkQueue();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFieldPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFieldPartnerActionPerformed
        // TODO add your handling code here:
        FieldPartnerOrganization fieldPrtnerOrg = business.getFieldPartnerFromContact(newLoanCaseWorkRequest.getLoan().getFieldPartnerContact());
        ViewFieldPartnerJPanel vfpjp = new ViewFieldPartnerJPanel(userProcessContainer, fieldPrtnerOrg, newLoanCaseWorkRequest.getLoan().getFieldPartnerContact());
        userProcessContainer.add("ViewFieldPartnerJPanel", vfpjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnFieldPartnerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFieldPartner;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSendToTrustee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBorrower;
    private javax.swing.JLabel lblBorrowerHistory1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblFieldPartner;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblMonthlyInstallment;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblStartMonth;
    private javax.swing.JLabel lblStartYear;
    private javax.swing.JLabel lblYearlyIncome;
    private javax.swing.JTextField txtFeedback;
    private javax.swing.JTextArea txtStory;
    // End of variables declaration//GEN-END:variables

}
