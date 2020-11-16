package FactoryMethod;

public abstract class MinumanFactoryMethod   
{
        public static Minuman getMinuman(String jenisMinum)
        {
            if(jenisMinum.equals(JenisMinuman.MILK_SHAKE)) {
                return new MilkShake(); 
            } 
            else if(jenisMinum.equals(JenisMinuman.FRUITY_LEMON_SQUASH))
            {
                return new FruityLemonSquash();
            }
            else if(jenisMinum.equals(JenisMinuman.HONEY_CITRON_ICED))
            {
                return new HoneyCitronIced();
            }
  
            return null;
        }
}

//MinumanFactory.java adalah Creator untuk menerapkan method dari Concreate Creator yaitu method getMinuman yang digunakan untuk mengambil object dari jenisMinuman , yang mana akan menggunakan interface Product (Minuman).