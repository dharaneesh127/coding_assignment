public class Random53ProblemAndSolution {
    public static void main(String[] args) {
//        printNumbers();
//        printOddNumbers();
//        multipleOf(5, 10);
//        multipleOfRange(1, 9, 3);
//        calculateSum(1, 5);
        System.out.println(factorialOf(10));
    }


//  #1  Print Numbers from 1 to 10
    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing " + i);
        }
    }

//  #2  Print Odd Numbers Less Than 100
    public static void printOddNumbers() {
        for (int i = 1; i < 100; i++ ){
            if (i % 2 != 0)
                System.out.println("Odd number " + i);
        }
    }

//  #3  Print Multiplication Table with given number and length
    public static void multipleOf(int number, int length) {
        for (int i = 1; i <= length ; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

//  #4  Print All Multiplication Tables with given range and length
    public static void multipleOfRange(int start, int end, int length) {
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

//  #5  Calculate Sum of Numbers from 1 to 10
    public static void calculateSum(int a, int b) {
        int x = 0;
        for (int i = a; i <= b ; i++) {
            x = x + i;
        }
        System.out.println(x);
    }

//    Factorial of the given number using recursion
    public static int  factorialOf(int n) {
        /**
         * let n = 4;
         * return value = 4 * (3 * (2 * 1))
         */
        if (n == 0 || n ==1) return 1;
        return  n * factorialOf(n - 1);
    }


}
