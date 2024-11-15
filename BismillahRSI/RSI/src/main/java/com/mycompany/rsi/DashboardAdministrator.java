/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

/**
 *
 * @author Asus
 */
public class DashboardAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form DashboardAdministrator
     */
    public DashboardAdministrator() {
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

        BInfoWeb = new javax.swing.JButton();
        NamaPR = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel6 = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        namaAdmin = new javax.swing.JLabel();
        bHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BInfoWeb.setBackground(new java.awt.Color(0, 51, 51));
        BInfoWeb.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        BInfoWeb.setForeground(new java.awt.Color(255, 255, 255));
        BInfoWeb.setText("Informasi Webinar");
        BInfoWeb.setToolTipText("");
        BInfoWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInfoWebActionPerformed(evt);
            }
        });
        getContentPane().add(BInfoWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 200, 30));

        NamaPR.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NamaPR.setForeground(new java.awt.Color(0, 0, 0));
        NamaPR.setText("ADMINISTRATOR");
        getContentPane().add(NamaPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jCalendar1.setBackground(new java.awt.Color(255, 255, 255));
        jCalendar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 260));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\image\\orang.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

        bUpdate.setBackground(new java.awt.Color(255, 222, 89));
        bUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bUpdate.setForeground(new java.awt.Color(0, 0, 0));
        bUpdate.setText("UPDATE");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 90, 30));

        bTambah.setBackground(new java.awt.Color(160, 254, 76));
        bTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bTambah.setForeground(new java.awt.Color(0, 0, 0));
        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });
        getContentPane().add(bTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 90, 30));

        namaAdmin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        namaAdmin.setForeground(new java.awt.Color(0, 0, 0));
        namaAdmin.setText("NAMA ADMIN");
        getContentPane().add(namaAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        bHapus.setBackground(new java.awt.Color(255, 189, 89));
        bHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bHapus.setForeground(new java.awt.Color(0, 0, 0));
        bHapus.setText("HAPUS");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        getContentPane().add(bHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\image\\Frame Dashboard General.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 510, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BInfoWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInfoWebActionPerformed
        // TODO add your handling code here:
        PapanWebinarAdministrator webinarAdmin = new PapanWebinarAdministrator();
        webinarAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BInfoWebActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        TambahJadwal tambahJadwal = new TambahJadwal();
        tambahJadwal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bTambahActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
        UpdateJadwal updateJadwal = new UpdateJadwal();
        updateJadwal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
        HapusJadwalAgenda hapusAgenda = new HapusJadwalAgenda();
        hapusAgenda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bHapusActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BInfoWeb;
    private javax.swing.JLabel NamaPR;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bTambah;
    private javax.swing.JButton bUpdate;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel namaAdmin;
    // End of variables declaration//GEN-END:variables
}
