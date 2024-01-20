package Zad2;

import java.util.ArrayList;
import java.util.List;

abstract class Osoba{
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getImie(){return imie;}
    public String getNazwisko(){return nazwisko;}

    public abstract void wyswietlInfo();

}

class Student extends Osoba{
    private int numerIndeksu;
    private int rok;

    public Student(String imie, String nazwisko, int numerIndeksu, int rok){
        super(imie, nazwisko);
        this.numerIndeksu=numerIndeksu;
        this.rok=rok;
    }

    public int getNumerIndeksu(){return numerIndeksu;}
    public int getRok(){return rok;}

    @Override
    public void wyswietlInfo(){
        System.out.println("Student: " + getImie() + " " + getNazwisko()+ ", Numer Indeksu: "+
                getNumerIndeksu() + ", Rok: " + getRok());
    }

}

abstract class Grupa {
    private String nazwa;
    private List<Student> listaStudentow;

    public Grupa(String nazwa){
        this.nazwa=nazwa;
        this.listaStudentow = new ArrayList<>();
    }

    public String getNazwa(){
        return nazwa;
    }

    public void dodanieStudenta(Student s){
        listaStudentow.add(s);
    }

    public void wyswietlStud(){
        System.out.println("Studenci w grupie " + getNazwa() + ":");
        for(Student s : listaStudentow){
            s.wyswietlInfo();
        }
    }
    public abstract void infoOGrupie();
}

class GrupaPsychologow extends Grupa{
    public GrupaPsychologow(String nazwa){
        super(nazwa);
    }

    @Override
    public void infoOGrupie(){
        System.out.println("Jestem grupą psychologów.");
    }
}

class GrupaInformatyka extends Grupa{

    public GrupaInformatyka(String nazwa){
        super(nazwa);
    }

    @Override
    public void infoOGrupie(){
        System.out.println("Jestem grupą informatyków.");
    }

}
public class Application2 {

    public static void main(String[] args){

       GrupaInformatyka gi = new GrupaInformatyka("Informatycy");
       GrupaPsychologow gp = new GrupaPsychologow("Psychologowie");

       Student s1 = new Student("Lukasz","Klimczak",1234,2);
       Student s2 = new Student("Maria","Wójcik",3456,3);
       Student s3 = new Student("Tomasz","Pazdan", 3342, 1);
       Student s4 = new Student("Marcin","Bratkowski", 5564,1);


       gi.dodanieStudenta(s1);
       gp.dodanieStudenta(s2);
        gi.dodanieStudenta(s3);
        gi.dodanieStudenta(s4);


       gi.wyswietlStud();
        System.out.println();
       gp.wyswietlStud();

        System.out.println();
       gi.infoOGrupie();
       gp.infoOGrupie();

    }




}
