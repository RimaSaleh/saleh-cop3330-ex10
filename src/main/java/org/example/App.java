/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initialize the int and doubles for items and result totals
        int first_item, second_item, third_item;
        double tax, total, subtotal;

        //print statement asking for price of item 1 to be inputted
        System.out.println( "Enter the price of item 1: " );
        //number will be inputted and stored as "price_1"
        int price_1 = scanner.nextInt();

        //print statement asking for quantity of item 1 to be inputted
        System.out.println( "Enter the quantity of item 1: " );
        //number will be inputted and stored as "quantity_1"
        int quantity_1 = scanner.nextInt();

        //print statement asking for price of item 2 to be inputted
        System.out.println( "Enter the price of item 2: " );
        //number will be inputted and stored as "price_2"
        int price_2 = scanner.nextInt();

        //print statement asking for quantity of item 2 to be inputted
        System.out.println( "Enter the quantity of item 2: " );
        //number will be inputted and stored as "quantity_2"
        int quantity_2 = scanner.nextInt();

        //print statement asking for price of item 3 to be inputted
        System.out.println( "Enter the price of item 3: " );
        //number will be inputted and stored as "price_3"
        int price_3 = scanner.nextInt();

        //print statement asking for quantity of item 3 to be inputted
        System.out.println( "Enter the quantity of item 3: " );
        //number will be inputted and stored as "quantity_3"
        int quantity_3 = scanner.nextInt();

        //calculating total prices for each item
        first_item = price_1 * quantity_1;
        second_item = price_2 * quantity_2;
        third_item = price_3 * quantity_3;

        //calculating subtotal, tax, and totals
        subtotal = first_item + second_item + third_item;
        tax = 5.5 * subtotal / 100;
        total = subtotal + tax;

        //output for subtotal, tax, and total
        System.out.format( "Subtotal: $%.2f \n", subtotal );
        System.out.format( "Tax: $%.2f \n", tax );
        System.out.format( "Total: $%.2f \n", total );
    }
}