import TemplateMethod.*;

public class Main {
    public static void main(String[] args) {
        
        TemplateMakanan makanan = new TemplateMakanan();
        makanan.start();
        
        TemplateMinuman minuman = new TemplateMinuman();
        minuman.start();
    }
    
}