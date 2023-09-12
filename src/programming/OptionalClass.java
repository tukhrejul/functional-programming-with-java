package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClass
{
    public static void main(String[] agrs)
    {
        List<String> fruits = List.of("apple","banana","mango");

        //fruits.stream().filter(fruit->fruit.startsWith("b")).forEach(System.out::println);
        //fruits.stream().filter(fruit->fruit.startsWith("b")).findFirst().orElse(null);

        Predicate<? super String> predicate = fruit-> fruit.startsWith("m");
        Optional<String> fruit = fruits.stream().filter(predicate).findFirst();
        System.out.println(fruit);
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.isPresent());
        System.out.println(fruit.get());
    }
}
