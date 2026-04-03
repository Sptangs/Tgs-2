public abstract class cobaAbstract {
    
    protected int id;
    
    public cobaAbstract(int id) {
        this.id = id;
    }
    
    public abstract void mengisiData(String nama_perusahaan, String alamat, String email);  
    public abstract void tampilInfo();
    
    public void tampilkanId() {
        System.out.println("ID: " + id);
    }
    
    public int getId() {
        return id;
    }
}