/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LenderRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpingHandsEnterprise;
import Business.Loan.Loan;
import Business.Loan.LoanCase;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Business.Finance.MoneyBasket;
import Business.Loan.LendingInstance;
import Business.Loan.LoanCase.Category;
import Business.Person.Lender;
import java.awt.CardLayout;

/**
 *
 * @author Leo
 */
public class LenderWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer ;
    private HelpingHandsEnterprise business ;
    private UserAccount userAccount ;
    private Lender lender;
   
    /**
     * Creates new form ViewBorrowerCaseJPanel
     */
    public LenderWorkAreaJPanel() {
        initComponents();
    }

    public LenderWorkAreaJPanel(JPanel userProcessContainer, Enterprise business, UserAccount account, Lender lender) {
        initComponents();
        this.userProcessContainer = userProcessContainer ;
        this.business = (HelpingHandsEnterprise) business ;
        this.userAccount = userAccount ;
        this.lender = lender ;
        populateCategoryComboBox();
        populateCreditComboBox();
        populateAvailableCredit();
        populateOutstanding();
    }
    
    public void populateCreditComboBox(){
        int[] amount = {25, 50, 100, 150, 200, 500, 1000, 1500, 1750, 2000, 5000};
        
        creditComboBox.removeAllItems();
        for(int i = 0; i<amount.length; i++){
            creditComboBox.addItem(amount[i]);
        }
    }
    
    public void populateCategoryComboBox() 
    {
        categoryComboBox.removeAllItems();
        
        for( Category category : LoanCase.Category.values())
        {
            categoryComboBox.addItem(category);
        }
        
        
       
    } 
    
    public void populateTblLoanCases(String category)
    {
         DefaultTableModel model = (DefaultTableModel) tblLoanCases.getModel();
          model.setRowCount(0);
      
          
          for(Loan loan : business.getLoanDirectory().getLoanList()){
              if(loan.getLoanStatus().equals(Loan.LoanStatus.FundingNeeded) ||
                 loan.getLoanStatus().equals(Loan.LoanStatus.PartlyFunded)){
                  if(loan.getLoanCase().getCategory().getValue().equals(category)){
                Object row [] = new Object[3];
                row[0] = loan;
                row[1] = loan.getLoanCase().getLoanAmount();
                row[2] = loan.getLoanCase().getLoanLength();
                model.addRow(row);                      
                  }
              }
          }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoanCases = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnProceed = new javax.swing.JButton();
        categoryComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddCredit = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        lblcountry = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCurrentBalance = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOutstanding = new javax.swing.JTextField();
        creditComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  LENDER DASHBOARD  ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 49, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  CATEGORIES  ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 144, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  BORROWER DETAILS  ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 193, -1, -1));

        tblLoanCases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borrower", "Loan Amount", "Loan Length"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLoanCases);
        if (tblLoanCases.getColumnModel().getColumnCount() > 0) {
            tblLoanCases.getColumnModel().getColumn(0).setResizable(false);
            tblLoanCases.getColumnModel().getColumn(1).setResizable(false);
            tblLoanCases.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 252, 808, 194));

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD BORROWER >>");
        btnAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 490, 361, 48));

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("VIEW LOAN CASE >>");
        btnView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 490, 400, 48));

        btnProceed.setBackground(new java.awt.Color(0, 0, 0));
        btnProceed.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnProceed.setForeground(new java.awt.Color(255, 255, 255));
        btnProceed.setText("PROCEED TO CHECKOUT >>");
        btnProceed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        add(btnProceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 566, 508, 61));

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboBoxActionPerformed(evt);
            }
        });
        add(categoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 148, 158, -1));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(754, 586, -1, 41));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  ADD CREDIT TO YOUR ACCOUNT  ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 663, -1, -1));

        btnAddCredit.setBackground(new java.awt.Color(0, 0, 0));
        btnAddCredit.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCredit.setText("ADD >>");
        btnAddCredit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnAddCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCreditActionPerformed(evt);
            }
        });
        add(btnAddCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 727, 135, 36));

        lblname.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("NAME");
        add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 49, -1, -1));

        lblcountry.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblcountry.setForeground(new java.awt.Color(255, 255, 255));
        lblcountry.setText("COUNTRY");
        add(lblcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 91, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  CURRENT BALANCE AVAILABLE  ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 663, -1, -1));

        txtCurrentBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(txtCurrentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 728, 314, 34));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OUTSTANDING LOANS");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 869, -1, 24));

        txtOutstanding.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        add(txtOutstanding, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 930, 210, -1));

        creditComboBox.setForeground(new java.awt.Color(255, 255, 255));
        creditComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(creditComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 733, 182, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void categoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboBoxActionPerformed
        // TODO add your handling code here:
         
         Category category = (Category) categoryComboBox.getSelectedItem();
        if (category != null){
           populateTblLoanCases(category.getValue());
        }
       
        
        
        // Get the selected category from combo box
        // Call populateTblLoanCases method with this category 
    }//GEN-LAST:event_categoryComboBoxActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblLoanCases.getModel();
       int selectedRow = tblLoanCases.getSelectedRow();
       if(selectedRow < 0){
           JOptionPane.showMessageDialog(null, "Please select a row first","Information",  JOptionPane.INFORMATION_MESSAGE);
           return ;
       }
       else
       {
           Loan loan = (Loan)tblLoanCases.getValueAt(selectedRow, 0);
           
           for(LendingInstance lendingInstance : loan.getLendingInstanceList() ){
               if(lendingInstance.getLender() == lender){
                   JOptionPane.showMessageDialog(null, "You have already lent to this borrower", "Information", JOptionPane.INFORMATION_MESSAGE);
                   return ;
               }
           }
           
           MoneyBasket basket = lender.getCurrentBasket();
           for(LendingInstance lendingInstance : basket.getLendingInstanceList()){
               if(loan.getLoanCase() == lendingInstance.getLoanCase()){
                   JOptionPane.showMessageDialog(null, "This loan case is already added to your basket", "Information", JOptionPane.INFORMATION_MESSAGE);
                   return ;
               }
           }
           LendingInstance lendingInstance = new LendingInstance();
           lendingInstance.setLender(lender);
           lendingInstance.setLoanCase(loan.getLoanCase());
           basket.getLendingInstanceList().add(lendingInstance);
           JOptionPane.showMessageDialog(null,  "Item added successfully","Information", JOptionPane.INFORMATION_MESSAGE);
       }
           
        
        
        
        
        //Get the selected row loan case
        //Check if lending amount has been inserted
        // Create a lending instance 
        // Add this lending instance to loan
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) tblLoanCases.getModel();
       int selectedRow = tblLoanCases.getSelectedRow();
       if(selectedRow < 0){
           JOptionPane.showMessageDialog(null,  "Please select a row first","Information", JOptionPane.INFORMATION_MESSAGE);
           return ;
       }
       else
       {
          int selectedTableRow = tblLoanCases.getSelectedRow();
          
          if(selectedTableRow >= 0)
          {
           Loan loan = (Loan)tblLoanCases.getValueAt(selectedTableRow, 0);
           ViewBorrowerLoanCaseJPanel viewBorrowerLoanCase = new ViewBorrowerLoanCaseJPanel(userProcessContainer, loan);
           userProcessContainer.add("ViewBorrowerLoanCaseJPanel",viewBorrowerLoanCase);
           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
           layout.next(userProcessContainer);
              
          }
          
       }
        
        
        // Get the selected row and the loan case
        // pass the loan case to new jpanel viewborrowerloancasejpanel
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // TODO add your handling code here:
        
            
        
//           MoneyBasketJPanel moneyBasket = new MoneyBasketJPanel(userProcessContainer, business, lender);
//           userProcessContainer.add("MoneyBasket", moneyBasket);
//           CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//           layout.next(userProcessContainer);
        
        
        // Create a basket object
        // Add all lending instances to basket object
        // Create a go to basketjpanel with parameter basket
    }//GEN-LAST:event_btnProceedActionPerformed

    private void btnAddCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCreditActionPerformed
        // TODO add your handling code here:
        int amount = (int) creditComboBox.getSelectedItem();
        lender.getAccountManagement().setAvailableCredit(lender.getAccountManagement().getAvailableCredit() + amount);
        JOptionPane.showMessageDialog(null,  "Credit added successfully","Information", JOptionPane.INFORMATION_MESSAGE);
        populateAvailableCredit();
    }//GEN-LAST:event_btnAddCreditActionPerformed

    public void populateAvailableCredit(){
        txtCurrentBalance.setText(String.valueOf(lender.getAccountManagement().getAvailableCredit()));
    }
    
        public void populateOutstanding() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCredit;
    private javax.swing.JButton btnProceed;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox categoryComboBox;
    private javax.swing.JComboBox creditComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcountry;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblLoanCases;
    private javax.swing.JTextField txtCurrentBalance;
    private javax.swing.JTextField txtOutstanding;
    // End of variables declaration//GEN-END:variables




}
