public class Dosen05 {

    public String idDosen;
    public String nama;
    public boolean statusAktif;
    public int tahunBergabung;
    public String bidangKeahlian;

    public Dosen05() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = " ";
    }

    public Dosen05(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("--------------------------------------");
    }

    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
        if (status) {
            System.out.println("Status dosen sekarang: Aktif");
        } else {
            System.out.println("Status dosen sekarang: Tidak Aktif");
        }
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - this.tahunBergabung;
    }

    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidang);
    }
}