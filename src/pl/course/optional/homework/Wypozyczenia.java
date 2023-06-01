package pl.course.optional.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Wypozyczenia {
    private String rejestracja;
    private String prawoJazdy;

    private LocalDate dataWypozyczenia;

    public static List<Wypozyczenia> listaWypozyczen = new ArrayList<>();

    public Wypozyczenia(){

    };

    public Wypozyczenia(String rejestracja, String prawoJazdy, LocalDate dataWypozyczenia) {
        this.rejestracja = rejestracja;
        this.prawoJazdy = prawoJazdy;
        this.dataWypozyczenia = dataWypozyczenia;
        listaWypozyczen.add(this);

    }



    public static Samochod najczesciejWypoSamo(List<Wypozyczenia> wypoList, List<Samochod> samochodList ) {

        return samochodList.get(0);
    }




    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public String getPrawoJazdy() {
        return prawoJazdy;
    }

    public void setPrawoJazdy(String prawoJazdy) {
        this.prawoJazdy = prawoJazdy;
    }

    public LocalDate getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public void setDataWypozyczenia(LocalDate dataWypozyczenia) {
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public List<Wypozyczenia> getListaWypozyczen() {
        return listaWypozyczen;
    }

    public void setListaWypozyczen(List<Wypozyczenia> listaWypozyczen) {
        this.listaWypozyczen = listaWypozyczen;
    }

    @Override
    public String toString() {
        return "WYPOZYCZENIA{" +
                "rejestracja='" + rejestracja + '\'' +
                ", prawoJazdy='" + prawoJazdy + '\'' +
                ", dataWypozyczenia=" + dataWypozyczenia +
                '}';
    }
}
