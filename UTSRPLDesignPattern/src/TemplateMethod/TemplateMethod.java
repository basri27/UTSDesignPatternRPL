package TemplateMethod;

import AbstractFactory.*;
import java.util.Scanner;

public abstract class TemplateMethod {
    public final void start(){
        int pilihan, bayar = 0, jmlh;
        Scanner plh = new Scanner(System.in);
        MakananFactory makanan = new MakananFactory();
           
        Makanan mkn1 = makanan.createMakanan("Soto Ayam", 10000, 1);
        Makanan mkn2 = makanan.createMakanan("Sate Ayam", 15000, 2);
        Makanan mkn3 = makanan.createMakanan("Bubur Ayam", 12000, 3);
        
        System.out.println(getmenu());
        System.out.println(mkn1.getKe() + ". " + mkn1.getNama() + " => Rp. " + mkn1.getHarga());
        System.out.println(mkn2.getKe() + ". " + mkn2.getNama() + " => Rp. " + mkn2.getHarga());
        System.out.println(mkn3.getKe() + ". " + mkn3.getNama() + " => Rp. " + mkn3.getHarga());
        
        System.out.print(getpilihmenu());
        pilihan = plh.nextInt();
        System.out.print("Jumlah: ");
        jmlh = plh.nextInt();
        
        
        if(pilihan == mkn1.getKe()){   
            bayar = jmlh * mkn1.getHarga();
        }
        else if(pilihan == mkn2.getKe()){
            bayar = jmlh * mkn2.getHarga();
        }
        else if(pilihan == mkn3.getKe()){
            bayar = jmlh * mkn3.getHarga();
        }
            System.out.println("Jumlah yang harus Anda bayar = Rp. " + bayar);
    }
    public abstract String getnamamenu1();
    public abstract String getnamamenu3();
    public abstract String getnamamenu2();
    public abstract Integer gethargamenu1();
    public abstract Integer gethargamenu2();
    public abstract Integer gethargamenu3();
    public abstract String getmenu();
    public abstract String getpilihmenu();
    public abstract Integer getKe();
    public abstract String getNama();
    public abstract Integer getHarga();
    
}
