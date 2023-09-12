package programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FP02Functional {

    public static void main(String[] args)
    {
        List<Person> people = new ArrayList<Person>();
        people.add(new Person(1, "Inam", 36));
        people.add(new Person(2, "Shamim", 37));
        people.add(new Person(3, "Inam3", 38));
        people.add(new Person(4, "Inam4", 39));
        people.add(new Person(5, "Inam5", 35));
        people.add(new Person(6, "Inam6", 35));
        people.add(new Person(7, "Inam7", 33));
        people.add(new Person(8, "Inam8", 32));
        people.add(new Person(9, "Inam9", 30));
        people.add(new Person(10, "Inam10", 34));
        people.add(new Person(11, "Inam11", 35));

        List<Person> result = people.stream()
                .filter(p -> p.getAge() == 34 && p.getName().startsWith("I")).toList();
        for (Person person: result)
        {
            System.out.println(person);
        }
    }
}
