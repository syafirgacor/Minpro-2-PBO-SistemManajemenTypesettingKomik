# 📚 Minpro-2-PBO-SistemManajemenTypesettingKomik

Program Sistem Manajemen Typesetting Komik berbasis CLI (Command Line Interface) yang dikembangkan menggunakan bahasa pemrograman Java. Program ini dirancang untuk mengelola alur pengerjaan proyek typesetting komik, data komik, dan data typesetter (baik status Tetap maupun Magang) dengan menerapkan prinsip-prinsip Pemrograman Berbasis Objek (PBO) serta arsitektur Model-View-Controller (MVC).

---

## 🏗️ Struktur Package (Arsitektur MVC)

![Screenshot Struktur Package](<img width="800" height="200" alt="image" src="https://github.com/user-attachments/assets/7d775b9a-36e3-46ea-a651-3f8055ae07e7" />)

**Penjelasan:**
Program ini disusun menggunakan arsitektur **Model-View-Controller (MVC)** untuk memisahkan logika bisnis, struktur data, dan antarmuka pengguna agar kode lebih terstruktur dan mudah dikembangkan:
* **`model`**: Berisi kelas-kelas entitas data (`Komik`, `Typesetter`, `TypesetterTetap`, `TypesetterMagang`, `ProyekTypeset`) yang mengelola enkapsulasi dan aturan data.
* **`controllers`**: Berisi kelas `ProyekController` yang bertanggung jawab mengelola logika bisnis dan manipulasi data pada `ArrayList` (CRUD).
* **`views` / `main`**: Berisi kelas utama (`MainApp` / `Minpro1PBOSistemManajemenTypesettingKomik`) yang menangani alur antarmuka CLI, pilihan menu, dan pembacaan input pengguna.

---

## 🔐 1. Access Modifier & Encapsulation

![Screenshot Access Modifier dan Encapsulation](https://via.placeholder.com/800x300?text=Upload+Screenshot+Kode+Private+Atribut+dan+Getter+Setter+Di+Sini)

**Penjelasan:**
* **Access Modifier**: Seluruh atribut utama pada kelas entitas dibungkus menggunakan modifier `private` (serta `protected` pada superclass) untuk mencegah akses langsung yang tidak terkontrol dari luar kelas.
* **Encapsulation**: Pembacaan dan pengubahan nilai atribut dilakukan secara aman menggunakan method *getter* (misal: `getJudul()`) dan *setter* (misal: `setStatus()`). Pengubahan variabel dari luar kelas wajib melalui method setter yang sudah dilengkapi dengan proteksi logika.

---

## 🧬 2. Inheritance (Superclass & Subclass)

![Screenshot Kode Inheritance](https://via.placeholder.com/800x300?text=Upload+Screenshot+Kode+Superclass+dan+Extends+Subclass+Di+Sini)

**Penjelasan:**
Menerapkan struktur pewarisan (*inheritance*) untuk mengelompokkan karakteristik typesetter:
* **Superclass (`Typesetter.java`)**: Berperan sebagai kelas induk yang menyimpan atribut umum seperti `idTypesetter` dan `nama` ber-modifier `protected`.
* **Subclass 1 (`TypesetterTetap.java`)**: Menginduk ke `Typesetter` menggunakan kata kunci `extends` dan memiliki atribut khusus `gajipokok`.
* **Subclass 2 (`TypesetterMagang.java`)**: Menginduk ke `Typesetter` menggunakan kata kunci `extends` dan memiliki atribut khusus `durasiMagangBulan`.

---

## 🛡️ 3. Validasi Input

![Screenshot Validasi Input dan Running Test](https://via.placeholder.com/800x300?text=Upload+Screenshot+Validasi+Input+Scanner+dan+Output+Error+Di+Sini)

**Penjelasan:**
Validasi input diterapkan pada dua tingkatan:
1. **Validasi Konsol (Scanner)**: Menggunakan pengecekan `scanner.hasNextInt()` pada pilihan menu dan nomor chapter. Jika pengguna menginputkan karakter/huruf saat diminta angka, program akan melempar pesan peringatan tanpa mengalami *crash* (*InputMismatchException*).
2. **Validasi Logika (Setter)**: Pada method `setChapter()` dan `setDurasiMagangBulan()`, sistem memastikan angka yang diinput bernilai positif (> 0).

---

## 💾 4. Dummy Data Awal & Fitur Read

![Screenshot Output Read Dummy Data](https://via.placeholder.com/800x300?text=Upload+Screenshot+Menu+2+Read+Data+Langsung+Tampil+Di+Sini)

**Penjelasan:**
Program secara otomatis mengisi *dummy data* awal ke dalam `ArrayList` saat pertama kali dijalankan. Hal ini membuat pengguna dapat langsung menjalankan **Menu 2 (Lihat Data)** dan melihat daftar proyek typesetting yang tersimpan tanpa harus memasukkan data secara manual dari awal.

---

## 🎭 5. Polymorphism (Method Overriding)

![Screenshot Code dan Output Polymorphism](https://via.placeholder.com/800x300?text=Upload+Screenshot+Method+Override+getPeran+dan+Hasil+Output+Di+Sini)

**Penjelasan:**
* **Method Overriding**: Method `getPeran()` pada Superclass `Typesetter` di-*override* oleh Subclass `TypesetterTetap` dan `TypesetterMagang`.
* **Implementasi**: Saat perulangan cetak data dijalankan pada menu Tampilkan Data, pemanggilan `p.getTypesetter().getPeran()` secara dinamis mencetak format output yang berbeda sesuai dengan tipe objek turunan yang tersimpan (menampilkan besaran gaji untuk Typesetter Tetap dan durasi bulan untuk Typesetter Magang).
