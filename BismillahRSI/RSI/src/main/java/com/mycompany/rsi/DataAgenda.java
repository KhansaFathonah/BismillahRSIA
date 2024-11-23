/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rsi;
import java.util.Date;
/**
 *
 * @author WINDOWS 11
 */
public class DataAgenda {
    private int id;
    private String nama;
    private String waktu;
    private Date tanggal;

    // Constructor tanpa ID (untuk penambahan agenda baru)
    public DataAgenda(String nama, String waktu, Date tanggal) {
        this.nama = nama;
        this.waktu = waktu;
        this.tanggal = tanggal;
    }

    // Constructor lengkap (untuk agenda yang sudah ada di database)
    public DataAgenda(int id, String nama, String waktu, Date tanggal) {
        this.id = id;
        this.nama = nama;
        this.waktu = waktu;
        this.tanggal = tanggal;
    }

    // Getters dan Setters
    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getWaktu() {
        return waktu;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
