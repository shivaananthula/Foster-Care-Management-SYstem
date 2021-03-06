/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InstructorRole;

import Business.EcoSystem;
import Business.Instructor.Instructor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author koushik
 */
public class InstructorViewProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InstructorViewProfileJPanel
     */
    JPanel userProcessContainer; 
     public EcoSystem system;
    public Instructor CurrentInstructor;
    public Organization Organization;
    public String role;
    public UserAccount account;
    public InstructorViewProfileJPanel(JPanel userProcessContainer,UserAccount account, Instructor CurrentInstructor,Organization organization,String Role, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
          this.system = system;
        this.CurrentInstructor = CurrentInstructor;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateWidgets();
    }

    
        public void PopulateWidgets(){
        txtOrganization.setText(this.Organization.getName());
        txtRole.setText(role);
        txtName.setText(this.CurrentInstructor.getName());
        txtEmail.setText(this.CurrentInstructor.getEmail());
        txtPhone.setText(this.CurrentInstructor.getPhoneNumber());
        txtUsername.setText(this.account.getUsername());
        txtAddress.setText(this.CurrentInstructor.getAddress());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrganization = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtOrganization = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        btnBack2 = new javax.swing.JButton();
        lblPhone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrganization.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        lblRole.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 30));

        lblUsername.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 160, 30));

        txtPhone.setEditable(false);
        txtPhone.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 160, 30));

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 150, 30));

        lblEmail.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 30));

        txtEmail.setEditable(false);
        txtEmail.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 150, 30));

        lblAddress.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, 50));

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 150, 30));

        txtOrganization.setEditable(false);
        txtOrganization.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, 30));

        txtRole.setEditable(false);
        txtRole.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 160, 30));

        btnBack2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack2.setText("Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        lblPhone.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/comp.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 740, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InstructorWorkAreaJPanel fosterParent = (InstructorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrganization;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
