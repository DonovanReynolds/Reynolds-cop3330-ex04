package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 4 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun:");
        String noun = input.nextLine();
        System.out.println("Enter a verb:");
        String verb = input.nextLine();
        System.out.println("Enter an adjective");
        String adjective = input.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = input.nextLine();

        String output = String.format("Do you walk your %s %s %s %s? That is so funny!" ,verb,adjective,noun,adverb);
        System.out.println(output);

    }
}
