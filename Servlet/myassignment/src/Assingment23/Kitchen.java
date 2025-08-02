package Assingment23;

import java.util.Arrays;

public class Kitchen {
    public void showAppliances() {
        String[] appliances = {"Fridge", "Microwave", "Stove", "Toaster"};
        
      
        System.out.println("Kitchen Appliances:");
        for (String item : appliances) {
            System.out.println(item);
        }

        String[] copiedAppliances = Arrays.copyOf(appliances, appliances.length);

        System.out.println("\nCopied Appliances:");
        for (String item : copiedAppliances) {
            System.out.println(item);
        }
    }
}
