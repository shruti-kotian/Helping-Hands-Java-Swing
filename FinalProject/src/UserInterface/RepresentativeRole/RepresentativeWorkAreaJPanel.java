/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepresentativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RepresentativeOrganization;
import Business.Organization.TrusteeOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NewLoanCaseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shrutik
 */
public class RepresentativeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RepresentativeWorkAreaJPanel
     */
    
    private JPanel userProcessContainer ;
    private Enterprise business ;
    private UserAccount userAccount ;
    private Employee representative ;
    
    public RepresentativeWorkAreaJPanel(JPanel userProcessContainer, Enterprise business, UserAccount userAccount, Employee representative) {
        initComponents();
         this.userProcessContainer = userProcessContainer ;
        this.business = business;
        this.userAccount = userAccount ;
        this.representative = representative ;
        populateTblRepresentativeOrganizationWorkQueue();
    }

    public void populateTblRepresentativeOrganizationWorkQueue(){
        
        DefaultTableModel model = (DefaultTableModel) tblRepOrgWorkQueue.getModel() ;
        model.setRowCount(0);
        RepresentativeOrganization repOrganization = null;
        
        for(Organization organization : business.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof RepresentativeOrganization){
                repOrganization = (RepresentativeOrganization) organization ;
            }
        }
        
        Object[] row = new Object[5] ;
        for(WorkRequest workRequest : repOrganization.getWorkQueue().getWorkRequestList()){
           if(!(workRequest.getStatus().equals(NewLoanCaseWorkRequest.Status.Complete.getValue()))){
            
            row[0] = workRequest ;
            row[1] = workRequest.getMessage() ;
            row[2] = workRequest.getStatus();
            if(workRequest.getTrustee() != null)
            row[3] = workRequest.getTrustee().getName();
            else
            row[3] = "";
            if(workRequest.getRepresentative()!= null)
            row[4] = workRequest.getRepresentative().getName();
            else
            row[4] = "";
            model.addRow(row);
        }}        
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
        tblRepOrgWorkQueue = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRepOrgWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization / Borrower", "Message", "Status", "Trustee", "Representative"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRepOrgWorkQueue);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 139, 703, 223));

        btnAssign.setBackground(new java.awt.Color(0, 0, 0));
        btnAssign.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText(" ASSIGN TO ME >> ");
        btnAssign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 395, 343, 65));

        btnProcess.setBackground(new java.awt.Color(0, 0, 0));
        btnProcess.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setText(" PROCESS >> ");
        btnProcess.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 395, 342, 65));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        // Get the selected row from the table and the work request in it.
        int selectedRow = tblRepOrgWorkQueue.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,  "Please select a work request first","Information", JOptionPane.INFORMATION_MESSAGE);
            return ;}

        WorkRequest workRequest ;
        workRequest = (WorkRequest) tblRepOrgWorkQueue.getValueAt(selectedRow, 0);
        // Check if it is already assigned
        if(workRequest.getRepresentative()!= null){
            JOptionPane.showMessageDialog(null, "Representative already assigned", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        // Assign the current representative to this work request
        workRequest.setRepresentative(representative);
        JOptionPane.showMessageDialog(null,  "Representative assigned successfully","Information", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblRepOrgWorkQueue.getModel();
        int selectedRow = tblRepOrgWorkQueue.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row first","Information",  JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        TrusteeOrganization trusteeOrganization = business.getTrusteeOrganization();
        WorkRequest workRequest = (WorkRequest) tblRepOrgWorkQueue.getValueAt(selectedRow, 0);
        if(workRequest.getRepresentative()!= representative){
            JOptionPane.showMessageDialog(null, "Please assign to yourself first", "Information", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
        if(workRequest instanceof NewLoanCaseWorkRequest){
            RepresentativeLoanCaseJPanel analyseLoanCaseJPanel =
            new RepresentativeLoanCaseJPanel(userProcessContainer, business, (NewLoanCaseWorkRequest) workRequest,
                trusteeOrganization, representative);
            userProcessContainer.add("analyseLoanCaseJPanel",analyseLoanCaseJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRepOrgWorkQueue;
    // End of variables declaration//GEN-END:variables
}
