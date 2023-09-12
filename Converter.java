import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency rate");
        double currency = sc.nextDouble();
        System.out.println("Enter amout of money");
        int hryvna = sc.nextInt();
        int amount = ((int) (hryvna / currency));
        double change = hryvna / currency - amount;
        System.out.println("You can byu " + amount);
        if (change != 0) {
            System.out.printf("You rest of money is %.2f", change);
            System.out.println();
        }
    }
}
