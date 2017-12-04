/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RepresentativeRole;

<<<<<<< HEAD
<<<<<<< HEAD
=======
import Business.Enterprise.HelpingHandsEnterprise;
>>>>>>> master
=======
>>>>>>> master
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HelpingHandsEnterprise;
import Business.Loan.Loan;
import Business.Loan.LoanCase;
import Business.Organization.TrusteeOrganization;
import Business.Person.Borrower;
import Business.WorkQueue.NewLoanCaseWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> master
/**
 *
 * @author Shrutik
 */
<<<<<<< HEAD
public class RepresentativeLoanCaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HelpingHandsEnterprise business;
    private NewLoanCaseWorkRequest newLoanCaseWorkRequest;
    private TrusteeOrganization trusteeOrganization;
    private Employee representative;

    /**
     * Creates new form RepresentativeLoanCaseJPanel
=======

=======
>>>>>>> master
public class RepresentativeLoanCaseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HelpingHandsEnterprise business;
    private NewLoanCaseWorkRequest newLoanCaseWorkRequest;
    private TrusteeOrganization trusteeOrganization;
    private Employee representative;

    /**
<<<<<<< HEAD
     * Creates new form AnalyseLoanCaseJPanel
>>>>>>> master
=======
     * Creates new form RepresentativeLoanCaseJPanel
>>>>>>> master
     */
    public RepresentativeLoanCaseJPanel() {
        initComponents();
    }
<<<<<<< HEAD
<<<<<<< HEAD

    RepresentativeLoanCaseJPanel(JPanel userProcessContainer, Enterprise business, NewLoanCaseWorkRequest newLoanCaseWorkRequest, TrusteeOrganization trusteeOrganization, Employee representative) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = (HelpingHandsEnterprise) business;
        this.newLoanCaseWorkRequest = newLoanCaseWorkRequest;
        this.trusteeOrganization = trusteeOrganization;
        this.representative = representative;
        populateScreenData();
    }

    public void populateScreenData() {

        Borrower borrower = newLoanCaseWorkRequest.getBorrower();
        Loan loan = newLoanCaseWorkRequest.getLoan();
        LoanCase loanCase = loan.getLoanCase();

        lblAddress.setText(borrower.getAddress());
        lblAge.setText(String.valueOf(borrower.getDateOfBirth()));
        lblAmount.setText(String.valueOf(loanCase.getLoanAmount()));
        lblBorrower.setText(borrower.getName());
        lblCategory.setText(String.valueOf(loanCase.getCategory().getValue()));
        lblFullName.setText(borrower.getName());
        lblLength.setText(String.valueOf(loanCase.getLoanLength()));
        lblMonthlyInstallment.setText(String.valueOf(loanCase.getInstallment()));
        lblOccupation.setText(borrower.getOccupation());
        lblStartMonth.setText(loanCase.getRepaymentStartMonth());
        lblStartYear.setText(loanCase.getRepaymentStartYear());
        lblYearlyIncome.setText(String.valueOf(borrower.getYearlyIncome()));
        txtStory.setText(loanCase.getCaseDescripton());
        populateTblBorrowerHistory();
    }

    public void populateTblBorrowerHistory() {
        DefaultTableModel model = (DefaultTableModel) tblBorrowerHistory.getModel();
        model.setRowCount(0);

        ArrayList<Loan> loanList = business.getLoanDirectory().getBorrowerHistory(newLoanCaseWorkRequest.getLoan().getBorrower());

        for (Loan loan : loanList) {
            Object[] row = new Object[4];
            row[0] = loan;
            row[1] = loan.totalLentAmount();

            int length = loan.getLendingInstanceList().size();
            String date = loan.getLendingInstanceList().get(length - 1).getDate();
            row[2] = date;

            int length1 = loan.getRepaymentInstanceList().size();
            Date date1 = loan.getRepaymentInstanceList().get(length1 - 1).getDate();
            row[3] = date1;

        }

    }

=======
    
=======

>>>>>>> master
    RepresentativeLoanCaseJPanel(JPanel userProcessContainer, Enterprise business, NewLoanCaseWorkRequest newLoanCaseWorkRequest, TrusteeOrganization trusteeOrganization, Employee representative) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = (HelpingHandsEnterprise) business;
        this.newLoanCaseWorkRequest = newLoanCaseWorkRequest;
        this.trusteeOrganization = trusteeOrganization;
        this.representative = representative;
        populateScreenData();
    }

    public void populateScreenData() {

        Borrower borrower = newLoanCaseWorkRequest.getBorrower();
        Loan loan = newLoanCaseWorkRequest.getLoan();
        LoanCase loanCase = loan.getLoanCase();

        lblAddress.setText(borrower.getAddress());
        lblAge.setText(String.valueOf(borrower.getDateOfBirth()));
        lblAmount.setText(String.valueOf(loanCase.getLoanAmount()));
        lblBorrower.setText(borrower.getName());
        lblCategory.setText(String.valueOf(loanCase.getCategory().getValue()));
        lblFullName.setText(borrower.getName());
        lblLength.setText(String.valueOf(loanCase.getLoanLength()));
        lblMonthlyInstallment.setText(String.valueOf(loanCase.getInstallment()));
        lblOccupation.setText(borrower.getOccupation());
        lblStartMonth.setText(loanCase.getRepaymentStartMonth());
        lblStartYear.setText(loanCase.getRepaymentStartYear());
        lblYearlyIncome.setText(String.valueOf(borrower.getYearlyIncome()));
        txtStory.setText(loanCase.getCaseDescripton());
        populateTblBorrowerHistory();
    }

    public void populateTblBorrowerHistory() {
<<<<<<< HEAD
       DefaultTableModel model = (DefaultTableModel) tblBorrowerHistory.getModel();
       model.setRowCount(0);
       
       
       ArrayList<Loan> loanList = business.getLoanDirectory().getBorrowerHistory(newLoanCaseWorkRequest.getLoan().getBorrower());
       
       for(Loan loan : loanList){
           Object[] row = new Object[4];
           row[0] = loan;
           row[1] = loan.totalLentAmount();
           
           int length = loan.getLendingInstanceList().size();
           String date = loan.getLendingInstanceList().get(length-1).getDate();           
           row[2] = date;
           
           int length1 = loan.getRepaymentInstanceList().size();
           Date date1 = loan.getRepaymentInstanceList().get(length1-1).getDate();           
           row[3] = date1;

           
       }
       
       
        
    }    
    
>>>>>>> master
=======
        DefaultTableModel model = (DefaultTableModel) tblBorrowerHistory.getModel();
        model.setRowCount(0);

        ArrayList<Loan> loanList = business.getLoanDirectory().getBorrowerHistory(newLoanCaseWorkRequest.getLoan().getBorrower());

        for (Loan loan : loanList) {
            Object[] row = new Object[4];
            row[0] = loan;
            row[1] = loan.totalLentAmount();

            int length = loan.getLendingInstanceList().size();
            String date = loan.getLendingInstanceList().get(length - 1).getDate();
            row[2] = date;

            int length1 = loan.getRepaymentInstanceList().size();
            Date date1 = loan.getRepaymentInstanceList().get(length1 - 1).getDate();
            row[3] = date1;

        }

    }

>>>>>>> master
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblYearlyIncome = new javax.swing.JLabel();
        lblBorrowerHistory = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBorrowerHistory = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblBorrowerHistory1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFeedback = new javax.swing.JTextField();
        btnSendToTrustee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();
<<<<<<< HEAD
<<<<<<< HEAD
=======
        jLabel18 = new javax.swing.JLabel();
>>>>>>> master
=======
>>>>>>> master

        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
=======
>>>>>>> master
=======
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
>>>>>>> master

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOAN CASE DETAILS -");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 45, 250, 36));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 45, 250, 36));
>>>>>>> master

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STORY");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 93, 68, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 93, 68, 24));
>>>>>>> master

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("LOAN LENGTH ");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 100, 191, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 100, 191, 24));
>>>>>>> master

        lblLength.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLength.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 99, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 99, 123, 24));
>>>>>>> master

        txtStory.setEditable(false);
        txtStory.setColumns(20);
        txtStory.setRows(5);
        txtStory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jScrollPane1.setViewportView(txtStory);

<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 129, 355, 211));

=======
>>>>>>> master
=======
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 129, 355, 211));

>>>>>>> master
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("BORROWER ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 131, 191, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 131, 191, 24));
>>>>>>> master

        lblBorrower.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblBorrower.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrower.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrower.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 130, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblBorrower, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 130, 123, 24));
>>>>>>> master

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("CATEGORY ");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 162, 191, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 162, 191, 24));
>>>>>>> master

        lblCategory.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCategory.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 161, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 161, 123, 24));
>>>>>>> master

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText(" REPAYMENT MONTHLY INSTALLEMNT ");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 193, -1, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 193, -1, 24));
>>>>>>> master

        lblMonthlyInstallment.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMonthlyInstallment.setForeground(new java.awt.Color(255, 255, 255));
        lblMonthlyInstallment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonthlyInstallment.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblMonthlyInstallment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 192, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblMonthlyInstallment, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 192, 123, 24));
>>>>>>> master

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("REPAYMENT START MONTH ");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 224, 292, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 224, 292, 24));
>>>>>>> master

        lblStartMonth.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartMonth.setForeground(new java.awt.Color(255, 255, 255));
        lblStartMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartMonth.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 223, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblStartMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 223, 123, 24));
>>>>>>> master

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("REPAYMENT START YEAR ");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 255, 292, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 255, 292, 24));
>>>>>>> master

        lblStartYear.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStartYear.setForeground(new java.awt.Color(255, 255, 255));
        lblStartYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartYear.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 254, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblStartYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 254, 123, 24));
>>>>>>> master

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("BORROWER DETAILS -");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 625, 250, 37));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 625, 250, 37));
>>>>>>> master

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText(" FULL NAME ");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 675, 137, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 675, 137, 24));
>>>>>>> master

        lblFullName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(255, 255, 255));
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFullName.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 674, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 674, 123, 24));
>>>>>>> master

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText(" ADDRESS ");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 706, 137, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 706, 137, 24));
>>>>>>> master

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("AGE ");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 737, 137, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 737, 137, 24));
>>>>>>> master

        lblAddress.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 705, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 705, 123, 24));
>>>>>>> master

        lblAge.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 736, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 736, 123, 24));
>>>>>>> master

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("OCCUPATION ");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 768, 137, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 768, 137, 24));
>>>>>>> master

        lblOccupation.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblOccupation.setForeground(new java.awt.Color(255, 255, 255));
        lblOccupation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOccupation.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 767, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 767, 123, 24));
>>>>>>> master

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("YEARLY INCOME ");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 799, 137, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 799, 137, 24));
>>>>>>> master

        lblYearlyIncome.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblYearlyIncome.setForeground(new java.awt.Color(255, 255, 255));
        lblYearlyIncome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblYearlyIncome.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblYearlyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 798, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblYearlyIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 798, 123, 24));
>>>>>>> master

        lblBorrowerHistory.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBorrowerHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrowerHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrowerHistory.setText("BORROWER HISTORY");
        lblBorrowerHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblBorrowerHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 841, 213, 30));
=======
>>>>>>> master
=======
        jPanel1.add(lblBorrowerHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 841, 213, 30));
>>>>>>> master

        tblBorrowerHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borrower", "Loan Amount", "Loan Disbursement Date", "Repayment Date", "Field Partner"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBorrowerHistory);
        if (tblBorrowerHistory.getColumnModel().getColumnCount() > 0) {
            tblBorrowerHistory.getColumnModel().getColumn(0).setResizable(false);
            tblBorrowerHistory.getColumnModel().getColumn(1).setResizable(false);
            tblBorrowerHistory.getColumnModel().getColumn(2).setResizable(false);
            tblBorrowerHistory.getColumnModel().getColumn(3).setResizable(false);
            tblBorrowerHistory.getColumnModel().getColumn(4).setResizable(false);
        }

<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 883, 729, 168));

=======
>>>>>>> master
=======
        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 883, 729, 168));

>>>>>>> master
        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("VIEW >>");
        btnView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 1063, 213, 42));
=======
>>>>>>> master
=======
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 1063, 213, 42));
>>>>>>> master

        lblBorrowerHistory1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblBorrowerHistory1.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrowerHistory1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorrowerHistory1.setText("ANALYST FEEDBACK -");
        lblBorrowerHistory1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblBorrowerHistory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 1098, 250, 32));
=======
>>>>>>> master
=======
        jPanel1.add(lblBorrowerHistory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 1098, 250, 32));
>>>>>>> master

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel16.setText("THIS LOAN IS SPECIAL BECAUSE...");
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> master
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 1142, 256, 24));

        txtFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(txtFeedback, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 1172, 903, 43));
<<<<<<< HEAD
=======

        txtFeedback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
>>>>>>> master
=======
>>>>>>> master

        btnSendToTrustee.setBackground(new java.awt.Color(0, 0, 0));
        btnSendToTrustee.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnSendToTrustee.setForeground(new java.awt.Color(255, 255, 255));
        btnSendToTrustee.setText(" APPROVE - SEND TO TRUSTEE ORGANIZATION >>");
        btnSendToTrustee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnSendToTrustee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendToTrusteeActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(btnSendToTrustee, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 1227, -1, 42));
=======
>>>>>>> master
=======
        jPanel1.add(btnSendToTrustee, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 1227, -1, 42));
>>>>>>> master

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<BACK");
        btnBack.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 1227, 157, 42));
=======
>>>>>>> master
=======
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 1227, 157, 42));
>>>>>>> master

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel17.setText("LOAN AMOUNT ");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 292, 292, 24));
=======
>>>>>>> master
=======
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 292, 292, 24));
>>>>>>> master

        lblAmount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAmount.setText("label");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 291, 123, 24));
=======
>>>>>>> master
=======
        jPanel1.add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 291, 123, 24));
>>>>>>> master

        btnReject.setBackground(new java.awt.Color(0, 0, 0));
        btnReject.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("REJECT THE LOAN >>");
        btnReject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel1.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1227, 249, 42));
=======

        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblYearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(565, 565, 565)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(177, 177, 177)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblLength, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblBorrower, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblMonthlyInstallment, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblStartMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(lblStartYear, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblBorrowerHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBorrowerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFeedback, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSendToTrustee)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(259, 259, 259))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLength, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonthlyInstallment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartYear, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblBorrowerHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblBorrowerHistory1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendToTrustee, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
>>>>>>> master
=======
        jPanel1.add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1227, 249, 42));
>>>>>>> master

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1433, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendToTrusteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendToTrusteeActionPerformed
        // TODO add your handling code here:
        String feedback = txtFeedback.getText().trim();
<<<<<<< HEAD
<<<<<<< HEAD
        if (feedback == "") {
            JOptionPane.showMessageDialog(null, "Please enter a feedback", "Information", JOptionPane.INFORMATION_MESSAGE);
=======
        if(feedback == ""){
            JOptionPane.showMessageDialog(null,  "Please enter a feedback","Information", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> master
=======
        if (feedback == "") {
            JOptionPane.showMessageDialog(null, "Please enter a feedback", "Information", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> master
            return;
        }
        newLoanCaseWorkRequest.getLoan().getLoanCase().setSpeciality(feedback);
        newLoanCaseWorkRequest.getLoan().getLoanCase().setSpecialityAdder(representative);
<<<<<<< HEAD
<<<<<<< HEAD

=======
        
>>>>>>> master
=======

>>>>>>> master
        newLoanCaseWorkRequest.setRepresentative(representative);
        newLoanCaseWorkRequest.setMessage("Please review this aplication for new Loan");
        newLoanCaseWorkRequest.setStatus(NewLoanCaseWorkRequest.Status.RepresentativeApproved);
        trusteeOrganization.getWorkQueue().addWorkRequest(newLoanCaseWorkRequest);
<<<<<<< HEAD
<<<<<<< HEAD

        JOptionPane.showMessageDialog(null, "Work Request sent to Trustee Organization", "Information", JOptionPane.INFORMATION_MESSAGE);
=======
        
        JOptionPane.showMessageDialog(null,  "Work Request sent to Trustee Organization","Information", JOptionPane.INFORMATION_MESSAGE);        
>>>>>>> master
=======

        JOptionPane.showMessageDialog(null, "Work Request sent to Trustee Organization", "Information", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> master
    }//GEN-LAST:event_btnSendToTrusteeActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        newLoanCaseWorkRequest.setRepresentative(representative);
        newLoanCaseWorkRequest.setMessage("");
        newLoanCaseWorkRequest.setStatus(NewLoanCaseWorkRequest.Status.RepresentativeRejected);
<<<<<<< HEAD
<<<<<<< HEAD

        JOptionPane.showMessageDialog(null, "Work Request rejected and sent to Borrower", "Information", JOptionPane.INFORMATION_MESSAGE);
=======
        
        JOptionPane.showMessageDialog(null,  "Work Request rejected and sent to Borrower","Information", JOptionPane.INFORMATION_MESSAGE);        
>>>>>>> master
=======

        JOptionPane.showMessageDialog(null, "Work Request rejected and sent to Borrower", "Information", JOptionPane.INFORMATION_MESSAGE);
>>>>>>> master
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        int length = userProcessContainer.getComponentCount();
<<<<<<< HEAD
<<<<<<< HEAD
        RepresentativeWorkAreaJPanel awajp = (RepresentativeWorkAreaJPanel) userProcessContainer.getComponent(length - 1);
        awajp.populateTblRepresentativeOrganizationWorkQueue();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
=======
        RepresentativeWorkAreaJPanel awajp = (RepresentativeWorkAreaJPanel) userProcessContainer.getComponent(length-1);
=======
        RepresentativeWorkAreaJPanel awajp = (RepresentativeWorkAreaJPanel) userProcessContainer.getComponent(length - 1);
>>>>>>> master
        awajp.populateTblRepresentativeOrganizationWorkQueue();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
<<<<<<< HEAD
        layout.previous(userProcessContainer);        
>>>>>>> master
=======
        layout.previous(userProcessContainer);
>>>>>>> master
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblBorrowerHistory.getSelectedRow();
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> master

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

<<<<<<< HEAD
        Loan loan = (Loan) tblBorrowerHistory.getValueAt(selectedRow, 0);
        ViewLoanCaseJPanel vlcjp = new ViewLoanCaseJPanel(userProcessContainer, loan);
        userProcessContainer.add("ViewLoanCaseJPanel", vlcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

=======
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,  "Please select a row first","Information", JOptionPane.INFORMATION_MESSAGE);
            return ;} 
        
        Loan loan = (Loan) tblBorrowerHistory.getValueAt(selectedRow, 0);
        ViewLoanCaseJPanel vlcjp = new ViewLoanCaseJPanel(userProcessContainer, loan);
        userProcessContainer.add("ViewLoanCaseJPanel", vlcjp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);        
        
>>>>>>> master
=======
        Loan loan = (Loan) tblBorrowerHistory.getValueAt(selectedRow, 0);
        ViewLoanCaseJPanel vlcjp = new ViewLoanCaseJPanel(userProcessContainer, loan);
        userProcessContainer.add("ViewLoanCaseJPanel", vlcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

>>>>>>> master
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnSendToTrustee;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel18;
>>>>>>> master
=======
>>>>>>> master
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBorrower;
    private javax.swing.JLabel lblBorrowerHistory;
    private javax.swing.JLabel lblBorrowerHistory1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblMonthlyInstallment;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblStartMonth;
    private javax.swing.JLabel lblStartYear;
    private javax.swing.JLabel lblYearlyIncome;
    private javax.swing.JTable tblBorrowerHistory;
    private javax.swing.JTextField txtFeedback;
    private javax.swing.JTextArea txtStory;
    // End of variables declaration//GEN-END:variables

<<<<<<< HEAD
<<<<<<< HEAD
=======
    


>>>>>>> master
=======
>>>>>>> master
}
