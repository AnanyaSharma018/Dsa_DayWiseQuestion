import java.util.Scanner;

class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. cm to m");
        System.out.println("2. kg to g");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length in cm: ");
                double cm = sc.nextDouble();
                System.out.println("Length in m = " + (cm / 100));
                break;

            case 2:
                System.out.print("Enter weight in kg: ");
                double kg = sc.nextDouble();
                System.out.println("Weight in g = " + (kg * 1000));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}