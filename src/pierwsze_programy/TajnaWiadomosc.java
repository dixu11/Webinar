package pierwsze_programy;

import java.util.Scanner;

public class TajnaWiadomosc {

    // program oczekuje wpisania hasła liczbowego: 9999
    // jeśli wpiszemy poprawne hasło drukuje tajny komunikat : Webinar JAVA
    // jeśli wpiszemy niepoprawne hasło prosi o ponowne wpisanie do skutku

    public static void main(String[] args) {
        System.out.println("Witaj w programie!");
        System.out.println("Jak się nazywasz?");
        Scanner czytnik = new Scanner(System.in);
        String imie = czytnik.nextLine();
        System.out.println("Witaj, " + imie + "!");

        System.out.println("Program przechowuje tajne dane, jest zabezpieczony hasłem liczbowym");
        int haslo = 9999;
        int wprowadzone = 0;
        while (wprowadzone != haslo) {
            System.out.println("Wprowadź hasło 4 cyfrowe");
            wprowadzone = czytnik.nextInt();
            System.out.println("Wprowadzono hasło: " + wprowadzone);
            if(wprowadzone == haslo){
                System.out.println("Hasło poprawne! Otrzymujesz dostęp do systemu");
            }else{
                System.out.println("Hasło błędne... Spróbuj ponownie!");
            }
        }

        System.out.println("Webinar JAVA");

    }


}
