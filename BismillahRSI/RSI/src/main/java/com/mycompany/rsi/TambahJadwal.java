/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rsi;

/**
 *
 * @author WINDOWS 11
 */
public class TambahJadwal extends javax.swing.JFrame {

    /**
     * Creates new form TambahJadwal
     */
    public TambahJadwal() {
        initComponents();
        bTambah.setForeground(java.awt.Color.WHITE);
        bBatal.setForeground(java.awt.Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtAgenda = new javax.swing.JTextField();
        txtWaktu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bBatal = new javax.swing.JButton();
        bTambah = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        BgTambahJadwal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nama Agenda    :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        txtAgenda.setBackground(new java.awt.Color(204, 204, 204));
        txtAgenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAgenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(txtAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 520, 40));

        txtWaktu.setBackground(new java.awt.Color(204, 204, 204));
        txtWaktu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtWaktu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtWaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaktuActionPerformed(evt);
            }
        });
        getContentPane().add(txtWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 520, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Waktu Agenda   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tanggal              :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        bBatal.setBackground(new java.awt.Color(51, 0, 0));
        bBatal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bBatal.setText("KEMBALI");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });
        getContentPane().add(bBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 140, 40));

        bTambah.setBackground(new java.awt.Color(0, 51, 51));
        bTambah.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        bTambah.setText("TAMBAH");
        bTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTambahActionPerformed(evt);
            }
        });
        getContentPane().add(bTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 140, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 520, -1));

        BgTambahJadwal.setForeground(new java.awt.Color(0, 0, 0));
        BgTambahJadwal.setIcon(new javax.swing.ImageIcon("D:\\image\\Frame Tambah Jadwal Agenda.png")); // NOI18N
        BgTambahJadwal.setText("jLabel1");
        getContentPane().add(BgTambahJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgendaActionPerformed

    private void txtWaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaktuActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
        // TODO add your handling code here:
        String namaAgenda = txtAgenda.getText();
        String waktuAgenda = txtWaktu.getText();
        java.util.Date tanggalAgenda = jDateChooser1.getDate();

        // Jika salah satu dari kolom tidak kosong, tampilkan popup konfirmasi
        if (!namaAgenda.isEmpty() || !waktuAgenda.isEmpty() || tanggalAgenda != null) {
            int response = javax.swing.JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin membatalkan penambahan jadwal agenda?", "Konfirmasi", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

            if (response == javax.swing.JOptionPane.YES_OPTION) {
                DashboardAdministrator dashboardAdmin = new DashboardAdministrator();
                dashboardAdmin.setVisible(true);
                this.dispose();
            }
        } else {
            // Jika semua kolom kosong, langsung kembali ke dashboard tanpa konfirmasi
            DashboardAdministrator dashboardAdmin = new DashboardAdministrator();
            dashboardAdmin.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bBatalActionPerformed

    private void bTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTambahActionPerformed
        // TODO add your handling code here:
        String namaAgenda = txtAgenda.getText();
        String waktuAgenda = txtWaktu.getText();
        java.util.Date tanggalAgenda = jDateChooser1.getDate();

        if (namaAgenda.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Nama agenda tidak boleh kosong.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (waktuAgenda.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Waktu agenda tidak boleh kosong.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (tanggalAgenda == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Tanggal belum dipilih.", "Gagal", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Format tanggal menjadi java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(tanggalAgenda.getTime());

        // Simpan data ke database
        try (ControlAgenda db = new ControlAgenda()) {
//           boolean isSuccess = db.tambahAgenda(namaAgenda, waktuAgenda, sqlDate);

//            if (isSuccess) {
            javax.swing.JOptionPane.showMessageDialog(this, "Agenda berhasil ditambahkan.", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            clearFields();

            // Menampilkan data agenda yang ditambahkan
            db.tambahAgenda(namaAgenda, waktuAgenda, sqlDate);
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            String tanggalFormatted = sdf.format(tanggalAgenda);
            String message = "Nama Agenda : " + namaAgenda + "\nWaktu Agenda : " + waktuAgenda + "\nTanggal : " + tanggalFormatted;
            javax.swing.JOptionPane.showMessageDialog(this, message, "Agenda berhasil ditambah", javax.swing.JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                javax.swing.JOptionPane.showMessageDialog(this, "Gagal menambahkan agenda.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
//            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menambahkan agenda.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_bTambahActionPerformed

    private void clearFields() {
        txtAgenda.setText("");
        txtWaktu.setText("");
        jDateChooser1.setDate(null);
    }

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
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BgTambahJadwal;
    private javax.swing.JButton bBatal;
    private javax.swing.JButton bTambah;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAgenda;
    private javax.swing.JTextField txtWaktu;
    // End of variables declaration//GEN-END:variables
}
