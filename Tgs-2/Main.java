public class Main {
    public static void main(String[] args) {
        // Abstract class test
        cobaAbstract p = new Perusahaan(99);
        p.mengisiData("PT. Maju Jaya", "Jakarta", "info@majujaya.com");
        p.tampilInfo();
        p.tampilkanId();
        
        System.out.println();
        
        // Interface test - PASTIKAN PAKAI OBJEK YANG SAMA
        Seleksi s = new Seleksi();           // buat objek
        s.mengisiData(1, 101, "Wawancara", "Lulus");  // isi data
        s.tampilInfo();                      // cetak data
        s.verifikasi();                      // baru verifikasi
        s.tentukanHasil();
        s.kirimNotifikasi();
    }
}