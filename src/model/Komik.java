/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Komik {
    private String idKomik;
    private String judul;
    private String genre;

    public Komik(String idKomik, String judul, String genre) {
        this.idKomik = idKomik;
        this.judul = judul;
        this.genre = genre;
    }


    public String getIdKomik() {
        return idKomik;
    }


    public void setIdKomik(String idKomik) {
        if (idKomik != null && !idKomik.trim().isEmpty()) {
            this.idKomik = idKomik;
        } else {
            System.out.println("[PERINGATAN] ID Komik tidak boleh kosong!");
        }
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        if (judul != null && !judul.trim().isEmpty()) {
            this.judul = judul;
        } else {
            System.out.println("[PERINGATAN] Judul Komik tidak boleh kosong!");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
    
