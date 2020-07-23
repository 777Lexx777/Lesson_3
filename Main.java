package Lesson_3;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 9;
        random.nextInt(max -1);

                System.out.println("A Game:'Guess the number'");
                System.out.println("You have three attempts.");
                System.out.println("Guess the number from 0 to " + max);
                int enteredNamber = getNumberFromScanner(min, max);
                //string = sc.nextLine();
                System.out.println("==================================================");
                System.out.println("Your number " + enteredNamber + " is in the specified range  from 0 to " + max);
                System.out.println("==================================================");
                int namberRandom = random.nextInt(2);
                namberComparison(enteredNamber, namberRandom,  min, max);
    }

                public static int getNumberFromScanner( int min, int max) {
                    int y;
                    do {
                        y = sc.nextInt();
                        while (y < min || y > max) {
                            System.out.println("You are out of range");
                            System.out.println("Enter the number from 0 to " + max);
                            y = sc.nextInt();
                        }
                    } while (y < min || y > max);
                    return y;
                }
                static void namberComparison(int enteredNamber, int namberRandom, int min, int max) {
                    Random random = new Random();
                    int m;
                    int y;
                    int z = 3;
                    int i = 0;
                         while (enteredNamber == namberRandom) {
                             System.out.println("\nYou Guessed !!!!!");
                             if (enteredNamber == namberRandom) { System.out.println("The hidden number is " + namberRandom + " ."); }
                             System.out.println("Do you want to play more? If yes - press 1. If no - press 2");
                             m = sc.nextInt();
                             if (m == 2) { System.out.println("\nLuccky another time!");break;}
                             if (m == 1) {
                                 System.out.println("Enter the number from 0 to " + max);
                                 y = sc.nextInt();
                                 while (y < min || y > max) {
                                     System.out.println("\nYou are out of range,");
                                     System.out.println("Enter the number from 0 to " + max);
                                     y = sc.nextInt();
                                     System.out.println("===================");
                                 }
                                 z += 4;
                                 enteredNamber = y;

                             }
                                 if (m == 1) {namberRandom = random.nextInt(max -1);}
                         }
                             for (z = 3; z > 1; z--) {
                                 if (enteredNamber != namberRandom) {
                                     System.out.println("\n===================");
                                     System.out.println("You didn't guess((...");
                                     if (enteredNamber > namberRandom) { System.out.println("Your number is more mysterious"); }
                                     if (enteredNamber < namberRandom) { System.out.println("Your number is less then mysterious"); }
                                     System.out.println("Try agaaiiiin...;)");
                                     System.out.println("You have " + (z - 1) + " attempt...");

                                     y = sc.nextInt();
                                     while (y < min || y > max) {
                                         System.out.println("\nYou are out of range,");
                                         System.out.println("Enter the number from 0 to " + max);
                                         y = sc.nextInt();
                                         System.out.println("===================");
                                     }
                                     System.out.println("Your number " + y + " is in the specified range  from 0 to" + max);
                                     System.out.println("==================================================");

                                     enteredNamber = y;
                                     while (z == 2 || enteredNamber == namberRandom) {
                                         if (z == 2) { System.out.println("\nSorry you lost((");}
                                         if (enteredNamber == namberRandom) { System.out.println("\nYou Guessed !!!!!"); }
                                         if (z == 2 || enteredNamber == namberRandom) { System.out.println("The hidden number is " + namberRandom + " ."); }
                                         if (z == 2 || enteredNamber == namberRandom) { System.out.println("Do you want to play more? If yes - press 1. If no - press 2"); }
                                         m = sc.nextInt();
                                         if (m == 2) { System.out.println("\nLuccky another time!");break;}
                                         if (m == 1) { System.out.println("Enter the number from 0 to " + max);
                                             y = sc.nextInt();
                                             while (y < min || y > max) {
                                                 System.out.println("\nYou are out of range,");
                                                 System.out.println("Enter the number from 0 to " + max);
                                                 y = sc.nextInt();
                                                 System.out.println("===================");
                                                 }
                                             z = 4;
                                             enteredNamber = y;}

                                         if (m == 1) {namberRandom = random.nextInt(max -1);}
                                     }

                                 }
                             }

                }
}
