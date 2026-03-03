public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.mengisiData(1, "Budi", "budi@mail.com", "rahasia123", "Jakarta");

        CV cv = new CV();
        cv.mengisiData(1, user.id_user, "cv_budi.pdf", "github.com/budi");

        Lowongan lowongan = new Lowongan();
        lowongan.mengisiData(1, 100, "Java Developer", "Mengembangkan aplikasi backend", "Bandung");

        Lamaran lamaran = new Lamaran();
        lamaran.mengisiData(1, user.id_user, lowongan.id_lowongan, "2026-03-02", "Diproses");

        Seleksi seleksi = new Seleksi();
        seleksi.mengisiData(1, lamaran.id_lamaran, "Interview", "Lolos");

        Perusahaan perusahaan = new Perusahaan();
        perusahaan.mengisiData(1, "PT Maju Jaya", "Jakarta", "hr@majujaya.com");

        Admin admin = new Admin();
        admin.mengisiData(1, "Septian", "admin@mail.com", "admin123");

        Notifikasi notifikasi = new Notifikasi();
        notifikasi.mengisiData(
            1,
            user.id_user,
            "Selamat! Anda lolos tahap Interview.",
            "2026-03-05",
            "Belum Dibaca"
        );

        user.tampilInfo();
        System.out.println();

        cv.tampilInfo();
        System.out.println();

        lowongan.tampilInfo();
        System.out.println();

        lamaran.tampilInfo();
        System.out.println();

        seleksi.tampilInfo();
        System.out.println();

        perusahaan.tampilInfo();
        System.out.println();

        admin.tampilInfo();
        System.out.println();

        notifikasi.tampilInfo();
    }
}