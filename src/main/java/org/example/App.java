package org.example;

import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        System.out.print( "How many euros are you exchanging? ");
        int euros = Integer.parseInt(Obj.nextLine());
        System.out.print( "What is the exchange rate? ");
        double rate = Double.parseDouble(Obj.nextLine());

        double dollars = euros*rate;

        System.out.printf("%d euros at an exchange rate of %.4f is\n" +
                "%.2f U.S. dollars.", euros,rate,dollars);
    }
}