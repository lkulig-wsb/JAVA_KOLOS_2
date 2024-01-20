package Zad4;

public interface Pracownik {

    //Utworzenie dwóch metod abstrakcyjnych.
    void wykonajPrace();
    String pobierzOpis();
}

class Programista implements Pracownik{
    private String jezykProgramowania;

    public Programista (String jezykProgramowania){
        this.jezykProgramowania = jezykProgramowania;
    }
    //Implementacja metod z Interfaceu Pracownik.
    @Override
    public void wykonajPrace(){
        System.out.println("Programista rozpoczął pracę nad nową aplikacją");
    }
    @Override
    public String pobierzOpis(){
        return "Programist pisze w języku " + jezykProgramowania;
    }
}

class ManagerProjektu implements Pracownik{
    private String dzial;

    public ManagerProjektu(String dzial){
        this.dzial=dzial;
    }
    //Implementacja metod z Interfaceu Pracownik.
    @Override
    public void wykonajPrace(){
        System.out.println("Manager Projektu rozpoczął pracę nad nowym projektem");
    }

    @Override
    public String pobierzOpis(){
        return "Menadżer działu zarządza działem " + dzial;
    }

}

 class Application4 {
    public static void main(String[] asrgs){

        //Utworzenie objektów obu klas.
        Pracownik programista = new Programista("JAVA");
       Pracownik managerProjektu = new ManagerProjektu("Rozwój Oprogramowania");

       //Wywołanie metody wykonajPrace() dla każdego pracownika.
       programista.wykonajPrace();
       managerProjektu.wykonajPrace();

       //Wywołanie metody pobierzOpis() która wyświetla opis każdego pracownika.
        System.out.println(programista.pobierzOpis());
        System.out.println(managerProjektu.pobierzOpis());

    }

}
