package print;

public class AscSeqNumbers {

  //  static String commaSpace = ", ";
//
//    public static void numbers() {
//        for (int i = 1; i <= 5; i++) {
//            if (i == 5) {
//                System.out.println(i);
//            } else {
//                System.out.print(i + commaSpace);
//            }
//        }
//    }
//
    public static void main(String[] args) {

  //      String str = ", ";
//
//        System.out.println(1 + str + 2 + str + 3 + str + 4 + str + 5);
//
//        String commaSpace = ", ";
//        for (int i = 1; i < 1001 ; i++) {
//            System.out.print(i + commaSpace);
//        }

//        numbers();

        numbers(5);
    }

    static String str = ", ";
    public static void numbers(int num) {
        for (int i = 1; i < num ; i++) {
            System.out.print(i + str);
        }
        System.out.println(num);
    }

}
