public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
//        int c = 4;
//        long d = 8L;
//        float e = 1.0f;
//        double f = 1.0d;
//        char g = 'a';
//        boolean bool = true;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);
//        System.out.println(bool);
//        if(a>10 & b>5) {
//
//        }else{
//
//        }
//        for (int i = 0; i < 10; i ++) {
//            System.out.println(i);
//        }
        printResult(sum(1, 2));
    }
        public static int sum (int a, int b) {
                return a+b;
        }
        public static void printResult(int c) {
            System.out.println("result = " + c);
        }
    }
