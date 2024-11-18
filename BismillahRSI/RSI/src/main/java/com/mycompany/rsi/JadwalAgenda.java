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
