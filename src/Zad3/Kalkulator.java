package Zad3;

import java.util.Scanner;

public class Kalkulator {

    public int dodawanie(int a, int b){
        return a + b;
    }
    public double dodawanie(double a, double b){
        return a + b;
    }
    public int odejmowanie(int a, int b){
        return a - b;
    }
    public double odejmowanie(double a, double b){
        return a - b;
    }
    public int mnozenie(int a, int b){
        return a * b;
    }
    public double mnozenie(double a, double b){
        return a * b;
    }
    public int dzielenie(int a, int b){
        if(b==0){
            System.out.println("Błąd! Nie wolno dzielić przez 0!");
            return 0;
        }else{
            return a/b;
        }
    }
    public double dzielenie(double a, double b){
        if(b==0){
            System.out.println("Błąd! Nie wolno dzielić przez 0!");
            return 0.0;
        }else{
            return a/b;
        }
    }
    public void wyswietlWynik(String dzialanie, int wynik){
        System.out.println("Wynik " + dzialanie + " = " + wynik);
    }

    public void wyswietlWynik(String dzialanie, double wynik){
        System.out.println("Wynik " + dzialanie + " = " + wynik);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Utworzenie obiektu dla Klasy kalkulator.
        Kalkulator k = new Kalkulator();

        //Dodawanie
        System.out.println("Podaj pierwszą liczbę dla dodawania typów int: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę dla dodawania typów int: ");
        int b = scanner.nextInt();
        int wynikDodawaniaInt = k.dodawanie(a,b);
        k.wyswietlWynik("Dodawanie: ",wynikDodawaniaInt);
        //Dodawnie double
        System.out.println("Podaj pierwszą liczbę dla dodawania typów double: ");
        double c = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę dla dodawania typów double: ");
        double d = scanner.nextDouble();
        double wynikDodawaniaDouble = k.dodawanie(c,d);
        k.wyswietlWynik("Dodawanie Double: ",wynikDodawaniaDouble);
        //Odejmowanie int
        System.out.println("Podaj pierwszą liczbę dla odejmowania typów int: ");
        int e = scanner.nextInt();
        System.out.println("Podaj drugą liczbę dla odejmowania typów int: ");
        int f = scanner.nextInt();
        int wynikOdejmowaniaInt = k.odejmowanie(e,f);
        k.wyswietlWynik("Odejmowanie : ",wynikOdejmowaniaInt );
        //Odejmowanie double
        System.out.println("Podaj pierwszą liczbę dla odejmowania typów int: ");
        double g = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę dla odejmowania typów int: ");
        double h = scanner.nextDouble();
        double wynikOdejmowaniaDouble = k.odejmowanie(g,h);
        k.wyswietlWynik("Odejmowanie Double: ",wynikOdejmowaniaDouble);
        //Mnożenie int
        System.out.println("Podaj pierwszą liczbę dla mnozenia typów int: ");
        int i = scanner.nextInt();
        System.out.println("Podaj drugą liczbę dla mnozenia typów int: ");
        int j = scanner.nextInt();
        int wynikMnozeniaInt = k.mnozenie(i,j);
        k.wyswietlWynik("Mnozenie : ",wynikMnozeniaInt);
        //Mnożenie double
        System.out.println("Podaj pierwszą liczbę dla mnozenia typów double: ");
        double x = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę dla mnozenia typów double: ");
        double y = scanner.nextDouble();
        double wynikMnozeniaDouble= k.mnozenie(i,j);
        k.wyswietlWynik("Mnozenie Double : ",wynikMnozeniaDouble);

    }
}
