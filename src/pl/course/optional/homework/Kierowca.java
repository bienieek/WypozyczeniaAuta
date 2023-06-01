package pl.course.optional.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Kierowca {
    private String prawoJazdy;
    private String nazwisko;
    private String imie;
    private LocalDate dataUrodzenia;
    private int telefon;
    private static List<Kierowca> listaKierowcow = new ArrayList<>();

    public Kierowca(String prawoJazdy, String nazwisko, String imie, LocalDate dataUrodzenia, int telefon) {
        this.prawoJazdy = prawoJazdy;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.telefon = telefon;
        listaKierowcow.add(this);
    }

    public Kierowca() {

    }


    public String getPrawoJazdy() {
        return prawoJazdy;
    }

    public void setPrawoJazdy(String prawoJazdy) {
        this.prawoJazdy = prawoJazdy;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(LocalDate dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public List<Kierowca> getListaKierowcow() {
        return listaKierowcow;
    }

    public void setListaKierowcow(List<Kierowca> listaKierowcow) {
        this.listaKierowcow = listaKierowcow;
    }

    @Override
    public String toString() {
        return "KIEROWCA{" +
                "prawoJazdy='" + prawoJazdy + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", imie='" + imie + '\'' +
                ", dataUrodzenia=" + dataUrodzenia +
                ", telefon=" + telefon +
                '}';
    }
}
