/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FosterChild.FosterChild;
import Business.Instructor.Instructor;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EnrolForTrainingWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepika Reddy
 */
public class TrainerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranieeJPanel
     */
      JPanel userProcessContainer;    
    public EcoSystem system;
    public Parent CurrentParent;
    public UserAccount account;
    public Enterprise Enterprise;
    public Network network;
    
    public TrainerJPanel(JPanel userProcessContainer,UserAccount account, Parent currentParent, Network network, Enterprise enterprise, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.CurrentParent = currentParent;
        this.Enterprise = enterprise;
        this.account = account;
        this.network = network;
        populateTable();
    }
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblInstructors.getModel();
        model.setRowCount(0);
        
        for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
            
            if(enterprise.getEnterpriseType().toString().equals("Training Center")){
                for(Instructor ins: enterprise.getInstructorDirectory().InstructorList){
                    Object[] row = new Object[model.getColumnCount()];
                    row[0]= ins;
                row[1] = ins.getInstructorId();
                row[2] = ins.getName();
                row[3] = ins.getPhoneNumber();
                row[4] = ins.getAddress();
               ((DefaultTableModel) tblInstructors.getModel()).addRow(row);
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

        scrollpaneInstructor = new javax.swing.JScrollPane();
        tblInstructors = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        btnEnroll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblInstructors.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblInstructors.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblInstructors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Instructor", "Instructor ID", "Name", "Phone", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneInstructor.setViewportView(tblInstructors);

        add(scrollpaneInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 510, 100));

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("List of Trainers");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        btnEnroll.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnEnroll.setText("Enroll");
        btnEnroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnrollActionPerformed(evt);
            }
        });
        add(btnEnroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FosterParentRole/index(1).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 240, 430));

        Back.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnrollActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblInstructors.getSelectedRow();
        
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblInstructors.getModel();
            Instructor ins = (Instructor)tableRecords.getValueAt(selectedRow, 0);
        
            EnrolForTrainingWorkRequest enrolReq = new EnrolForTrainingWorkRequest();
            enrolReq.setEnterprise(Enterprise);
            enrolReq.setNetwork(network);
            enrolReq.setParent(CurrentParent);
            enrolReq.setInstructor(ins);
            enrolReq.setStatus("Training Enroll requested.");
            enrolReq.setReqId(system.getWorkQueue().getWorkRequestList().size()+1);
            
            system.getWorkQueue().getWorkRequestList().add(enrolReq);
            
                        JOptionPane.showMessageDialog(null, " Training Enrolled Requested.");

       }
    }//GEN-LAST:event_btnEnrollActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FosterParentWorkAreaJPanel sysAdminwjp = (FosterParentWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton btnEnroll;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneInstructor;
    private javax.swing.JTable tblInstructors;
    // End of variables declaration//GEN-END:variables
}
