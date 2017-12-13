/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author shwetatatiya
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTree();

    }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList = new ArrayList<Enterprise>();
        ArrayList<Organization> organizationList = new ArrayList<Organization>();

        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getNetworkName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();

                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageNetworkJButton = new javax.swing.JButton();
        manageEnterpriseJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSelectedLabel = new javax.swing.JLabel();
        manageEnterpriseAdminJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, -1, 707));

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageNetworkJButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        manageNetworkJButton.setForeground(new java.awt.Color(51, 0, 51));
        manageNetworkJButton.setText("  MANAGE NETWORK >>  ");
        manageNetworkJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        manageNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageNetworkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 494, 75));

        manageEnterpriseJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageEnterpriseJButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        manageEnterpriseJButton.setForeground(new java.awt.Color(51, 0, 51));
        manageEnterpriseJButton.setText("  MANAGE ENTERPRISE >>  ");
        manageEnterpriseJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterpriseJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 494, 74));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selected Node:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jSelectedLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jSelectedLabel.setForeground(new java.awt.Color(255, 255, 255));
        jSelectedLabel.setText("<View Selected Node>");
        jPanel2.add(jSelectedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        manageEnterpriseAdminJButton.setBackground(new java.awt.Color(153, 153, 153));
        manageEnterpriseAdminJButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        manageEnterpriseAdminJButton.setForeground(new java.awt.Color(51, 0, 51));
        manageEnterpriseAdminJButton.setText("  MANAGE ENTERPRISE ADMIN >>");
        manageEnterpriseAdminJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        manageEnterpriseAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(manageEnterpriseAdminJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 494, 85));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SYSTEM ADMIN WORK AREA");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkJButtonActionPerformed
        // TODO add your handling code here:

        ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, system);
        userProcessContainer.add(manageNetworkJPanel, "manageNetworkJPanel");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkJButtonActionPerformed

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed
        // TODO add your handling code here:

        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, system);
        userProcessContainer.add(manageEnterpriseJPanel, "manageEnterpriseJPanel");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageEnterpriseAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminJButtonActionPerformed
        // TODO add your handling code here:

        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, system);
        userProcessContainer.add(manageEnterpriseAdminJPanel, "manageEnterpriseAdminJPanel");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEnterpriseAdminJButtonActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        // TODO add your handling code here:

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            jSelectedLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSelectedLabel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JButton manageEnterpriseAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JButton manageNetworkJButton;
    // End of variables declaration//GEN-END:variables
}
