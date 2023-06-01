package pl.course.optional.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*
        Dane są trzy pliki tekstowe o nazwach: samochody.txt, kierowcy.txt, wypozyczenia.txt.
Zawierają one informacje na temat samochodów, kierowców i wypożyczeń.
W każdym z plików dane w wierszu oddzielone są znakami tabulacji.
Plik o nazwie samochody.txt zawiera informacje na temat samochodów: numer rejestracyjny, markę, model, rok produkcji, kolor, i liczbę przejechanych kilometrów.
Przykład:
KR12345 Ford Focus 2018 Czarny 50000
WA98765 Audi A4 2020 Srebrny 10000
Plik o nazwie kierowcy.txt zawiera dane na temat kierowców: numer prawa jazdy, nazwisko, imię, data urodzenia i numer telefonu.
Przykład:
ABC123 Nowak Jan 1990-01-01 123456789
XYZ987 Kowalski Anna 1985-05-05 987654321
Plik o nazwie wypozyczenia.txt zawiera informacje na temat wypożyczeń samochodów przez kierowców: numer rejestracyjny samochodu, numer prawa jazdy kierowcy oraz datę wypożyczenia.
Przykład:
KR12345 ABC123 2022-01-01
WA98765 XYZ987 2022-02-01
Wykorzystując informacje zawarte w plikach wykonaj następujące polecenia:

znajdź samochód, który był najczęściej wypożyczany
znajdź kierowcę, który najczęściej korzystał z wypożyczeń
jaki kolor samochodów cieszył się największym powodzeniem?
w którym roku było najwięcej wypożyczeń?
wypisz top 5 najstarszych samochodów
zwróć kierowców, którzy wypożyczyli co najmniej 5 różnych samochodów
zwróć samochody exclusive - czyli takie, które były wypożyczone tylko przez jednego kierowcę
         */




        try{
            BufferedReader buf = new BufferedReader(new FileReader("samochody.txt"));
            String line;
            String[] carsArray;
            while(true) {
                line = buf.readLine();
                if(line == null){
                    break;
                } else {
                    carsArray = line.split(" ");

                    String rej = carsArray[0];
                    String marka = carsArray[1];
                    String model = carsArray[2];
                    int rok = Integer.parseInt(carsArray[3]);
                    String kolor = carsArray[4];
                    int km = Integer.parseInt(carsArray[5]);
                    Samochod samochod = new Samochod(rej,marka,model,rok,kolor,km);


                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            BufferedReader buf = new BufferedReader(new FileReader("kierowcy.txt"));
            String line;
            String[] kierowcyArray;

            while(true) {
                line = buf.readLine();
                if (line == null) {
                    break;
                } else {
                    kierowcyArray = line.split(" ");

                    String prawoJazdy = kierowcyArray[0];
                    String nazwisko = kierowcyArray[1];
                    String imie = kierowcyArray[2];
                    LocalDate dataUrodzenia = LocalDate.parse(kierowcyArray[3]);
                    int telefon = Integer.parseInt(kierowcyArray[4]);

                    Kierowca kierowca = new Kierowca(prawoJazdy,nazwisko,imie,dataUrodzenia,telefon);

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader buf = new BufferedReader(new FileReader("wypozyczenia.txt"));
            String line;
            String[] wypoArray;

            while(true) {
                line = buf.readLine();
                if (line == null){
                    break;
                }else {
                    wypoArray = line.split(" ");

                    String rejestracja = wypoArray[0];
                    String prawoJazdy = wypoArray[1];
                    LocalDate dataWypo = LocalDate.parse(wypoArray[2]);

                    Wypozyczenia wypozyczenie = new Wypozyczenia(rejestracja,prawoJazdy,dataWypo);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Wypozyczenia wypozyczenia = new Wypozyczenia();
        Samochod samochod = new Samochod();
        Kierowca kierowca = new Kierowca();
        System.out.println(wypozyczenia.getListaWypozyczen());

        System.out.println(samochod.getListaSamochodow());
        System.out.println(kierowca.getListaKierowcow());
        System.out.println(Wypozyczenia.najczesciejWypoSamo(, samochod.getListaSamochodow()));
        Wypozyczenia.listaWypozyczen

    }

}
