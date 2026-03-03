class CV {
    public int id_cv;
    public int id_user;
    public String file_cv;
    public String portofolio;

    public void mengisiData(int id_cv, int id_user, String file_cv, String portofolio) {
        this.id_cv = id_cv;
        this.id_user = id_user;
        this.file_cv = file_cv;
        this.portofolio = portofolio;
    }

    public void tampilInfo() {
        System.out.println("===== DATA CV =====");
        System.out.println("ID CV        : " + id_cv);
        System.out.println("ID User      : " + id_user);
        System.out.println("File CV      : " + file_cv);
        System.out.println("Portofolio   : " + portofolio);
    }
}