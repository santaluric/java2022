import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj = " Bugün Hava Çok Güzel. ";
        System.out.println(mesaj);

//        System.out.println("Eleman sayısı  :" + mesaj.length());
//        System.out.println("5. eleman : " + mesaj.charAt(4));
//        System.out.println(mesaj.concat("Yaşasın!"));
//        System.out.println(mesaj.startsWith("B"));
//        System.out.println(mesaj.endsWith("."));
//        char[] karakterler = new char[5];
//        mesaj.getChars(0, 5, karakterler, 0);
//        System.out.println(karakterler);
//        System.out.println(mesaj.indexOf("üz"));
//        System.out.println(mesaj.lastIndexOf("a"));
//        // indexof boşlukları karakter olarak saymakta
//        //lastındexof ise boşlukları saymadan rakam vermekte

        // string 2 ders

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));
        //substring kelimeler arasını almaya yarar

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);

        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}