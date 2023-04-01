import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float height;
        float weight;
        System.out.println("...Welcome to BMI Calculator...");
        var scanner = new Scanner(System.in);
        do{
            System.out.println("Please enter your height(m):");
            height = scanner.nextFloat();
            /*System.out.println("\n" + height);*/
        }while(height<=0);
        do{
            System.out.println("Please enter your weight(kg): ");
            weight = scanner.nextFloat();
            /*System.out.print("\n" + weight);*/
        }while(weight<=0);
        var bmi = weight / (height * height);
        System.out.println("\n" + bmi);
        if (bmi <= 18.5) {
            System.out.println("...Weak...");
        } else if (18.5 > bmi && bmi < 25) {
            System.out.println("...Normal...");
        } else if (25 >= bmi && bmi < 30) {
            System.out.println("...Fat...");
        } else if (30 >= bmi && bmi < 35) {
            System.out.println("...1st degree obesity...");
        } else if (35 >= bmi && bmi < 40) {
            System.out.println("...2st degree obesity...");
        } else {
            System.out.println("...3st degree obesity...");
        }
    }
}