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
public class JadwalAgenda {
    private String namaAgenda;
    private String waktuAgenda;
    private Date tanggalAgenda;
    
    public JadwalAgenda() {
        this.namaAgenda = "";
        this.waktuAgenda = "";
        this.tanggalAgenda = new Date();
    }
    
    public JadwalAgenda(String namaAgenda, String waktuAgenda, Date tanggalAgenda) {
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

        String detail = getDetailsForDate(formattedDate);
        return "Detail tanggal " + formattedDate + ":\n" + detail;
    }
    
    private String getDetailsForDate(String date) {
        switch (date) {
            case "09-11-2024":
                return "- Webinar pukul 10.00.";
            case "16-11-2024":
                return "- Webinar pukul 10.00.";
            case "17-11-2024":
                return "- Webinar Bulanan pukul 14.00.";
            default:
                return "- Tidak ada acara terjadwal.";
        }
    }
}
