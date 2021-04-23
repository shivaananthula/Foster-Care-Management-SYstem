/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrationRole;

import Business.ChildCounsellor.ChildCounsellor;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Instructor.Instructor;
import Business.Organization.Organization;
import static Business.Organization.Organization.OrganizationType.NgoOrganization;
import static Business.Organization.Organization.OrganizationType.ParentTrainingOrganization;
import static Business.Organization.Organization.OrganizationType.RehabilitationOrganization;
import Business.Organization.OrganizationDirectory;
import Business.Parent.Parent;
import Business.Role.Role;
import Business.SocialWorker.SocialWorker;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class TrainingEntManageEmpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrainingEntManageEmpJPanel
     */
      private final OrganizationDirectory organizationDirectory;
        Enterprise enterprise;
        Organization organization;
    public TrainingEntManageEmpJPanel(Enterprise enterprise,Organization organization,OrganizationDirectory organizationDirectory) {
        initComponents();
         this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        this.organization = organization;
        populateOrganizationEmpComboBox();
                populateTable();

    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = ua.getEmployee().getName();
                row[1] = ua.getRole().getRoleType().toString();
                model.addRow(row);
            }
        }
    }
    public void populateOrganizationEmpComboBox() {
        cbOrganization.removeAllItems();

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            cbOrganization.addItem(organization);
        }
    }
    
    private void popRoleComboBox(Organization organization) {
        cbRole.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            cbRole.addItem(role);
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

        lblTitle = new javax.swing.JLabel();
        scrollpaneTable = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        lblOrganization = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblCreateEmp = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnDelete = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        cbRole = new javax.swing.JComboBox();
        cbOrganization = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Training Center Employees");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        tblEmployee.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollpaneTable.setViewportView(tblEmployee);

        add(scrollpaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 580, 200));

        lblOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        lblRole.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        lblCreateEmp.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lblCreateEmp.setForeground(new java.awt.Color(25, 56, 82));
        lblCreateEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateEmp.setText("CREATE AN EMPLOYEE");
        add(lblCreateEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 465, 40));

        btnCreate.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        lblPhone.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 150, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 150, -1));

        lblUsername1.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblUsername1.setText("Username:");
        add(lblUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel5.setText("Password:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        txtUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 150, 30));

        pwdPassword.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(pwdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 150, 30));

        btnDelete.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, 30));

        txtAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 150, 30));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel1.setText("Address:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        txtEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 150, 30));

        cbRole.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        cbRole.setForeground(new java.awt.Color(25, 56, 82));
        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2" }));
        add(cbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 160, 30));

        cbOrganization.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        cbOrganization.setForeground(new java.awt.Color(25, 56, 82));
        cbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2" }));
        cbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganizationActionPerformed(evt);
            }
        });
        add(cbOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganizationActionPerformed
        // TODO add your handling code here:
        Organization org = (Organization) cbOrganization.getSelectedItem();
        if (org != null) {
            popRoleComboBox(org);
        }
    }//GEN-LAST:event_cbOrganizationActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         if (!txtName.getText().equals("")) {
            Organization organization = (Organization) cbOrganization.getSelectedItem();
            Role role = (Role) cbRole.getSelectedItem();
            String name = txtName.getText();
            String phone=txtPhone.getText();
            String email=txtEmail.getText();
            String username=txtUsername.getText();
            String address=txtAddress.getText();
            String password=pwdPassword.getText();
            Employee emp= organization.getEmployeeDirectory().createEmployee(name);
            organization.getUserAccountDirectory().createUserAccount(username, password, emp, role);
            switch(role.getRoleType()){
                case Counsellor : 
                    ChildCounsellor counsellor = enterprise.getChildCounsellorDirectory().createChildCounsellor(name, address, phone, email);
                    break;
                case Instructor:
                    Instructor instructor = enterprise.getInstructorDirectory().createInstructor(name, phone, email, address);
                    break;
            }
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
            populateTable(); 
            txtName.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            pwdPassword.setText("");
            txtAddress.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Please Enter Value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployee.getSelectedRow();
        
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblEmployee.getModel();
            String name = (String)tableRecords.getValueAt(selectedRow, 0);
            String role = (String)tableRecords.getValueAt(selectedRow, 1);
            
            UserAccount toDelete = null;
            
            if(role.equals("Instructor")){
                enterprise.getInstructorDirectory().DeleteInstructorByName(name);
                DeleteUserAccount(organizationDirectory.find(ParentTrainingOrganization), name);
            }
            else if(role.equals("Counsellor")){
                enterprise.getChildCounsellorDirectory().DeleteChildCounsellorByName(name);
                DeleteUserAccount(organizationDirectory.find(RehabilitationOrganization), name);
            }
            JOptionPane.showMessageDialog(null, "User Account Deleted Successfully");
            populateTable();
    }                       
    }//GEN-LAST:event_btnDeleteActionPerformed
    public void DeleteUserAccount(Organization organization, String name){
        UserAccount toDelete = null;
        for(UserAccount ua :organization.getUserAccountDirectory().getUserAccountList()){
                if(ua.getEmployee().getName().equals(name)){
                    toDelete = ua;
                    break;
                }
                
            }
        if(toDelete!= null){
                organization.getUserAccountDirectory().getUserAccountList().remove(toDelete);
                }
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cbOrganization;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCreateEmp;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JScrollPane scrollpaneTable;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
