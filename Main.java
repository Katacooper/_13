package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        int value = 0;
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        for(int i = 0; i < 8; i++)
        {
            value = (int)(Math.random() * range) + min;
            numbers.add(value);
        }
        System.out.println("First item: " + numbers.get(0));
        numbers.remove(0);
        numbers.remove(1);
        numbers.remove(2);
        System.out.println("First remaining item: " + numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        //Adding price to the list
        menuPrices.add(1.80);
        menuPrices.add(2.00);
        menuPrices.add(1.20);
        menuPrices.add(1.00);
        menuPrices.add(0.20);
        menuPrices.add(1.20);

        //Adding Items to the list
        menuItems.add("Pupetto");
        menuItems.add("Pupetto + Salse");
        menuItems.add("Wurstel in carrozza");
        menuItems.add("Arancino normale");
        menuItems.add("Aggiunta di salsa");
        menuItems.add("Arancino speciale");

        for(int i = 0; i < 6; i++)
        {
            System.out.println("Item : " + menuItems.get(i) +  " || " + "Price: " + menuPrices.get(i) + "€");
        }
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        double sum = 0;
        for(int i = 0; i < 10; i++)
        {
            sum = sum + items[i];
        }
        System.out.println("Sum of all item is: " + sum);
    }
}
