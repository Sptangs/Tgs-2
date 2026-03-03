class Perusahaan {
    public int id_perusahaan;
    public String nama_perusahaan;
    public String alamat;
    public String email;

    public void mengisiData(int id_perusahaan, String nama_perusahaan, String alamat, String email) {
        this.id_perusahaan = id_perusahaan;
        this.nama_perusahaan = nama_perusahaan;
        this.alamat = alamat;
        this.email = email;
    }

    public void tampilInfo() {
        System.out.println("===== DATA PERUSAHAAN =====");
        System.out.println("ID Perusahaan   : " + id_perusahaan);
        System.out.println("Nama Perusahaan : " + nama_perusahaan);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Email           : " + email);
    }
}