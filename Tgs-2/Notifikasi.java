class Notifikasi {
    public int id_notifikasi;
    public User user;
    public String pesan;
    public String tanggal;
    public String status_baca;

    public void mengisiData(int id_notifikasi, User user, String pesan, String tanggal, String status_baca) {
        this.id_notifikasi = id_notifikasi;
        this.user = user;
        this.pesan = pesan;
        this.tanggal = tanggal;
        this.status_baca = status_baca;
    }

    public void tampilInfo() {
        System.out.println("===== DATA NOTIFIKASI =====");
        System.out.println("ID Notifikasi : " + id_notifikasi);
        System.out.println("ID User       : " + user.id_user);
        System.out.println("Pesan         : " + pesan);
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Status Baca   : " + status_baca);
    }
}
