/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales;

/**
 *
 * @author sahir
 */

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of salespeople: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum = 0;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;
        int maxSaleID = -1;
        int minSaleID = -1;

        //Input sales and calculate sum,max,and min
        for (int i = 0; i < sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];
            if (sales[i] > maxSale)
            {
                maxSale = sales[i];
                maxSaleID = i + 1;
            }
            if (sales[i] < minSale)
            {
                minSale = sales[i];
                minSaleID = i + 1;
            }
        }

        //Display sales by salesperson
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
        }

        //Display total sales, average, max, and min
        double averageSale = (double) sum / SALESPEOPLE;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + averageSale);
        System.out.println("Salesperson " + maxSaleID + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + minSaleID + " had the lowest sale with $" + minSale);

        //Get a threshold value and display salespeople who exceeded it
        System.out.print("\nEnter a threshold value: ");
        int threshold = scan.nextInt();
        int countExceeding = 0;

        System.out.println("\nSalespeople exceeding the threshold:");
        for (int i = 0; i < sales.length; i++)
        {
            if (sales[i] > threshold)
            {
                System.out.println("Salesperson " + (i + 1) + " with sales of $" + sales[i]);
                countExceeding++;
            }
        }
        System.out.println("Total number of salespeople exceeding the threshold: " + countExceeding);
    }
}
