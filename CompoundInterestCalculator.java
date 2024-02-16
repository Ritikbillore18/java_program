import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter number of times interest is compounded per year: ");
        int compoundPeriods = scanner.nextInt();

        double compoundInterest = calculateCompoundInterest(principal, annualRate, years, compoundPeriods);

        System.out.println("Compound Interest after " + years + " years: " + compoundInterest);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principal, double annualRate, int years, int compoundPeriods) {
        double ratePerPeriod = annualRate / (compoundPeriods * 100);
        int totalPeriods = compoundPeriods * years;
        double compoundInterest = principal * Math.pow(1 + ratePerPeriod, totalPeriods) - principal;
        return compoundInterest;
    }
}
