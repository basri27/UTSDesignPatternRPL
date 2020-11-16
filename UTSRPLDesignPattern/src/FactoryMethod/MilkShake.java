package FactoryMethod;

public class MilkShake implements Minuman
{
    private String namaMinuman = MilkShake.class.getSimpleName();
    @Override //overriding untuk menjalakan fungsi yang terdapat pada classnya tersendiri
    public void rasa()
    {
        System.out.println(namaMinuman+" : Harga Rp15.000 ");
    }
}

 //maksudanya overriding ini sebuah fungsi atau mathod dari superclass (kelas induk) yang ditulis kembali pada subclassnya
 //jika ada subclassnya buat jaga jaga

 //MilkShake.java berperan sebagai Concrete Product ,yang akan mengimplementasikan interface dengan keyword implements , lalu mengisi nilai atau value ,dari method  override rasa() dari interface Minuman.