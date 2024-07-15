

import entities.Company;
import entities.Individual;
import entities.Taxpayer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        System.out.println("""

                Confira o enunciado completo no arquivo PDF
                localizado no pacote 'documentação'.
                """);

        ArrayList<Taxpayer> taxpayers = new ArrayList<>();


        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("\nTaxpayer #" + i + " data:");

            char option;

            do {
                System.out.print("Individual or Company (i/c)? ");
                option = sc.next().charAt(0);
            } while (option != 'i' && option != 'c');

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine().trim();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            switch (option) {
                case 'i':
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    taxpayers.add(new Individual(name, annualIncome, healthExpenditures));
                    break;

                case 'c':
                    System.out.print("Number of employees: ");
                    int numEmployees = sc.nextInt();
                    taxpayers.add(new Company(name, annualIncome, numEmployees));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }

        System.out.println("\n\nTAXES PAID:");
        double sum = 0;
        for (Taxpayer taxpayer : taxpayers) {
            sum += taxpayer.calculateTax();
            System.out.printf("%s: $ %.2f\n", taxpayer.getName(), taxpayer.calculateTax());
        }

        System.out.printf("\nTOTAL TAXES: $ %.2f", sum);


        sc.close();
    }
}