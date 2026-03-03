class Admin {
    public int id_admin;
    public String nama;
    public String email;
    public String password;

    public void mengisiData(int id_admin, String nama, String email, String password) {
        this.id_admin = id_admin;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public void tampilInfo() {
        System.out.println("===== DATA ADMIN =====");
        System.out.println("ID Admin : " + id_admin);
        System.out.println("Nama     : " + nama);
        System.out.println("Email    : " + email);
    }
}