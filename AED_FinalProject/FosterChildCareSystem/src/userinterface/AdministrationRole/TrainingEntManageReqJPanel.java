/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrationRole;

/**
 *
 * @author koushik
 */
public class TrainingEntManageReqJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrainingEntManageReqJPanel
     */
    public TrainingEntManageReqJPanel() {
        initComponents();
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
        tblWorkRequests = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 229, 180));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        lblTitle.setText("Manage Training Center Work Requests");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        tblWorkRequests.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        tblWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Status", "Username", "Name", "Phone", "City", "Organization Type", "Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpaneTable.setViewportView(tblWorkRequests);

        add(scrollpaneTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 850, 100));

        btnAccept.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnAccept.setText("Accept");
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        btnReject.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        btnReject.setText("Reject");
        add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 10)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/SysAdminRole/children.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 740, 270));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrollpaneTable;
    private javax.swing.JTable tblWorkRequests;
    // End of variables declaration//GEN-END:variables
}
