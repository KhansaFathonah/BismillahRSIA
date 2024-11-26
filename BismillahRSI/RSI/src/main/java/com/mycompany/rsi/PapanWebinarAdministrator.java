/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hanif
 */
public class PapanWebinarAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form PapanWebinarAdministrator
     */
    public PapanWebinarAdministrator() {
        initComponents();
        jButton1.setForeground(java.awt.Color.WHITE);
        jButton2.setForeground(java.awt.Color.WHITE);
        tombolDelete.setForeground(java.awt.Color.WHITE);
        tombolUpdate.setForeground(java.awt.Color.WHITE);
        
        populateTable();
    }
    
    public void validateField(){
        String judul = txtJudul.getText();
        String deskripsi = txtDeskripsi.getText();
        Date hari_tgl = jTanggalWebinar.getDate();
        String link_daftar = txtLinkPendaftaran.getText();
        if(!judul.equals("") && !deskripsi.equals("") && hari_tgl !=null && !link_daftar.equals(""))
            tombolUpdate.setEnabled(true);
        else
            tombolUpdate.setEnabled(false);
    }
    
    public void populateTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);

    ArrayList<Webinar> webinarList = tampilanWebinar.getAllRecords();

    for (Webinar webinar : webinarList) {
        Object[] row = {
            webinar.getId(),
            webinar.getJudul(),
            webinar.getTanggal()
        };
        model.addRow(row);
    }
}
    private void loadData() {
    String sql = "SELECT id, judul, hari_tgl FROM webinar";
    
    try {
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        while (rs.next()) {
            Object[] row = {
                rs.getInt("id"),          
                rs.getString("judul"),  
                rs.getString("hari_tgl")   
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTanggalWebinar = new com.toedter.calendar.JDateChooser();
        txtLinkPendaftaran = new javax.swing.JTextField();
        txtDeskripsi = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tombolDelete = new javax.swing.JButton();
        tombolUpdate = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bHome = new javax.swing.JButton();
        profileAdmin = new javax.swing.JLabel();
        bgPapanWebinar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Judul", "Tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 320, 340, 200));
        getContentPane().add(jTanggalWebinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 300, -1));

        txtLinkPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkPendaftaranActionPerformed(evt);
            }
        });
        txtLinkPendaftaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLinkPendaftaranKeyReleased(evt);
            }
        });
        getContentPane().add(txtLinkPendaftaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 300, -1));

        txtDeskripsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeskripsiKeyReleased(evt);
            }
        });
        getContentPane().add(txtDeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 300, -1));

        txtJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulActionPerformed(evt);
            }
        });
        txtJudul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJudulKeyReleased(evt);
            }
        });
        getContentPane().add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 300, -1));

        lblId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("00");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LINK PENDAFTARAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TANGGAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESKRIPSI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JUDUL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 0, 0));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton2.setText("Upload");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 110, -1));

        tombolDelete.setBackground(new java.awt.Color(51, 0, 0));
        tombolDelete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tombolDelete.setText("DELETE");
        tombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(tombolDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 100, 30));

        tombolUpdate.setBackground(new java.awt.Color(0, 51, 51));
        tombolUpdate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tombolUpdate.setText("UPDATE");
        tombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(tombolUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, 30));

        bLogout.setBackground(new java.awt.Color(255, 249, 243));
        bLogout.setBorder(null);
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(bLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 60, -1));

        bHome.setBackground(new java.awt.Color(255, 249, 243));
        bHome.setBorder(null);
        bHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHomeActionPerformed(evt);
            }
        });
        getContentPane().add(bHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 60, -1));

        profileAdmin.setIcon(new javax.swing.ImageIcon("D:\\Chanbaek\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\orang.png")); // NOI18N
        getContentPane().add(profileAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

        bgPapanWebinar.setIcon(new javax.swing.ImageIcon("D:\\Chanbaek\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\Papan webinar baru (1).png")); // NOI18N
        getContentPane().add(bgPapanWebinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DashboardAdministrator dashboardAdmin = new DashboardAdministrator();
        dashboardAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UploadWebinar upWebinarAdmin = new UploadWebinar();
        upWebinarAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolDeleteActionPerformed
        // TODO add your handling code here:
        String id = lblId.getText();
        int idInt = Integer.parseInt(id);
        Webinar webinar = new Webinar(idInt);
        webinar.deleteWebinar(idInt);
        JOptionPane.showMessageDialog(this, "Webinar berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        lblId.setText("00");
        txtJudul.setText("");
        txtDeskripsi.setText("");
        jTanggalWebinar.setDate(null);
        txtLinkPendaftaran.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(idInt)) {
                model.removeRow(i); 
                break;
            }
        }

        model.fireTableDataChanged();
    }//GEN-LAST:event_tombolDeleteActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        // TODO add your handling code here:
        LogIn login = new LogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bLogoutActionPerformed

    private void tombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUpdateActionPerformed
        // TODO add your handling code here:
        Webinar webinar = new Webinar();
        int idInt = Integer.parseInt(lblId.getText());
        webinar.setId(idInt);
        webinar.setJudul(txtJudul.getText());
        webinar.setDeskripsi(txtDeskripsi.getText());
        java.util.Date hari = jTanggalWebinar.getDate();
        if (hari != null) {
            java.sql.Date sqlDate = new java.sql.Date(hari.getTime()); 
            webinar.setTanggal(sqlDate); 
        } else {
        JOptionPane.showMessageDialog(this, "Tanggal tidak valid!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; 
        }
        webinar.setLinkPendaftaran(txtLinkPendaftaran.getText());
        webinar.updateWebinar(idInt);
        JOptionPane.showMessageDialog(this, "Webinar berhasil update", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        lblId.setText("00");
        txtJudul.setText("");
        txtDeskripsi.setText("");
        jTanggalWebinar.setDate(null);
        txtLinkPendaftaran.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  
        loadData();  
        model.fireTableDataChanged();  

    }//GEN-LAST:event_tombolUpdateActionPerformed

    private void txtJudulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJudulKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtJudulKeyReleased

    private void txtDeskripsiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeskripsiKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtDeskripsiKeyReleased

    private void txtLinkPendaftaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLinkPendaftaranKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtLinkPendaftaranKeyReleased

    private void txtJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulActionPerformed

    private void txtLinkPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkPendaftaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkPendaftaranActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        lblId.setText(id);
        String judul = model.getValueAt(index, 1).toString();
        txtJudul.setText(judul);
        String tanggal = model.getValueAt(index, 2).toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = sdf.parse(tanggal);
                jTanggalWebinar.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        try (Connection conn = DatabaseConnection.getConnection()) {
        String query = "SELECT deskripsi, link_daftar FROM webinar WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id); 
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String deskripsi = rs.getString("deskripsi");
            txtDeskripsi.setText(deskripsi); 
            String linkDaftar = rs.getString("link_daftar");
            txtLinkPendaftaran.setText(linkDaftar); 
        } else {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan di database!");
        }
        } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error saat mengambil data dari database: " + ex.getMessage());
        }
        tombolUpdate.setEnabled(true);
        tombolDelete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void bHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHomeActionPerformed
        // TODO add your handling code here:
        DashboardAdministrator dbAdmin = new DashboardAdministrator();
        dbAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bHomeActionPerformed

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
            java.util.logging.Logger.getLogger(PapanWebinarAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PapanWebinarAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PapanWebinarAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHome;
    private javax.swing.JButton bLogout;
    private javax.swing.JLabel bgPapanWebinar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jTanggalWebinar;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel profileAdmin;
    private javax.swing.JButton tombolDelete;
    private javax.swing.JButton tombolUpdate;
    private javax.swing.JTextField txtDeskripsi;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtLinkPendaftaran;
    // End of variables declaration//GEN-END:variables
}
