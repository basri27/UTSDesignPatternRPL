package FactoryMethod;

public class HoneyCitronIced implements Minuman
{
    private String namaMinuman = HoneyCitronIced.class.getSimpleName();
    @Override //overriding untuk menjalakan fungsi yang terdapat pada classnya tersendiri
    public void rasa()
    {
        System.out.println( namaMinuman+" : Harga Rp20.000 ");
    }
}

//HoneyCitronIced.java berperan sebagai Concrete Product ,yang akan mengimplementasikan interface dengan keyword implements , lalu mengisi nilai atau value ,dari method  override rasa() dari interface Minuman.
