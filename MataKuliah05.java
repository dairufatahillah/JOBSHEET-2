public class MataKuliah05 {
    public String kodeMatkul;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah05() {}

    public MataKuliah05(String kodeMatkul, String nama, int sks, int jumlahJam) {
        this.kodeMatkul = kodeMatkul;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK     = " + kodeMatkul);
        System.out.println("Nama MK     = " + nama);
        System.out.println("SKS         = " + sks);
        System.out.println("Jumlah Jam  = " + jumlahJam);
        System.out.println("-----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS diubah menjadi " + sksBaru);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam ditambah menjadi " + this.jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam dikurangi. Jumlah jam sekarang: " + this.jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}