# JOBSHEET 3
## Pertanyaan: 2.1.3

1. - Atribut (Properties)

``` java
String nama;
String nim;
String kelas;
double ipk;
```

- Method (Perilaku)

```java
tampilkanInformasi(): void
ubahKelas(kelasBaru: String): void
updateIpk(ipkBaru: double): void
nilaiKinerja(ipk: double): String
```

2. ada 4 artribut yaitu : 
```java
String nama;
String nim;
String kelas;
double ipk;
```

3. ada 4, yaitu:

- `void tampilkanInformasi()`
   - Untuk menampilkan informasi mahasiswa (nama, NIM, IPK, dan kelas).
- `void ubahKelas(String kelasBaru)`
   - Untuk mengubah kelas mahasiswa.
- `void updateIpk(double ipkBaru)`
   - Untuk memperbarui nilai IPK mahasiswa.
- `String nilaiKinerja()`
   - Untuk menentukan dan mengembalikan nilai kinerja berdasarkan IPK.

4. saya melakukan perubahan menjadi :
```java
   public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
```

5. pertama yang akan di jalankan membaca nilai variabel ipk -> Kemudian dilakukan pengecekan bertahap dari kondisi tertinggi ke terendah -> Saat suatu kondisi terpenuhi, method langsung mengembalikan (return) nilai yang sesuai dan tidak mengecek kondisi berikutnya.


## Pertanyaan 2.2.3

1. bariskode ke 5 atau ``Mahasiswa05 mhs1 = new Mahasiswa05();`` yang menjadi nama object menajdi mhs1

2. Atribut dan method diakses menggunakan operator titik (.) contohnya:
```java
namaObjek.namaAtribut
namaObjek.namaMethod()
```

3. Karena sebelum pemanggilan tampilkanInformasi() yang kedua, terdapat perubahan data pada objek mhs1, yaitu:
```java
mhs1.ubahKelas("SI 2K");
mhs1.updateIpk(3.60);
```

## Pertanyaan 2.3.3

1. 
```java
public Mahasiswa05(String nm, String nim, double ipk, String kls) {
    nama = nm;
    this.nim = nim;
    this.ipk = ipk;
    kelas = kls;
}
```

2. code ter sebut adalah code instansiasi class atau object

3. erorr karena saya masih melakukan instansiasi tanpa menambahkan parameter

4. tidak, karena semua method pada object berjalan secara independent terhadap object

5. 
``` java
Mahasiswa05 mhsDairu = new Mahasiswa05("Dairu Fatahillah", "2541060606140", 3.80, "SIB 1F");
```