package programming;

import java.util.Comparator;
import java.util.List;

public class FP01Functional {

    public static void main(String[] args)
    {
        //printNumbersInListFunction(List.of(2,5,7,8,9,10,6));
        //printEvenNumbersInListFunction(List.of(2,5,7,8,9,10,6));
        printSquareEvenNumbersInListFunction(List.of(2,5,7,8,9,10,6));
    }

    private static void print(int number)
    {
        System.out.println(number);
    }

    private static boolean isEven(int num)
    {
        return num%2==0;
    }
    private static void printNumbersInListFunction(List<Integer> numbers)
    {
        //numbers.stream().forEach(FP01Functional::print);
        //System.out.println("Sorted List:");
        //numbers.stream().sorted().forEach(FP01Functional::print);
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunction(List<Integer> numbers)
    {
        //numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
        //numbers.stream().filter(n->n%2==0).forEach(System.out::println);
        numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
    }

    private static void printSquareEvenNumbersInListFunction(List<Integer> numbers)
    {
        numbers.stream().filter(n->n%2==0).map(n->n*n).forEach(n->System.out.println(n));
    }
}
