/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import model.*;

/**
 *
 * @author user
 */
public class ProyekController {
    private ArrayList<ProyekTypeset> daftarProyek = new ArrayList<>();

    public ProyekController() {
        // Dummy Data Awal
        Komik k1 = new Komik("K01", "Solo Leveling", "Action");
        Typesetter t1 = new TypesetterTetap("TS01", "Syafir", 3000000);
        daftarProyek.add(new ProyekTypeset("PRJ01", k1, t1, 100, "Selesai"));
    }

    public ArrayList<ProyekTypeset> getDaftarProyek() {
        return daftarProyek;
    }

    public void tambahProyek(ProyekTypeset proyek) {
        daftarProyek.add(proyek);
    }

    public boolean ubahProyek(int index, int chapterBaru, String statusBaru) {
        if (index >= 0 && index < daftarProyek.size()) {
            ProyekTypeset p = daftarProyek.get(index);
            p.setChapter(chapterBaru);
            p.setStatus(statusBaru);
            return true;
        }
        return false;
    }

    public boolean hapusProyek(int index) {
        if (index >= 0 && index < daftarProyek.size()) {
            daftarProyek.remove(index);
            return true;
        }
        return false;
    }
}
