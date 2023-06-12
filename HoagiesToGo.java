package hoagiestogo;

import java.util.ArrayList;

import java.util.Scanner;

public class HoagiesToGo {
  

public static void main(String[] args) {
       
    	
    	// Declare variables for greeting and slogan
       
    	String greeting = "Welcome to Hoagies to Go!";
       
        String slogan = "Build Your Own Hoagies, Your Way. Time to build a hoagie.";
        
        //boolean to see if user is vegan
       
        boolean isVegan = true;
        
        //ArrayList for rolls
       
        ArrayList<String> rolls = new ArrayList<>();
       
        rolls.add("white roll");
      
        rolls.add("wheat roll");
       
        rolls.add("sesame seed roll");
        
        //ArrayList for meats
       
        ArrayList<String> meats = new ArrayList<>();
        
        meats.add("ham");
       
        meats.add("roast beef");
     
        meats.add("chicken");
     
        meats.add("veggie patty");
        
        //ArrayList for toppings
       
        ArrayList<String> toppings = new ArrayList<>();
       
        toppings.add("cheese");
        
        toppings.add("lettuce");
        
        toppings.add("tomatoes");
       
        toppings.add("onions");
       
        toppings.add("bacon");
       
        toppings.add("mayonnaise");

        // Display greeting and slogan
      
        System.out.println(greeting);
       
        System.out.println(slogan);

        // Display roll types
        
         System.out.println("\nRoll types:");
       
        for (String roll : rolls) {
            
        	System.out.println("- " + roll);
        }

        // Prompt for roll type and assign to variable
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("\nWhat type of hoagie roll do you want?");
       
        String rollType = scanner.nextLine();

        // Display meat types
       
        displayItems("Meat types:", meats);

        // Prompt for meat type and assign to variable
       
        System.out.println("What type of meat do you want?");
       
        String meatType = scanner.nextLine();

        // Determine if meat is vegan and set isVegan variable
       
        if (meatType.equals("veggie patty")) {
            
        	isVegan = true;
        } 
        else {
            
        	isVegan = false;
        }

        // Prompt for toppings
      
        
        System.out.println("Choose your toppings (type 'done' when finished):");
        
        String toppingType = scanner.nextLine();
     
        while (!toppingType.equals("done")) {
          
        	toppings.add(toppingType);
           
        	if (toppingType.equals("cheese") || toppingType.equals("bacon") || toppingType.equals("mayonnaise")) {
               
        		isVegan = false;
            }
         
        	System.out.println("What other topping do you want?");
           
            toppingType = scanner.nextLine();
        }

        // Display order summary
       
        System.out.println("You ordered a " + meatType + " hoagie on a " + rollType + " roll.");

        // Display toppings if there are any
       
        if (!toppings.isEmpty()) {
           
        	System.out.print("Your hoagie is topped with: ");
           
        	for (String topping : toppings) {
                
        		System.out.print(topping + " ");
            }
           
        	System.out.println();
        }

        // Display vegan message if applicable
       
        if (isVegan) {
            
        	System.out.println("Thank you for trying our vegan hoagie.");
        } 
       
        else {
          
        	System.out.println("Thank you for ordering a hoagie from Hoagies to Go");
        }
    }
     
    //to display items 
	
     private static void displayItems(String string, ArrayList<String> meats) {
		
		
	}
	  
		
		
		
		
	}

