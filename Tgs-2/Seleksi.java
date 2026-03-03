class Seleksi {
    public int id_seleksi;
    public int id_lamaran;
    public String tahap;
    public String hasil;

    public void mengisiData(int id_seleksi, int id_lamaran, String tahap, String hasil) {
        this.id_seleksi = id_seleksi;
        this.id_lamaran = id_lamaran;
        this.tahap = tahap;
        this.hasil = hasil;
    }

    public void tampilInfo() {
        System.out.println("===== DATA SELEKSI =====");
        System.out.println("ID Seleksi  : " + id_seleksi);
        System.out.println("ID Lamaran  : " + id_lamaran);
        System.out.println("Tahap       : " + tahap);
        System.out.println("Hasil       : " + hasil);
    }
}