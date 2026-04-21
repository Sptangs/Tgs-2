class Seleksi implements SeleksiProses, PengirimNotifikasi {
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

    @Override
    public void verifikasi() {
        System.out.println("Verifikasi seleksi ID " + id_seleksi);
        if (hasil != null && !hasil.isEmpty()) {
            System.out.println("Data seleksi lengkap");
        } else {
            System.out.println("Data seleksi belum lengkap");
        }
    }

    @Override
    public void tentukanHasil() {
        System.out.println("Hasil seleksi: " + hasil);
    }

    @Override
    public void kirimNotifikasi() {
        System.out.println("Notifikasi hasil seleksi dikirim untuk lamaran ID " + id_lamaran);
    }
}