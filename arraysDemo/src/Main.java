public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Derin";
        String ogrenci3="Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------");

        String[] ogrenciler = new String[5];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Olcay";
        ogrenciler[4]="Harun";
        // 6 cı bir isim eklesem hata vericek arrayındezoutboundsexpetion hatası veriyor buda dongü disi demek

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}