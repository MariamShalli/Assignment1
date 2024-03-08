import java.sql.Struct;
import java.util.Scanner;

public class LabFour {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("How many minutes do you want to convert to seconds?");
        double Minutes= scanner.nextDouble();

        if (Minutes<0){
            System.out.println("Negative time does not exist!");
        }
        else {

            double Seconds = Minutes * 60;
            System.out.println("You have " + Seconds + " seconds");
        }

        scanner.close();
    }
}
