package TemplateMethod;
public class TemplateMinuman extends TemplateMethod {

    @Override
    public String getnamamenu1() {
        return "Fruity Lemon Squash";
    }

    @Override
    public String getnamamenu2() {
        return "Honey Citron Iced";
    }

    @Override
    public String getnamamenu3() {
        return "Milk Shake";
    }

    @Override
    public Integer gethargamenu1() {
        return 25000;
    }

    @Override
    public Integer gethargamenu2() {
        return 30000;
    }

    @Override
    public Integer gethargamenu3() {
        return 20000;
    }

    @Override
    public String getmenu() {
        return "Menu Minuman : ";
    }

    @Override
    public String getpilihmenu() {
        return "Pilih Menu Minuman : ";
    }

    @Override
    public Integer getKe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNama() {
        return null;
    }

    @Override
    public Integer getHarga() {
        return null;
    }
    
    
}
