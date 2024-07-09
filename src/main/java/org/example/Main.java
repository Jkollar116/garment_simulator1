package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create new garment objects for top, pants, and shoes
        System.out.println("Enter type of top (ex Shirt):");
        String topType = sc.nextLine();
        System.out.println("Enter category of top (Professional, Casual, Party):");
        String topCategory = sc.nextLine();
        Tops top = new Tops(topType, topCategory);

        System.out.println("Enter type of pants (ex Jeans):");
        String pantsType = sc.nextLine();
        System.out.println("Enter category of pants (Professional, Casual, Party):");
        String pantsCategory = sc.nextLine();
        Pants pants = new Pants(pantsType, pantsCategory);

        System.out.println("Enter type of shoes (ex Sneakers):");
        String shoesType = sc.nextLine();
        System.out.println("Enter category of shoes (Professional, Casual, Party):");
        String shoesCategory = sc.nextLine();
        Shoes shoes = new Shoes(shoesType, shoesCategory);

        //check if any of the categories match
        String matchingCategory = getMatchingCategory(top, pants, shoes);

        //ask the user if they want to order another garment
        System.out.println("Do you want to order another garment? (yes/no)");
        String answer = sc.nextLine();

        //if yes, ask the user for the type of garment to order
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter type of garment to order (top/pants/shoes):");
            String garmentType = sc.nextLine();

            //it will make a new garment object with the matching category
            Clothes newGarment = null;
            if (garmentType.equalsIgnoreCase("top")) {
                newGarment = new Tops("New Top", matchingCategory);
            } else if (garmentType.equalsIgnoreCase("pants")) {
                newGarment = new Pants("New Pants", matchingCategory);
            } else if (garmentType.equalsIgnoreCase("shoes")) {
                newGarment = new Shoes("New Shoes", matchingCategory);
            } else {
                System.out.println("Not the correct garment type");
            }
            //if they dont enter a correct garment type, it will print out the new garment
            if (newGarment != null) {
                System.out.println("Ordered new garment:");
                System.out.println(newGarment);
            }
        }
    }
            //this method will check if any of the categories match
    private static String getMatchingCategory(Tops top, Pants pants, Shoes shoes) {
        String matchingCategory;
        if (top.getCategory().equals(pants.getCategory())) {
            matchingCategory = top.getCategory();
        } else if (top.getCategory().equals(shoes.getCategory())) {
            matchingCategory = top.getCategory();
        } else if (pants.getCategory().equals(shoes.getCategory())) {
            matchingCategory = pants.getCategory();
        } else {
            matchingCategory = "No matching category.";
        }
        return matchingCategory;
    }
}
