/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HouseLessorRole;

import Business.ChildCounsellor.ChildCounsellor;
import Business.EcoSystem;
import Business.House.House;
import Business.HouseLessor.HouseLessor;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FosterAChildWorkRequest;
import Business.WorkQueue.RentAHouseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author koushik
 */
public class houseLessorManageWorkReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form houseLessorManageWorkReqJPanel
     */
    JPanel userProcessContainer;
    public EcoSystem system;
    public HouseLessor currentHouseLessor;
    public Organization Organization;
    public String role;
    public UserAccount account;      
    
    public houseLessorManageWorkReqJPanel(JPanel userProcessContainer,UserAccount account, HouseLessor currentHouseLessor,Organization organization,String Role, EcoSystem system) {
        initComponents();
          this.userProcessContainer = userProcessContainer;
          this.system = system;
        this.currentHouseLessor = currentHouseLessor;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateTable();
    }

    public void PopulateTable(){
        DefaultTableModel model = (DefaultTableModel) tblWorkRequests.getModel();

        model.setRowCount(0);
        for(WorkRequest wq: this.system.getWorkQueue().getWorkRequestList()){
            if(wq.getClass()== RentAHouseWorkRequest.class){
                RentAHouseWorkRequest rawq = (RentAHouseWorkRequest)wq;
                if(rawq.lessor.getName().equals(this.currentHouseLessor.Name)){
                Object[] row = new Object[4];
                row[0] = rawq.getReqId();
                row[1] = rawq.getParent().getName();
                row[2] = rawq.getStatus();
                row[3] = rawq.house.getHouseName();
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequests = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage House Lessor Work Request");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        tblWorkRequests.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Parent", "Status", "House"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 600, 100));

        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btnReject.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        btnApprove.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/buyer2 (2).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 740, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HouseLessorWorkAreaJPanel fosterParent = (HouseLessorWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequests.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblWorkRequests.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 0);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    RentAHouseWorkRequest rwq= (RentAHouseWorkRequest)wq;
                    rwq.setStatus("Rejected by the HouseLessor");
                    JOptionPane.showMessageDialog(null, "Request Rejected");
                }
            }
            PopulateTable();
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequests.getSelectedRow();
        if(selectedRow >=0){
            DefaultTableModel tableRecords = (DefaultTableModel)tblWorkRequests.getModel();
            int id = (int)tableRecords.getValueAt(selectedRow, 0);
            for(WorkRequest wq: system.getWorkQueue().getWorkRequestList()){
                if(wq.getReqId()==id){
                    RentAHouseWorkRequest rwq= (RentAHouseWorkRequest)wq;
                    rwq.house.IsBooked = true;
                    rwq.setStatus("Approved by the HouseLessor");
                    JOptionPane.showMessageDialog(null, "Request Accepted.");

                }
            }
            PopulateTable();
        }
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
