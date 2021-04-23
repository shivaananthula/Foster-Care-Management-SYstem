/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.House.House;
import Business.Organization.Organization;
import Business.Parent.Parent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RentAHouseWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deepika Reddy
 */
public class RentalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RentalJPanel
     */
    JPanel userProcessContainer;    
    public EcoSystem system;
    public Parent CurrentParent;
    public Organization Organization;
    public String role;
    public UserAccount account;
    
    public RentalJPanel(JPanel userProcessContainer,UserAccount account, Parent currentParent,Organization organization,String Role, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.CurrentParent = currentParent;
        this.Organization = organization;
        this.role = Role;
        this.account = account;
        this.PopulateHouses();
    }
    
    public void PopulateHouses(){
        
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();

        model.setRowCount(0);
        for(House h: this.system.getHouseDirectory().getHouseList()){
            
            Object[] row = new Object[5];
                row[0] = h.getId();
                row[1] = h.getHouseName();
                row[2] = h.getAddress();
                row[3] = h.getCity();
                row[4] = h.houseLessor.getName();
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        btnBook = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("List of Houses Available For Lease");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        tblHouses.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "City", "Address", "Lessor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHouses);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 670, 90));

        btnBook.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FosterParentRole/index(1).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 240, 430));

        Back.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblHouses.getSelectedRow();
        
        if(selectedRow>=0){
            DefaultTableModel tablerecords = (DefaultTableModel)tblHouses.getModel();
            int id = (int)tablerecords.getValueAt(selectedRow, 0);
            
            House house = system.houseDirectory.getHouseById(id);
            RentAHouseWorkRequest rentRequest = new RentAHouseWorkRequest(CurrentParent, house.getHouseLessor());
            rentRequest.house = house; 
           rentRequest.setStatus("Pending Approval State");
           rentRequest.setReqId(system.getWorkQueue().getWorkRequestList().size() +1);
            system.getWorkQueue().getWorkRequestList().add(rentRequest);
        }
        
        
    }//GEN-LAST:event_btnBookActionPerformed

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
    private javax.swing.JButton btnBook;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHouses;
    // End of variables declaration//GEN-END:variables
}
