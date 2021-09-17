import java.util.ArrayList;
import java.util.List;

public class Fibonachi {

    public static List<Integer> getFibonachi(int num){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        int newElement;
        for (int i = 1; i < num; i++) {
            newElement = list.get(i) + list.get(i-1);
            list.add(newElement);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(getFibonachi(12));
    }
}
