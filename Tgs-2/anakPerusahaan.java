public class anakPerusahaan extends Perusahaan {

    public String namaInduk;
    public String bidangUsaha;

    public void mengisiDataAnak(int id, String nama, String alamat, String email,
                                String namaInduk, String bidangUsaha) {

        super.mengisiData(id, nama, alamat, email);

        this.namaInduk = namaInduk;
        this.bidangUsaha = bidangUsaha;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Perusahaan Induk : " + namaInduk);
        System.out.println("Bidang Usaha     : " + bidangUsaha);
    }
}