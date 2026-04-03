class Perusahaan extends cobaAbstract {
    public String nama_perusahaan;
    public String alamat;
    public String email;

        // Constructor
    public Perusahaan(int id) {
        super(id);  // panggil id dari cobaAbstract
    }

    @Override
    public void mengisiData(String nama_perusahaan, String alamat, String email) {
        this.nama_perusahaan = nama_perusahaan;
        this.alamat = alamat;
        this.email = email;
    }

    public void tampilInfo() {
        System.out.println("===== DATA PERUSAHAAN =====");
        System.out.println("ID Perusahaan   : " + id);
        System.out.println("Nama Perusahaan : " + nama_perusahaan);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Email           : " + email);
    }
}
