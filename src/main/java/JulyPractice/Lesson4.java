package JulyPractice;

public class Lesson4 {

    public static void main(String[] args) {
        //1
        int a = 3333;
        int b = 9999;

        System.out.println(biggerIntValue(a, b));

        //2
        int v = 555;
        //int v = -555;

        System.out.println(isNumberAboveZero(v));

        //3 a)
//        public static void main(String[] args) {
//            int i = 40;
//            if (i > 0 && i < 100) {
//                System.out.println("0 < значение i < 100");
//            }
//        }

       // b)
//        public static void main(String[] args) {
//            int a = 40;
//            if (a > 0 || a < 100) {
//                System.out.println("a > 0 OR a < 100");
//            }
//        }

        //4
        int number = 7777 > 100 ? 100 : 700;

        System.out.println(number);

        //5
        String aa = 357 < 0 ? "a < 0" : "a >= 0";

        System.out.println(aa);

        //6
        int с = 10;
        int d = c > 0 ? (c < 100 ? 1 : 0) : -1;

        //7
        String str = "A";

        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }

        //8
//        public class Main {
//            public static void main(String[] args) {
//                int num = 77;
//                if (num == 88) {
//                    System.out.println("num > 12” AND “num < 93");
//                }
//            }
//        }

        //9
//        public class Main {
//            public static void main(String[] args) {
//                int a = 1;
//                int c = a > 0 ?  1 : (-1 + a);
//            }
//        }

        //10
        int k = 10;
        switch (k) {
            case  10:
                System.out.println(10);
                break;
            case  11:
                System.out.println(11);
                break;
            case  12:
                System.out.println(12);
                break;
            default:
                System.out.println("Error");
        }

        //11
        System.out.println((double)100 / 3);
        System.out.println((float)(100 * 0.33));
        System.out.println((float)100 / 3);
        System.out.println((double)(100 / 3));

        //12
        isLetterVowel("j");

        isLetterVowelSwich("j");

        //13
        isYearLeap(1111);
        isYearLeap(1600);
        isYearLeap(1800);
        isYearLeap(2000);
        isYearLeap(2020);
        isYearLeap(22600);
        isYearLeap(30000);

        //14
        System.out.println(comparingNumbers(3, 2));

        //15
//        int age = 30;
//        if (age > 18) {
//            driveCar();
//        } else {
//            doNotDrive();
//        }
//        int age = 25;
//        int canDrive = age > 18 ? driveCar() : doNotDrive();

//        int age = 20;
//        switch (age) {
//            case (age > 18):
//               driveCar();
//            default:
//                doNotDrive();
//        }

        //17
        int m = 20;

        if (m % 3 == 0 && m % 5 == 0) {
            System.out.println("Good Number");
        } else if (m % 3 == 0 && m % 5 != 0) {
            System.out.println("Bad Number");
        } else if (m % 3 != 0 && m % 5 == 0) {
            System.out.println("Poor Number");
        } else {
            System.out.println("-1");
        }

        //18
        int x = 2;
        int y = 5;
        int z = 0;




    }

    //1 method
    private static int biggerIntValue(int a, int b) {
        int result = 0;
        if (a > b) {
            return a;
        } else if (a < b) {
            return b;
        }
        return result;
    }

    //2 method
    private static boolean isNumberAboveZero(int z) {
        if (z > 0) {
            return true;
        } else
        return false;
    }

    //12 method
    private static boolean isLetterVowel(String letter) {
        if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
            System.out.println("Letter " + letter + " is vowel");
            return true;
        }
        System.out.println("Letter " + letter + " is consonant");
        return false;
    }

    private static boolean isLetterVowelSwich(String letter) {
        System.out.println(
                "Letter " + letter + (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")
                        ? " is vowel"
                        : " is consonant"));
    return false;
    }

    //13
    private static boolean isYearLeap(int year) {
        if (year < 30000) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
                return true;
            } else {
                System.out.println(year + " is not a leap year");
            }
            return true;
        }
        System.out.println("Wrong parameter");
        return false;
    }

    //14
    private static int comparingNumbers(int m, int n) {
        int number = 0;
        if (m == n) {
            return 0;
        } else if (m < n) {
            return -1;
        } else if (m > n) {
            return 1;
        }
        return number;
    }

//    private static int isComparingNumbersSwitch(int p, int r) {
//
//        int comparing = 0;
//        switch (comparing) {
//            case (p == r):
//                System.out.println(0);
//            case (p < r):
//                System.out.println(-1);
//            case (p > r):
//                System.out.println(1);
//
//        }
//    }

    //15
    private static void driveCar() {
            System.out.println("Drive a car");
    }

    private static void doNotDrive() {
            System.out.println("Do not drive");
    }

    //16 methods
    private static int add(int y, int u) {
        int sum = y + u;
        return sum;
    }

    private static int multiply(int y, int u) {
        int result = y * u;
        return result;
    }

    //18
    //private static int expressions(int x, int y, int z) {

  //  }



}
