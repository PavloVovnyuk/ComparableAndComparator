import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Pawel", "Vovnyuk", 27));
        list.add(new Person("Vika", "Hreva", 25));
        list.add(new Person("Dana", "Hreva", 25));
        list.add(new Person("Vika", "Hreva", 32));
        list.add(new Person("Vika", "Hreva", 43));
        list.add(new Person("Woiciech", "Ryglovski", 35));
        list.add(new Person("Andrzej", "Rybak", 40));
        list.add(new Person("Tomasz", "Duma", 45));
        list.add(new Person("Tomasz", "Arnold", 45));
        list.add(new Person("Tomasz", "Cytrynka", 45));

       // Collections.sort(list);
        //System.out.println(list);
        Comparator<Person> simpleComparator= Comparator.comparingInt(Person::getAge);
        Comparator<Person> newComp = simpleComparator.reversed();
       // Collections.sort(list, (o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()));
        Collections.sort(list, simpleComparator);
        System.out.println(list);

//Mozna TreeMap
     // TreeSet


        Person[] newArray = new Person[]{
                new Person("Pawel", "Vovnyuk", 27),
                new Person("Vika", "Hreva", 25),
                new Person("Dana", "Hreva", 25),
                new Person("Vika", "Hreva", 32),
                new Person("Vika", "Hreva", 43),
                new Person("Woiciech", "Ryglovski", 35),
                new Person("Andrzej", "Rybak", 40),
                new Person("Tomasz", "Duma", 45),
                new Person("Tomasz", "Arnold", 45),
                new Person("Tomasz", "Cytrynka", 45)

        };
        Arrays.sort(newArray, Comparator.comparingInt(Person::getAge));
        System.out.println(Arrays.toString(newArray));

    }
}
