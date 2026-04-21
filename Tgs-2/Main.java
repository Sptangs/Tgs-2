public class Main {
    public static void jalankanSeleksi(SeleksiProses sp) {
    System.out.println("=== Proses Seleksi (Polymorphism) ===");
    sp.verifikasi();
    sp.tentukanHasil();
    System.out.println();
}

    public static void main(String[] args) {
        // Abstract class test
        cobaAbstract p = new Perusahaan(99);
        p.mengisiData("PT. Maju Jaya", "Jakarta", "info@majujaya.com");
        p.tampilInfo();
        p.tampilkanId();
        
        System.out.println();
        
        Seleksi s1 = new Seleksi();
        s1.mengisiData(1, 101, "Wawancara", "Lulus");
        s1.tampilInfo();
        jalankanSeleksi(s1);

        Seleksi s2 = new Seleksi();
        s2.mengisiData(2, 102, "Tes Tulis", "Tidak Lulus");
        s2.tampilInfo();
        jalankanSeleksi(s2); 
    
    }
}