/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FieldPartnerRole;

import Business.Enterprise.HelpingHandsEnterprise;
import Business.Loan.Loan;
import Business.Person.FieldPartnerContact;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Leo
 */
public class ViewMyBorrowersJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer ;
     private HelpingHandsEnterprise business;
     private FieldPartnerContact fieldPartnerContact;
    /**
     * Creates new form ViewMyBorrowersJPanel
     */
    public ViewMyBorrowersJPanel() {
        initComponents();
    }

    ViewMyBorrowersJPanel(JPanel userProcessContainer, HelpingHandsEnterprise business, FieldPartnerContact fieldPartnerContact) {
        initComponents();        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.fieldPartnerContact = fieldPartnerContact;
        populatetblMyBorrowers();
    }
    
    public void populatetblMyBorrowers(){
        
        ArrayList<Loan> loanList = business.getLoanDirectory().getLoanByFieldPartnerContact(this.fieldPartnerContact);
        DefaultTableModel model = (DefaultTableModel) tblMyBorrowers.getModel();
        model.setRowCount(0);
        
        for(Loan loan : loanList){
            Object[] row = new Object[3];
            row[0] = loan;
            row[1] = loan.getLoanStatus().getValue();
            row[2] = loan.getLoanCase().getCategory().getValue();
            model.addRow(row);
                    
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMyBorrowers = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 0, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  MY BORROWERS  ");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        tblMyBorrowers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borrower", "Loan Status", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMyBorrowers);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 681, 268));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 0, 51));
        btnBack.setText("<< BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 445, 69));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMyBorrowers;
    // End of variables declaration//GEN-END:variables
}
