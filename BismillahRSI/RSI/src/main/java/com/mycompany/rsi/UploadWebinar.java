/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;



/**
 *
 * @author DEVINDA HERAST
 */
public class UploadWebinar extends javax.swing.JFrame {

    /**
     * Creates new form UploadWebinar
     */
    public UploadWebinar() {
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

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Profile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 0));
        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 0));
        jButton1.setText("KEMBALI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, -1));

        jTextField4.setBackground(new java.awt.Color(172, 189, 115));
        jTextField4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 570, 30));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LINK PENDAFTARAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TANGGAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jTextField2.setBackground(new java.awt.Color(172, 189, 115));
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 570, 30));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESKRIPSI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jTextField1.setBackground(new java.awt.Color(172, 189, 115));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 570, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JUDUL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 570, -1));

        Profile.setIcon(new javax.swing.ImageIcon("D:\\Chanbaek\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\orang.png")); // NOI18N
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Chanbaek\\BismillahRSIA\\BismillahRSI\\RSI\\src\\main\\java\\com\\mycompany\\rsi\\image\\Frame Upload Informasi Webinar.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String judul = jTextField1.getText();
        String deskripsi = jTextField2.getText();
        java.util.Date hari = jDateChooser1.getDate();
        java.sql.Date hari_tgl = new java.sql.Date(hari.getTime());
        String link_daftar = jTextField4.getText();
        Webinar webinar = new Webinar(judul, deskripsi, link_daftar, hari_tgl);

        if (judul.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Judul webinar tidak boleh kosong.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (deskripsi.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Deskripsi webinar tidak boleh kosong.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (hari_tgl == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Tanggal belum dipilih.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (link_daftar.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Link pendaftaran webinar tidak boleh kosong.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String tanggalFormatted = sdf.format(hari_tgl);
        String message = "Nama Webinar : " + judul + "\nDeskripsi Webinar : " + deskripsi + "\nTanggal : " + tanggalFormatted + "\n Link Pendaftaran : " + link_daftar;
        javax.swing.JOptionPane.showMessageDialog(this, message, "Webinar berhasil ditambahkan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
        try {
            webinar.insertWebinar(judul, deskripsi, link_daftar, hari_tgl);
            PapanWebinarAdministrator pwa = new PapanWebinarAdministrator();
            pwa.setVisible(true);
            this.dispose(); // Menutup halaman saat ini
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuka halaman Dashboard.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Debugging error jika terjadi
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PapanWebinarAdministrator papanWebinar = new PapanWebinarAdministrator();
        papanWebinar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(UploadWebinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadWebinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadWebinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadWebinar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadWebinar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Profile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
