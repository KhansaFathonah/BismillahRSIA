/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class PapanWebinarPR extends javax.swing.JFrame {

    /**
     * Creates new form PapanWebinarPR
     */
    public PapanWebinarPR() {
        initComponents();
        
        populateTable();
    }
    
    public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    ArrayList<Webinar> webinarList = tampilanWebinar.getAllRecords();

    for (Webinar webinar : webinarList) {
        Object[] row = {
            webinar.getJudul(),
        };
        model.addRow(row);
    }
}
    
    private void loadData() {
    String sql = "SELECT judul FROM webinar";
    
    try {
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        while (rs.next()) {
            Object[] row = {  
                rs.getString("judul"),    
            };
            model.addRow(row);
        }
    } catch (SQLException e) {
        e.printStackTrace();
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

        jMenu1 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bHome = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        profilePR = new javax.swing.JLabel();
        lbllinkPendaftaran = new javax.swing.JLabel();
        lbltanggal = new javax.swing.JLabel();
        lbldeskripsi = new javax.swing.JLabel();
        lbljudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(233, 246, 211));
        jTable1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 340, 430));

        bHome.setBackground(new java.awt.Color(255, 249, 243));
        bHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVINDA HERAST\\Documents\\NetBeansProjects\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\image.png")); // NOI18N
        bHome.setBorder(null);
        getContentPane().add(bHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 50, -1));

        bLogout.setBackground(new java.awt.Color(255, 249, 243));
        bLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVINDA HERAST\\Documents\\NetBeansProjects\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\logout.png")); // NOI18N
        bLogout.setBorder(null);
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(bLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 40, 40));

        profilePR.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVINDA HERAST\\Documents\\NetBeansProjects\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\orang.png")); // NOI18N
        getContentPane().add(profilePR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

        lbllinkPendaftaran.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbllinkPendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbllinkPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 470, 30));

        lbltanggal.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbltanggal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbltanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 470, 30));

        lbldeskripsi.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbldeskripsi.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbldeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 470, 90));

        lbljudul.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(lbljudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 470, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVINDA HERAST\\Downloads\\Frame Papan Webinar Pengguna (5).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bLogoutActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String judul = model.getValueAt(index, 0).toString();
        lbljudul.setText(judul);
        
        try (Connection conn = DatabaseConnection.getConnection()) {
            
        String query = "SELECT deskripsi, link_daftar, hari_tgl FROM webinar WHERE judul = ?";
    
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, judul);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String deskripsi = rs.getString("deskripsi");
            lbldeskripsi.setText(deskripsi); 
            String tanggal = rs.getString("hari_tgl");
            lbltanggal.setText(tanggal); 
            String linkDaftar = rs.getString("link_daftar");
            lbllinkPendaftaran.setText(linkDaftar); 
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan di database!");
        }
        } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saat mengambil data dari database: " + ex.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PapanWebinarPR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHome;
    private javax.swing.JButton bLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbldeskripsi;
    private javax.swing.JLabel lbljudul;
    private javax.swing.JLabel lbllinkPendaftaran;
    private javax.swing.JLabel lbltanggal;
    private javax.swing.JLabel profilePR;
    // End of variables declaration//GEN-END:variables
}
