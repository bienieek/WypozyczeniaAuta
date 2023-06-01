package pl.course.optional.architektura.model;

import java.util.*;

public class Person implements Comparable<Person> {
    private String imie;
    private String nazwisko;
    private int pensja;
    //ekstensja

    public Person(String imie, String nazwisko, int pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }


    //sort
    public static List<Person> sort(List<Person> people) {
        return Optional.ofNullable(people)
                .orElseGet(Collections::emptyList)
                .stream()
                .sorted()
                .toList();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pensja=" + pensja +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pensja == person.pensja && Objects.equals(imie, person.imie) && Objects.equals(nazwisko, person.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, pensja);
    }

    @Override
    public int compareTo(Person o) {
        /*
        >0
        0
        <0
         */
        int diff = getImie().compareTo(o.getImie());
        if (diff == 0) {
            diff = getNazwisko().compareTo(o.getNazwisko());
            if (diff == 0) {
                diff = getPensja() - o.getPensja();
            }
        }
        return diff;
    }

}
