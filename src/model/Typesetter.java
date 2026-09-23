/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Typesetter {
    protected String idTypesetter;
    protected String nama;

    public Typesetter(String idTypesetter, String nama) {
        this.idTypesetter = idTypesetter;
        this.nama = nama;
    }

    public String getIdTypesetter() {
        return idTypesetter;
    }

    public void setIdTypesetter(String idTypesetter) {
        this.idTypesetter = idTypesetter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPeran() {
        return "Typesetter Umum";
    }
}
