/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FosterParentRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shiva
 */
public class FosterParentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FosterParentWorkAreaJPanel
     */
    JPanel userProcessContainer;    
    public EcoSystem system;
    public FosterParentWorkAreaJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewProfile = new javax.swing.JButton();
        btnRental = new javax.swing.JButton();
        btnFosterChild = new javax.swing.JButton();
        btnStipend = new javax.swing.JButton();
        btnTrainers = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewProfile.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        btnRental.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnRental.setText("Rental House");
        btnRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalActionPerformed(evt);
            }
        });
        add(btnRental, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnFosterChild.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFosterChild.setText("Foster Child");
        btnFosterChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFosterChildActionPerformed(evt);
            }
        });
        add(btnFosterChild, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        btnStipend.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnStipend.setText("Stipend");
        add(btnStipend, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        btnTrainers.setText("Training");
        btnTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainersActionPerformed(evt);
            }
        });
        add(btnTrainers, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
         ViewProfileJPanel viewProfile=new ViewProfileJPanel(userProcessContainer, system);
        userProcessContainer.add("View Profile",viewProfile);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalActionPerformed
        // TODO add your handling code here:
        RentalJPanel rental=new RentalJPanel(userProcessContainer, system);
        userProcessContainer.add("Foster Child List",rental);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_btnRentalActionPerformed

    private void btnFosterChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFosterChildActionPerformed
        // TODO add your handling code here:
        FosterAChild fosterChild=new FosterAChild(userProcessContainer, system);
        userProcessContainer.add("Foster Child List",fosterChild);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFosterChildActionPerformed

    private void btnTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainersActionPerformed
        // TODO add your handling code here:
        TrainerJPanel trainer=new TrainerJPanel(userProcessContainer, system);
        userProcessContainer.add("View Trainers",trainer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTrainersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFosterChild;
    private javax.swing.JButton btnRental;
    private javax.swing.JButton btnStipend;
    private javax.swing.JButton btnTrainers;
    private javax.swing.JButton btnViewProfile;
    // End of variables declaration//GEN-END:variables
}
