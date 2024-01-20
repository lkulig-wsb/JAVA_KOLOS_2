package Zad1;

import java.util.ArrayList;
import java.util.List;

abstract class Produkt{
    private String nazwa;
    private String typ;
    private double cena;

    public Produkt(String nazwa , String typ, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
        this.typ = typ;
    }
    public String getNazwa(){
        return nazwa;
    }
    public String getTyp(){
        return typ;
    }
    public double getCena(){
        return cena;
    }
    public abstract void wyswietlInfo();

}

interface KategoriaProduktu{
    String getKategoria();
}

class Hardware extends Produkt implements KategoriaProduktu{
    private String producent;

    public Hardware (String nazwa, double cena, String typ, String producent){
        super(nazwa, typ, cena);
        this.producent=producent;
    }
    public String getProducent(){
        return producent;
    }

@Override
    public void wyswietlInfo(){
    System.out.println("Sprzęt: " + getNazwa() + ", Typ: " + getTyp() +
            ", Producent: " + getProducent() + ", Cena: " + getCena() + "PLN" );
}

@Override
    public String getKategoria(){
        return "Hardware";
}
}

class Software extends Produkt implements KategoriaProduktu{
    private String gatunek;
    private String nosnik;

    public Software(String nazwa, double cena, String typ, String gatunek, String nosnik){
        super(nazwa, typ, cena);
        this.gatunek = gatunek;
        this.nosnik = nosnik;
    }

    public String getGatunek(){
        return gatunek;
    }
    public String getNosnik(){
        return nosnik;
    }

    @Override
    public void wyswietlInfo(){
        System.out.println("Soft: " + getNazwa() + ", Typ: " + getTyp() +
                ", Gatunek: " + getGatunek() + ", Nośnik: " + getNosnik() + ", Cena: " + getCena() + "PLN" );
    }

    @Override
    public String getKategoria(){
        return "Software";
    }

}

class Magazyn{

    private List<Produkt> katalogProduktow = new ArrayList<>();
    //Funkcja dodająca produkt do listy.

    public void dodajProdukt(Produkt p){
        katalogProduktow.add(p);
    }

    //Metoda do wyświetlania wszystkich produktów z listy

    public void wyswietlProdukty(){
        System.out.println("Lista Produktów");
        System.out.println("---------------");

        for(Produkt p : katalogProduktow){
            p.wyswietlInfo();
        }

    }
}

public class Application1 {
    public static void main(String[] args){

        //Utworzenie obiektu klasy Magazyn.
        Magazyn mag = new Magazyn();

        //Dodanie kilku objektów (produktów) różnych klas.
        Hardware pc = new Hardware("Tower 500",5600.50, "PC", "Lenovo");
        Software game = new Software("Heroes 3", 120.0, "gra","RPG","CD");
        Software application = new Software("Adobe Illustrator",350.0,"program graficzny","soft","cyfrowy");
        Hardware laptop = new Hardware("ThinkPad X13",3400.0,"laptop", "Lenovo");
        Hardware smartphone = new Hardware("S21", 3200.0,"smartphone","Samsung");

        //Dodanie produktów(objektów) do Magazynu.
        mag.dodajProdukt(pc);
        mag.dodajProdukt(game);
        mag.dodajProdukt(application);
        mag.dodajProdukt(laptop);
        mag.dodajProdukt(smartphone);
        //Wyświetlenie listy produktów.

        mag.wyswietlProdukty();


    }
}
