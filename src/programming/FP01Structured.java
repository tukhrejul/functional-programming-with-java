package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args)
    {
        printNumbersInListStructured(List.of(2,5,7,8,9,10,6));
        printEvenNumbersInListStructured(List.of(2,5,7,8,9,10,6));
    }

    private static void printNumbersInListStructured(List<Integer> numbers)
    {
        for(int num:numbers)
        {
            System.out.println(num);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers)
    {
        for(int num:numbers)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }
}
