

public class MagicCalculator extends Calculator{

    //Finds the square root of a number
    public static int squareRoot(int num){
        return (int)Math.sqrt(num);
    }

    //Finds the sin of a number
    public static int sin(int num){
        return (int)Math.sin(num);
    }

    //Finds the cosine of a number
    public static int cosine(int num){
        return (int)Math.cos(num);
    }

    //Finds the tangent of a number
    public static int tangent(int num){
        return (int)Math.tan(num);
    }


    //Finds the factorial of the number
    public static int factorial(int num){
        long fact = 1;
        for(int i =2; i<=num; i++){
            fact *= i;
        }
        return (int) fact;

    }

}
