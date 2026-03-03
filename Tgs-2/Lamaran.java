public class Lamaran {
    public int id_lamaran;
    public int id_user;
    public int id_lowongan;
    public String tanggal;
    public String status;

    public void mengisiData(int id_lamaran, int id_user, int id_lowongan, String tanggal, String status) {
        this.id_lamaran = id_lamaran;
        this.id_user = id_user;
        this.id_lowongan = id_lowongan;
        this.tanggal = tanggal;
        this.status = status;
    }

    public void tampilInfo() {
        System.out.println("===== DATA LAMARAN =====");
        System.out.println("ID Lamaran : " + id_lamaran);
        System.out.println("ID User    : " + id_user);
        System.out.println("ID Lowongan: " + id_lowongan);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Status     : " + status);
    }
}
