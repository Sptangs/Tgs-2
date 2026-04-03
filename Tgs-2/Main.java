public class Main {
    public static void main(String[] args) {
        // test abstract
        Perusahaan p = new Perusahaan(99);
        p.mengisiData("PT. Maju Jaya", "Jakarta", "info@majujaya.com");
        p.tampilInfo();
        p.tampilkanId();  // method dari Entitas
        
        System.out.println();
        
        // Test Interface
        Seleksi s = new Seleksi();
        s.mengisiData(1, 101, "Wawancara", "Lulus");
        s.tampilInfo();
        s.verifikasi();
        s.tentukanHasil();
        s.kirimNotifikasi();
    }
}
