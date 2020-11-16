package TemplateMethod;

import AbstractFactory.*;

public class TemplateMakanan extends TemplateMethod {
    Makanan makan = new Makanan();
    
    @Override
    public String getNama() {
        return makan.getNama();
    }

    @Override
    public Integer getHarga() {
        return makan.getHarga();
    }

    @Override
    public String getmenu() {
        return "Menu Makanan : ";
    }

    @Override
    public String getpilihmenu() {
        return "Pilih Menu Makanan : ";
    }

    @Override
    public Integer getKe() {
        return makan.getKe();
    }

    @Override
    public String getnamamenu1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getnamamenu3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getnamamenu2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer gethargamenu1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer gethargamenu2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer gethargamenu3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
