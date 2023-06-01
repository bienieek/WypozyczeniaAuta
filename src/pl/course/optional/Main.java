package pl.course.optional;

import pl.course.optional.architektura.model.Person;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*
        Optional - takie pudleko ktore moze miec wart
        osc ale nie musi
         */

        System.out.println(avg(10));
        System.out.println(avg(4, 3, 32, 3, 1));
        System.out.println(avg());


        System.out.println(avgOpt(54, 4, 23, 32, 3));
        System.out.println(avgOpt());

        Optional<Double> aDouble = avgOpt(5, 41, 1, 23, 123, 4);
        Optional<Double> emptyDouble = avgOpt();

        if (aDouble.isPresent()) {
            System.out.println(aDouble.get() + 42342);
        }

        String imie = null;

        Optional<String> optImie = imie == null ? Optional.empty() : Optional.of(imie);

        Optional<String> ofNullable = Optional.ofNullable(imie);


        Double value = 2.0;

        Optional<Double> valueOpt = Optional.ofNullable(value);

        Double orElse = valueOpt.orElse(0.0);
        Double orElseGet = valueOpt.orElseGet(Math::random);
        //Double orElseThrow = valueOpt.orElseThrow(() -> new NoSuchElementException("Nie ma double"));

        System.out.println(orElse);
        System.out.println(orElseGet);
        //System.out.println(orElseThrow);

        ///

        //var myValue1 = valueOpt.orElse(getFromFile());
        var myValue2 = valueOpt.orElseGet(Main::getFromFile);

        //System.out.println(myValue1);
        System.out.println("Value:" + myValue2);

        Person p1 = new Person("A","B",1231343);
        Person p2 = new Person("A","B",1232131313);
        Person p3 = new Person("A","B",1231321);

        System.out.println(Person.sort(List.of(p1, p2, p3)));

        System.out.println(p1.hashCode());
    }

    public static double getFromFile() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 0.0;
    }

    public static double avg(double... scores) {//vargs
        double suma = 0;
        for (double score : scores) {
            suma += score;
        }
        return suma;
    }

    public static Optional<Double> avgOpt(double... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        double suma = 0;
        for (double score : scores) {
            suma += score;
        }
        return Optional.of(suma / scores.length);
    }
}