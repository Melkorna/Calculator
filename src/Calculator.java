import java.util.Scanner;
public class Calculator {
    public static void main (String [] args){
        Scanner simpleCalculator = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Wtrite the firt num:");
        num1=simpleCalculator.nextDouble();

        System.out.println("Write the second num:");
        num2 = simpleCalculator.nextDouble();

        result=num1+num2;
        System.out.println("addition is:" + result);

        result=num1-num2;
        System.out.println("subtracyion is :"+result);
    }
}