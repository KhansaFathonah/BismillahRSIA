/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Asus
 */
public class JadwalControl {
    private String namaAgenda;
    private String waktuAgenda;
    private Date tanggalAgenda;
    
    public JadwalControl() {
        this.namaAgenda = "";
        this.waktuAgenda = "";
        this.tanggalAgenda = new Date();
    }
    
    public JadwalControl(String namaAgenda, String waktuAgenda, Date tanggalAgenda) {
        this.namaAgenda = namaAgenda;
        this.waktuAgenda = waktuAgenda;
        this.tanggalAgenda = tanggalAgenda;
    }

    public String getNamaAgenda() {
        return namaAgenda;
    }
    
    public void setNamaAgenda(String namaAgenda) {
        this.namaAgenda = namaAgenda;
    }

    public String getWaktuAgenda() {
        return waktuAgenda;
    }

    public void setWaktuAgenda(String waktuAgenda) {
        this.waktuAgenda = waktuAgenda;
    }

    public Date getTanggalAgenda() {
        return tanggalAgenda;
    }

    public void setTanggalAgenda(Date tanggalAgenda) {
        this.tanggalAgenda = tanggalAgenda;
    }

    public String showDateDetails(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = sdf.format(date);
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date2 = sdf.format(date);
        DatabaseConnection db = new DatabaseConnection();
        String detail = db.getDetailsForDate(date2);
        return "Detail tanggal " + formattedDate + ":\n" + detail;
    }
}