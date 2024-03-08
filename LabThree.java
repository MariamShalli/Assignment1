import java.util.Scanner;

public class LabThree {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Input a value of the circle's Radius");
        double Radius= scanner.nextDouble();

        if (Radius<=0){
            System.out.println("Circle does not exist!");
        }
        else {
            double Area= Math.PI * Radius * Radius;
            System.out.println("Area of the Circle is: "+Area);
        }
        scanner.close();


    }
}
