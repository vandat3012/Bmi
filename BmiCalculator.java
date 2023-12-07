import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter weight (kg) ");
        double weight = scanner.nextDouble();
        System.out.println("enter height (meter)");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25)
            System.out.printf("%-20.2f%s", bmi, "normal");
        else if (bmi < 30)
            System.out.printf("%-20.2f%s", bmi, "overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "obese");
    }
}
