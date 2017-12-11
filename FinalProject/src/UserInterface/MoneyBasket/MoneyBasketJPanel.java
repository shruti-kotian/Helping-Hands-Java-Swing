/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MoneyBasket;

import Business.Enterprise.HelpingHandsEnterprise;
import Business.Finance.MoneyBasket;
import Business.Loan.LendingInstance;
import Business.Loan.Loan;
import Business.Person.Lender;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UserInterface.LenderRole.LenderWorkAreaJPanel;

/**
 *
 * @author Leo
 */
public class MoneyBasketJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MoneyBasketJPanel
     */
    private JPanel userProcessContainer ;
    private HelpingHandsEnterprise business; 
    private Lender lender;
  
    public MoneyBasketJPanel(JPanel userProcessContainer ,HelpingHandsEnterprise business, Lender lender) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business ;
        this.lender = lender;
        populateTblMoneyBasketItems();
    }
    
    public void populateTblMoneyBasketItems() {
        DefaultTableModel model = (DefaultTableModel) tblBasketItems.getModel();
        model.setRowCount(0);
        MoneyBasket moneyBasket = lender.getCurrentBasket();
        for(LendingInstance lendingInstance : moneyBasket.getLendingInstanceList()){
            Object[] row = new Object[3];
            row[0] = business.getLoanFromLoanCase(lendingInstance.getLoanCase());
            row[1] = lendingInstance ;
            model.addRow(row);
        }
        
    }
        
        public void populateTxtTotal(){
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();    
    int total = 0;
    int item = 0;
    for(int i = 0; i < tblBasketItems.getRowCount(); i++){
        item = (Integer)tblBasketItems.getValueAt(i, 2) ;
        LendingInstance lendingInstance = (LendingInstance) tblBasketItems.getValueAt(i, 1) ;
        lendingInstance.setAmount(item);
        lendingInstance.setDate(dateFormat.format(date));
        total = total + item;
    }
    txtTotal.setText(String.valueOf(total));
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
        btnCheckout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBasketItems = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  BASKET  ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" TOTAL DUE ");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 344, 177, 53));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" $ ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 344, -1, -1));

        btnCheckout.setBackground(new java.awt.Color(0, 0, 0));
        btnCheckout.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("  CHECKOUT >>  ");
        btnCheckout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });
        add(btnCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 203, 67));

        tblBasketItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BORROWER NAME", "CATEGORY", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBasketItems.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                tblBasketItemsCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tblBasketItemsInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tblBasketItems);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 144));

        txtTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 344, 288, 53));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 67));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  WOULD YOU LIKE TO MAKE A DONATION  ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 437, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 443, 177, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        populateTxtTotal();
        // TODO add your handling code here:
        // Check that none of the item amounts should be empty
        int item = 0;
        for(int i = 0; i < tblBasketItems.getRowCount(); i++){
            item = (Integer)tblBasketItems.getValueAt(i, 2) ;
            if(item == 0){
                JOptionPane.showMessageDialog(null, "Please enter amount in all rows", "Information",JOptionPane.INFORMATION_MESSAGE);
                return ;
            }
        }
        // Check if lender has enough creadit to give loan
        int total = Integer.parseInt(txtTotal.getText());
        if(total > lender.getAccountManagement().getAvailableCredit()){
            JOptionPane.showMessageDialog(null, "You don't have sufficient funds in your Helping Hands account", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // Add the lending instances to the loan objects
        for(int i = 0; i < tblBasketItems.getRowCount(); i++){
            Loan loan = (Loan)tblBasketItems.getValueAt(i, 0);
            LendingInstance lendingInstance = (LendingInstance) tblBasketItems.getValueAt(i, 1) ;
            loan.addLendingInstance(lendingInstance);
        }
        //Deduct loan total from lender credit
        lender.subtractCredit(total);
        lender.getMoneyBasket().clearBasket();
        JOptionPane.showMessageDialog(null,  "Loan made successfully", "Information",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void tblBasketItemsCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblBasketItemsCaretPositionChanged
        // TODO add your handling code here:
        populateTxtTotal();
    }//GEN-LAST:event_tblBasketItemsCaretPositionChanged

    private void tblBasketItemsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tblBasketItemsInputMethodTextChanged
        // TODO add your handling code here:
        populateTxtTotal();
    }//GEN-LAST:event_tblBasketItemsInputMethodTextChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        int length = userProcessContainer.getComponentCount();
        LenderWorkAreaJPanel awajp = (LenderWorkAreaJPanel) userProcessContainer.getComponent(length-1);
        awajp.populateAvailableCredit();
        awajp.populateOutstanding();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBasketItems;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
