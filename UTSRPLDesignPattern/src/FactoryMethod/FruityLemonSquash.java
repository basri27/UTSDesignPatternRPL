package FactoryMethod;

public class FruityLemonSquash implements Minuman
{
    private String namaMinuman = FruityLemonSquash.class.getSimpleName();
    @Override //overriding untuk menjalakan fungsi yang terdapat pada classnya tersendiri
    public void rasa()
    {
        System.out.println(namaMinuman+" : Harga Rp25.000 ");
    }
}

////FruityLemonSquash.java berperan sebagai Concrete Product ,yang akan mengimplementasikan interface dengan keyword implements , lalu mengisi nilai atau value ,dari method  override rasa() dari interface Minuman.