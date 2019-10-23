package src;

import java.util.Scanner;

public class App {
    // Font Colors. Static Values
    public static String BLUE = new String("\u001B[34m");
    public static String WHITE = new String("\u001B[37m");
    public static String RED = new String("\u001B[31m");
    public static String CYAN = new String("\u001B[36m");

    static Integer getOption(Scanner input) {
        try {
            Integer option = null;
            System.out.println("\n===============================================");
            System.out.println("Large-Scale and Multi-Structured Databases ");
            System.out.println("=============================================== \n");
            System.out.println("1) Print Hello World");
            System.out.println("2) Greatest Number");
            System.out.println("3) Count all lowercase vowels in a string");
            System.out.println("4) Retrieve elements from a given array list");
            System.out.println("5) Exit \n");
            System.out.print("Choose an action > ");
            option = Integer.parseInt(input.nextLine());
            return option;
        } catch (Exception error) {
            // If the User write an option not appear in the main Menu
            System.out.print("Are you sure you want to end this process ? [Y/N] > ");
            String exit = input.nextLine();
            if (exit.equals("N") || exit.equals("n")) {
                return 6;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer option = null;
        boolean start = true;

        while (start) {
            option = getOption(input);
            if (option == 0) {
                /* Possibile eccezione */
                input.close();
                start = false;
            }

            switch (option) {
            // Task 0. Print Hello World!
            case 1:
                try {
                    PrintWord task0 = new PrintWord("Hello World!");
                    System.out.println(BLUE + task0 + WHITE);
                } catch (Exception error) {
                    System.out.println(RED + "An error occurred while processing your request \n" + error + WHITE);
                }
                break;
            // Task 1. Get the greatest number
            case 2:
                try {
                    Integer size = null;
                    System.out.print("Write the quantity of numbers to evaluate > ");
                    size = Integer.parseInt(input.nextLine());

                    // Create the Array with the size writed by the user
                    int[] arrayNumber = new int[size];

                    for (int i = 0; i < size; i++) {
                        System.out.print(String.format("Write the Number %d > ", i + 1));
                        arrayNumber[i] = Integer.parseInt(input.nextLine());
                    }
                    GreatestNumber task1 = new GreatestNumber(arrayNumber, size);
                    System.out.println(BLUE + task1 + WHITE);
                    System.out.println(
                            CYAN + String.format("The Greatest Number is: %d", task1.getGreatestNumber()) + WHITE);
                } catch (Exception error) {
                    System.out.println(RED + "An error occurred while processing your request \n" + error + WHITE);
                }
                break;
            // Task 2. Count all lowercase vowels in a string
            case 3:
                try {
                    System.out.print("Write a sentence to evaluate and count all the lowercase vowels > ");
                    String sentence = input.nextLine();
                    CounterLowercase task2 = new CounterLowercase(sentence);
                    System.out.println(BLUE + task2 + WHITE);
                    System.out.println(CYAN
                            + String.format("The Quantity of lower Vowels are: %d", task2.getCounterVowels()) + WHITE);
                } catch (Exception error) {
                    System.out.println(RED + "An error occurred while processing your request \n" + error + WHITE);
                }
                break;
            // Task 3. Retrieve elements from a given array list
            case 4:
             try {
                Integer size = null;
                System.out.print("Write the quantity of values to evaluate > ");
                size = Integer.parseInt(input.nextLine());

                // Create the Array with the size writed by the user
                String[] arrayString = new String[size];

                for (int i = 0; i < size; i++) {
                    System.out.print(String.format("Write a Word Number %d > ", i + 1));
                    arrayString[i] = input.nextLine();
                }

                RetrieveElement task3 = new RetrieveElement(arrayString, size);
                System.out.println(BLUE + task3 + WHITE);

                System.out.print("Write the Element index do you want to Print > ");
                size = Integer.parseInt(input.nextLine());

                System.out.println(CYAN
                            + String.format("The First Element is: %s", task3.getFirstElement()) + WHITE);
                System.out.println(CYAN
                            + String.format("The Element with the index %d is: %s", size, task3.getElementByIndex(size)) + WHITE);
                } catch (Exception error) {
                    System.out.println(RED + "An error occurred while processing your request \n" + error + WHITE);
                }
                break;
            // Option Continue
            case 6:
                start = true;
                break;
            // Exit
            default:
                start = false;
                break;
            }
        }
     }
}
