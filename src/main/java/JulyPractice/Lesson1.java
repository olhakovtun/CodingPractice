package JulyPractice;

public class Lesson1 {

    public static void main(String[] args) {

        //1
        short s = 32767;

        //2
        short ss = -32768;

        //3
        byte b = -128;

        b = 127;

        //4
        int i = 2147483647;

        //5
        int ii = -2147483648;

        //6
        Integer iI = i;

        iI = -2147483648;

        //7
        Byte bb = 10 + 20;

        //8
        Short sss = 8000 * 4;

        //9
        short ssss = (short) (8000 * 4000);

        //10
        int iiii = 8000 * 4000;

        //11
        long number = 2200000001L;

        //12
        long number1 = -2200000000L;

        //13
        final double PI = 3.14;

        //14
        final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъэюя";

        //15
        final long NUMBERS = 9876543210L;

        //16
        final float E = 2.718F;

        //17
        char c = 'a';

        //18
        final char CC = 'а';

        //19
        System.out.println(c);
        System.out.println(CC);

        //20
        char char25 = 'a' + 25;
        System.out.println(char25);

        //21
        char char31 = 'а' + 31;
        System.out.println(char31);

        //22
        System.out.println("++++++");
        System.out.println("@@@@@@");
        System.out.println("******");
        System.out.println("######");

        //23
//        public class Main {
//            public static void main(String[] args) {
//                Integer i = 2;
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//                short s = (short) 33000;
//            }
//        }
//        public class Main {
//            public static void main(String[] args) {
//            double doub = 64000;
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//                char i = '2';
//            }
//        }

        //24
//        public class Main {
//            public static void main(String[] args) {
//                int i = 2;
//                boolean b = true;
//                String s = "string";
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//                char ch = 'c';
//                char c = '2';
//                String s = "s";
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//                int c = 10;
//                c = 100;
//                System.out.println(c);
//            }
//        }

        //25
//        public class Main {
//            public static void main(String[] args) {
//                int i = (int) 120.12;
//            }
//        }

//        public class Main {
//            public static void main(String[] args) {
//                int i = (int) 'c';
//            }
//        }

        //26
        String s1 = "QA";
        String s2 = "For";
        String s3 = "Everyone";
        String s4 = s1 + s2 + s3;

        //27
        String string = "QA For Everyone!";
        System.out.println(string);

        //28
        String str = "string";
        System.out.println(str);

        //29
        double itemAPrice = 200;
        double itemADiscount = 15;
        double discountedPriseItemA = itemAPrice - itemAPrice * itemADiscount / 100;

        double itemBPrice = 30;

        double itemACount = 10;
        double itemBCount = 2;

        double totalPrice = discountedPriseItemA * itemACount + itemBPrice * itemBCount;

        System.out.println(totalPrice);

        //30
        System.out.println(totalPriceCount(200, 30, 15, 10, 2));
        System.out.println(totalPriceCount(500, 50, 50, 7, 1));
        System.out.println(totalPriceCount(300, 20, 10, 2, 3));

        //31
        double d = 2987.1234;

        int n = 3456;
        double z = (double) n;

        float m = 54.3F;
        double y = (double) m;

        System.out.println(d + z + y);

        //32
        Byte k = 32;
        int one = k.intValue();

        int two = 745764;

        short f = 10456;
        int three = (int) f;

        System.out.println((one + two + three) / 3);

        //33
        int valueInt = 20;
        String valueString = "Java";
        double valueDouble = 23.63;

        System.out.println(valueInt);
        System.out.println(valueString);
        System.out.println(valueDouble);

        int valueOfJava = 0;
        for (int j = 0; j < valueString.length(); j++) {
            valueOfJava++;
        }
        System.out.println("The value of Java = " + valueOfJava);

        //34
        int value = 50;
        double anotherValue = 30.2;
        double valueToDouble = (double) value;

        double sumValue = value + anotherValue;
        double sumValue1 = valueToDouble + anotherValue;

        System.out.println(sumValue);
        System.out.println(sumValue1);

        //35
        System.out.println(isComparisonInt(iiii, ssss));

        //36
        System.out.println(isComparisonShort(iiii, ssss));

        //37
        isStringComparison(s4, string);

        //38
        double valueOfDouble = 100.235;
        int valueOfInt = (int) valueOfDouble;

        //39
        int q = 5;
        double w = 6.2;

        System.out.println(sumOfIntegerVariable(q, w));
        System.out.println(sumOfDoubleVariable(q, w));

        //40
        char v = 'h';
        int ascii = v;
        int castAscii = (int) v;

        System.out.println(castAscii);

        //41
        char j = 'd';
        int asciiValue = j;
        int castAsciiValue = (int) j;
        System.out.println(castAsciiValue + 4);

        //42
        numericValueOfString("Java");
        numericValueOfString("QAForEveryone");

        //43
        int[] asciiCode = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33};

        System.out.println(arrayOfIntegers(asciiCode));

    }

    //30 method
    private static double totalPriceCount(double itemAPrice, double itemBPrice, int itemADiscount, int itemACount, int itemBCount) {
        double totalPrice;
        totalPrice = (itemAPrice - itemAPrice * itemADiscount / 100) * itemACount + itemBPrice * itemBCount;
        return totalPrice;
    }

    //35 method
    private static boolean isComparisonInt(int iiii, short ssss) {
        int sssss = (int) ssss;
        if (iiii == sssss) {
        } else {
            return false;
        }
        return true;
    }

    //36 method
    private static boolean isComparisonShort(int iiii, short ssss) {
        short iiiii = (short) iiii;
        if (iiiii == ssss) {
        } else {
            return false;
        }
        return true;
    }

    //37 method
    private static boolean isStringComparison(String s4, String string) {
        if (s4 == string) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return true;
    }

    //39 method
    //1
    private static int sumOfIntegerVariable(int q, double w) {
        int sum = 0;
        sum = q + (int) w;
        return sum;
    }

    //2
    private static double sumOfDoubleVariable(int q, double w) {
        double sum = 0;
        sum = (double) q + w;
        return sum;
    }

    //42 method
    private static int numericValueOfString(String string) {
        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            result++;
        }
        System.out.println(result);
        return result;
    }

    //43
    private static String arrayOfIntegers(int[] asciiCode) {
        String result = "";
        for (int i = 0; i < asciiCode.length; i++) {
            result += Character.toString((char) asciiCode[i]);
        }
        return result;
    }
}