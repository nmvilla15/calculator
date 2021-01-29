import java.lang.Math;

public class Calculator {

        //add method that takes in two integer numbers and adds them together
        public static int add(int num1, int num2) {
            return num1 + num2;
        }

        //subtraction method that takes in two integers and subtracts them from one another
        public static int subtraction(int num1, int num2) {
            return num1 - num2;
        }

        //multiplication method that takes in two integer numbers and multiplies them together
        public static int multiplication(int num1, int num2) {
            return num1 * num2;
        }

        //division method that takes in two integer numbers and divides them
        public static int division(int num1, int num2) {
            return num1 / num2;
        }

        //square method that takes in one integer and squares it:
        public static int square(int num) {
            return (int) Math.pow(num, 2);
        }
}
