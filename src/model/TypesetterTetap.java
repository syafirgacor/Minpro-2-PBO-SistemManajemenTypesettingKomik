/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class TypesetterTetap extends Typesetter {
    private double gajipokok;

    public TypesetterTetap(String idTypesetter, String nama, double gajipokok) {
        super(idTypesetter, nama);
        this.gajipokok = gajipokok;
    }

    public double getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = gajipokok;
    }

    @Override
    public String getPeran() {
        return "Typesetter Tetap (Gaji: Rp" + (long)gajipokok + ")";
    }
}
