/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class TypesetterMagang extends Typesetter {
    private int durasiMagangBulan; // Atribut spesifik untuk Typesetter Magang

    // Constructor Subclass (memanggil constructor superclass dengan 'super')
    public TypesetterMagang(String idTypesetter, String nama, int durasiMagangBulan) {
        super(idTypesetter, nama);
        this.durasiMagangBulan = durasiMagangBulan;
    }

    // Getter dan Setter Atribut Khusus
    public int getDurasiMagangBulan() {
        return durasiMagangBulan;
    }

    public void setDurasiMagangBulan(int durasiMagangBulan) {
        this.durasiMagangBulan = durasiMagangBulan;
    }

    // Method Overriding (Nilai Tambah Polymorphism)
    @Override
    public String getPeran() {
        return "Typesetter Magang (" + durasiMagangBulan + " Bulan)";
    }
}
