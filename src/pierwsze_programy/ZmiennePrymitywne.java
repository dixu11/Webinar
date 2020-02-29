package pierwsze_programy;

public class ZmiennePrymitywne {
    public static void main(String[] args) {
        //LICZBY CALKOWITE
        byte mojByte = 127; // 1 bajt
        short mojShort = 32000; // 2 bajty
        int mojInt = -1045346543; // 4 bajty
        long mojLong = 2345634523456234234L; // 8 bajtów

        System.out.println("Ze zmiennej byte: " + mojByte);
        System.out.println("Ze zmiennej short: " + mojShort);
        System.out.println("Ze zmiennej int: " + mojInt);
        System.out.println("Ze zmiennej long: " + mojLong);

        //LICZBY ZMIENNOPRZECINKOWE
        float mojFloat = 12345.345F; //4 bajty
        double mojDouble = 3425.546; // 8 bajtów

        //DLA SYMBOLI
        char mojChar = 'a'; // 2 bajty

        //DLA WARTOSCI LOGICZNYCH
        boolean mojBoolean = true;  // 1 bajt
        boolean mojBoolean2 = false;


        int suma = mojByte + mojShort;
        System.out.println(suma);

        boolean dodatnia = mojInt > 0;
        System.out.println(dodatnia);


        String adres = "Wojska Polskiego 20/3";
        System.out.println("Mieszkam przy ulicy " + adres);
    }
}
