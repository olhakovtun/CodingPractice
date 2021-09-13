package JulyPractice;

public class Lesson {

//    public static class Lesson11 {
//        public static void main(String[] args) {
//            //26.
//            String s1 = "QA"; //+
//            String s2 = "For";
//            String s3 = "Everyone";
//            String s4 = s1 + s2 + s3;
//            //27.
//            String string = "QA For Everyone"; //+
//            System.out.println(string + "!");
//            //28.
//            String str = "string"; //+
//            System.out.println(str);
//            //29(a). //Решение правильное, но для цены переменная должна быть всегда double
//            int a = 200;
//            int b = 30;
//            int sale = 15;
//            int a_with_sale = 170;
//            int total = 10 * a_with_sale + 2 * b;
//            System.out.println(total);
//            //29(b). //Решение правильное, но для цены переменная должна быть всегда double
//            int a = 500;
//            int sale = 50;
//            int a_with_sale = 250;
//            int b = 50;
//            int total = 7 * a_with_sale + b;
//            System.out.println(total);
//            //29(v). //Решение правильное, но для цены переменная должна быть всегда double
//            int a = 300;
//            int sale = 10;
//            int b = 20;
//            int a_with_sale = 270;
//            int total = 2 * a_with_sale + 3 * b;
//            System.out.println(total);
//            //30.                                                                  //1. Метод должен быть private
//        public static int(price_a; price_b;sale_for_a;quantity_a;quantity_b) {     //2. У метода должно быть название
//                int price_a_with_sale = (price_a * sale_for_a / 100);              //3. В методе используются переменные, которые почему-то не были созданы
//                int sum = price_a_with_sale * quantity_a + price_b * quantity_b;
//            }
//            //31. //Чтобы совершать математические действия переменные нужно привести к одному типу
//            double d = 2987.1234;
//            int i = 3456;
//            float c = (float) 54.3;
//            System.out.println(d + i + c);
//            //32. //Чтобы совершать математические действия переменные нужно привести к одному типу
//            Byte a = 32;
//            int i = 745764;
//            short s = 10456;
//            System.out.println((a + i + s) / 3);
//            // 33.                            //Вот результат "20Java23.63"
//            int valueInt = 20;                //В принципе всё распечатано но можно добавить пробелы или переходы на новую строку
//            String valueString = "Java";
//            double valueDouble = 23.63;
//            System.out.println(valueInt + valueString + valueDouble);
//            int valueOfJava = ? //Здесь нужно использовать цикл for
//            //34.
//            int a = 50; //Решение правильное, но название переменной int должно быть value
//            //b).
//            double anotherValue = 30.2;
//            //c).
//            double valueToDouble = (double) a;
//            //d).
//            double anotherValue2 = 12.5;//? До этого шага было правильно
//            double sumValue = anotherValue + anotherValue2;
//            double sumValue1 = valueToDouble + anotherValue;
//            System.out.println(sumValue + sumValue1);//В задании не сказано сложить две сыммы
//            //35.
//            System.out.println(test(32000000, (short) (8000 * 4000))); //Приводим переменные к int
//            //36.
//            System.out.println(test1((short) (8000 * 4000) * 8000 * 4000)); //Приводим переменные к chort //Здесь всё вписанo как один параметр, а нужно два
//            //37. +
//            System.out.println(test2("QA For Everyone", "QA For Everyone"));
//            //39.
//            System.out.println(sum(2, 3)); //Call methods to print the sum of value 5 and value 6.2       5 + 6.2 = 11.2
//            System.out.println(sum1(3.2, 3.0)); //Call methods to print the sum of value 5 and value 6.2  5 + 6.2 = 11
//        }
//
//        //35.
//        public static boolean test(int a, short b) {
//            if (a == b) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//
//    //36.
//    public static boolean test1(int aa, short bb) {
//        if (bb == aa) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    //37.
//    public static boolean test2(String str, String str1) {
//        if (str.equals(str1)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    //38.
//    public static void main(String args[]) {
//        double data = 100.235;
//        int value = (int) data;
//        System.out.println(value);
//    }
//
//    //39.
//    public static int sum(int a, int b) { //should be a sum of int and double
//        int sum = a + b;                  //В одном методе приводим к int, в другом к double, а в остальном логика правильная
//        return sum;
//    }
//
//    public static double sum1(double d, double c) {
//        double sum1 = d + c;
//        return sum1;
//    }
//
//    //40.
//    char ch = 'h';
//    int value = (int) ch;
//        System.out.println("ASCII value of "+ch+" = "+value); //System.out.println("ASCII value of " + value);
//                                                              //Распечатывать нужно в методе
//
//    //42.
//    public static int valueOfString(String str) { //Нужно использовать цикл for
//        int i = Integer.parseInt(str);
//        return i;
//    }
}
