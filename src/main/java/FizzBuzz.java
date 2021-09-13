import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
    // “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

    public List<String> fizzBuzzList (int startNumber, int endNumber) {
        List<String> list = new ArrayList<>();

        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
        return list;
    }
}
