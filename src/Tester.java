/**
 * This class is used to test the calculation
 * @author Alessandro Calabrese
 */
public class Tester {
    public static void main(String[] args) {


        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        int num1 = 10;
        int num2 = 5;
        System.out.println("Sum " + arithmeticOperators.sum(num1, num2));
        System.out.println("Sub " + arithmeticOperators.sub(num1, num2));
        System.out.println("Mul " + arithmeticOperators.mul(num1, num2));
        System.out.println("Div " + arithmeticOperators.div(num1, num2));
    }
}
