package AbstractFactory;

public class MakananFactory {
    public Makanan createMakanan(String nama, int harga, int ke){
        return new setMkn(nama, harga, ke);
    }
}
