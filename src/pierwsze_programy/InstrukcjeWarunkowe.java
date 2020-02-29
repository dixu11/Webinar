package pierwsze_programy;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        int liczba1 = 200;
        int liczba2 = -200;
        int wynik = liczba1 + liczba2;
        System.out.println("Wynik to: " + wynik);

        if(wynik > 0){
            System.out.println("Liczba: " + wynik + " jest dodatnia!");
        }else if(wynik == 0){
            System.out.println("Liczba: " + wynik + " wynosi zero!");
        } else{
            System.out.println("Liczba: " + wynik + " jest ujemna!");
        }



    }
}
