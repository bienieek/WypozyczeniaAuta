package pl.course.optional.homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Samochod {
    private String rejestracja;
    private String marka;
    private String model;
    private int rokProdukcji;
    private String kolor;
    private int przejechaneKm;

    private static List<Samochod> listaSamochodow = new ArrayList<>();



    public Samochod(String rejestracja, String marka, String model, int rokProdukcji, String kolor, int przejechaneKm) {
        this.rejestracja = rejestracja;
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.kolor = kolor;
        this.przejechaneKm = przejechaneKm;
        listaSamochodow.add(this);
    };

    public Samochod() {

    }

    public List<Samochod> getListaSamochodow() {
        return listaSamochodow;
    }

    public void setListaSamochodow(List<Samochod> listaSamochodow) {
        Samochod.listaSamochodow = listaSamochodow;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPrzejechaneKm() {
        return przejechaneKm;
    }

    public void setPrzejechaneKm(int przejechaneKm) {
        this.przejechaneKm = przejechaneKm;
    }

    @Override
    public String toString() {
        return "SAMOCHOD{" +
                "rejestracja='" + rejestracja + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", kolor='" + kolor + '\'' +
                ", przejechaneKm=" + przejechaneKm +
                '}';
    }
}
