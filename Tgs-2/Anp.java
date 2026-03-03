public class Anp {
    
}
class AnPerusahaan extends Perusahaan {

    public void mengisiData() {
        System.out.println("Nama pengisi: Krisna");
    }

    public static void main(String[] args) {
        AnPerusahaan anak1 = new AnPerusahaan();

        anak1.id_perusahaan = 99;
        anak1.nama_perusahaan = "PT. Krisna Jaya Abadi";
        anak1.alamat = "Babadan Ponorogo";
        anak1.email = "KRISNA@gmail.com";

        System.out.println("---------------------");
        System.out.println("Jajal Pewarisan");
        System.out.println("---------------------");

        anak1.tampilInfo();

        anak1.mengisiData();
    }
}