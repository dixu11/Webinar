package pierwsze_programy;

public class ZmienneTrening {
    public static void main(String[] args) {
        int kosztProduktu = 10;
        System.out.println("Produkt kosztuje:"+kosztProduktu+"zł");
        System.out.println("Podwyżka ceny o 100%!");
        kosztProduktu = kosztProduktu * 2;
        System.out.println("Produkt kosztuje: " + kosztProduktu + "zł" );

        System.out.println("Tworzę inne produkty...");
        int kosztProduktu2 = 100;

        System.out.println("Moje produkty kosztują:");
        System.out.println("Pierwszy: " + kosztProduktu);
        System.out.println("Drugi: " + kosztProduktu2);



    }
}
