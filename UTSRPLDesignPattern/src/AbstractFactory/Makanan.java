package AbstractFactory;
public class Makanan {
    
    private String nama;
    private int harga, ke;
    
    public void setMakanan(String nama, int harga, int ke){
         this.nama = nama;
         this.harga = harga;
         this.ke = ke;
    };
    
    public String getNama(){
        return this.nama;
    }
    
    public int getHarga(){
        return this.harga;
    }
    
    public int getKe(){
        return this.ke;
    }
}
