package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


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


        System.out.println("Do you want to order another garment? (yes/no)");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter type of garment to order (top/pants/shoes):");
            String garmentType = sc.nextLine();


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

            if (newGarment != null) {
                System.out.println("Ordered new garment:");
                System.out.println(newGarment);
            }
        }
    }
}
