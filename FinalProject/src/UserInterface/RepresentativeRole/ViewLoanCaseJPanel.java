/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepresentativeRole;

import Business.Loan.Loan;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Shrutik
 */
public class ViewLoanCaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Loan loan;

    /**
     * Creates new form PreviousLoanHistoryJPanel
     */
    public ViewLoanCaseJPanel() {
        initComponents();
    }

    ViewLoanCaseJPanel(JPanel userProcessContainer, Loan loan) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.loan = loan;
        populateDataOnScreen();
    }

    public void populateDataOnScreen() {
        lblAmount.setText(String.valueOf(loan.totalLentAmount()));
        lblBorrower.setText(loan.getBorrower().getName());
        lblCategory.setText(loan.getLoanCase().getCategory().getValue());
        lblLength.setText(String.valueOf(loan.getLoanCase().getLoanLength()));
        lblMonthlyInstallment.setText(String.valueOf(loan.getLoanCase().getInstallment()));
        lblStartMonth.setText(loan.getLoanCase().getRepaymentStartMonth());
        lblStartYear.setText(loan.getLoanCase().getRepaymentStartYear());
        txtStory.setText(loan.getLoanCase().getCaseDescripton());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtStory = new javax.swing.JTextArea();
        lblLength = new javax.swing.JLabel();
        lblBorrower = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblMonthlyInstallment = new javax.swing.JLabel();
        lblStartMonth = new javax.swing.JLabel();
        lblStartYear = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblFieldPartner = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStory.setEditable(false);
        txtStory.setColumns(20);
        txtStory.setRows(5);
        txtStory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jScrollPane1.setViewportView(txtStory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 234));

        lblLength.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLength.setText("label");
        add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 123, 24));

        lblBorrower.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblBorrower.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrower.setText("label");
        add(lblBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 123, 24));

        lblCategory.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategory.setText("label");
        add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 123, 24));

        lblMonthlyInstallment.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMonthlyInstallment.setForeground(new java.awt.Color(255, 255, 255));
        lblMonthlyInstallment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonthlyInstallment.setText("label");
        add(lblMonthlyInstallment, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 123, 24));

        lblStartMonth.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartMonth.setForeground(new java.awt.Color(255, 255, 255));
        lblStartMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartMonth.setText("label");
        add(lblStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 123, 24));

        lblStartYear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartYear.setForeground(new java.awt.Color(255, 255, 255));
        lblStartYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartYear.setText("label");
        add(lblStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 123, 24));

        lblAmount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmount.setText("label");
        add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 123, 24));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 51));
        btnBack.setText(" << BACK ");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 193, 69));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("LOAN LENGTH ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 191, 24));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("BORROWER ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 191, 24));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("CATEGORY ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 191, 24));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText(" REPAYMENT MONTHLY INSTALLEMNT ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 24));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("REPAYMENT START MONTH ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 292, 24));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("REPAYMENT START YEAR ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 292, 24));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("LOAN AMOUNT ");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 292, 24));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOAN CASE DETAILS -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 36));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STORY");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 68, 24));

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("FIELD PARTNER CONTACT ");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        lblFieldPartner.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFieldPartner.setForeground(new java.awt.Color(255, 255, 255));
        lblFieldPartner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFieldPartner.setText("label");
        add(lblFieldPartner, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VIEW LOAN CASE");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        int length = userProcessContainer.getComponentCount();
        RepresentativeLoanCaseJPanel awajp = (RepresentativeLoanCaseJPanel) userProcessContainer.getComponent(length - 1);
        awajp.populateScreenData();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBorrower;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblFieldPartner;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblMonthlyInstallment;
    private javax.swing.JLabel lblStartMonth;
    private javax.swing.JLabel lblStartYear;
    private javax.swing.JTextArea txtStory;
    // End of variables declaration//GEN-END:variables
}
