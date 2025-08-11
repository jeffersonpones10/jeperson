package Activity;

import java.util.Scanner;

public class EmployeeWageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        float hrrate, grsswage, ssscon, ntwage;
        int hrworked;

        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter hourly rate: ");
        hrrate = input.nextFloat();

        System.out.print("Enter total hours worked this week: ");
        hrworked = input.nextInt();

        grsswage = hrrate * hrworked;
        ssscon = (float) (grsswage * 0.10);  // 10% SSS contribution
        ntwage = grsswage - ssscon;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + name);
        System.out.printf("Hourly Rate: ₱%.2f\n", hrrate);
        System.out.println("Hours Worked: " + hrworked);
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", grsswage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", ssscon);
        System.out.println("------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", ntwage);

        input.close();
    }
}