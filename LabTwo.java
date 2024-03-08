import javax.swing.*;
import java.util.Scanner;

public class LabTwo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your first number");
        double num1= scanner.nextDouble();

        System.out.println("Enter your second number");
        double num2= scanner.nextDouble();

        double sum= num1 + num2;
        System.out.println("Sum of "+num1+ " and " +num2+" is: "+sum);

        double difference= num1 - num2;
        System.out.println("Subtraction of "+num1+" and "+num2+" is: "+difference);

        double multiplication= num1 * num2;
        System.out.println("Product of "+num1+" and "+num2+" is: "+multiplication);

        if (num2!=0){
            double division= num1/num2;
            System.out.println("division of "+num1+" and "+num2+" is: "+division);
        }
        else{ System.out.println("You cannot divide by zero");
        }
        scanner.close();
    }

}
