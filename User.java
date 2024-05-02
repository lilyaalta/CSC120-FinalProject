import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

// initialize in main for objects and coordinates and anything that will be used across files

public class User {
    public String userName;
    public String whereAreYou;
    static ArrayList<String> inventory = new ArrayList<String>();
    static ArrayList<String> sachel = new ArrayList<String>();

    public static void take(String object) {
        //if you are at the right location
        if(Map.playerPosx == 3 & Map.playerPosy == 2){
            // if spot contains the object
            if (object == "Sword" | object == "Rope" | object == "Armor" | object == "Hammer" ) {
                // if your inventory is empty
                if (inventory.size == 0) {
                    inventory.add(object);
                }
                System.out.println("You already have an object in your inventory... you can only have one!");
            }
            System.out.println("There is currently nothing to take!");
        }
    }

    //Map.getSpot(room[0][0]);

    public static void steal(String object) {
        // if the coordinates are right
        if (Map.getSpot("midievalRoom") == [4][2]) {
            // if there is not one already in the sachel
            if (!sachel.contains(object)) {
                // if the character is one of these 2 things
                if (Object == "Key" | Object == "scroll") {
                    sachel.add();
                }
                System.out.println("You can't steal this object, try taking it!");
            }
            System.out.println("You already have an object in your inventory... you can only have one!");
        }
        System.out.println("There is currently nothing to steal! Or, if there is, try capitalizing the first letter");
    }

    public static void drop(String object) {
        if (inventory.contains(object)) {
            inventory.remove(object);
            System.out.println("You have successfully dropped" + object + "from your inventory!");
        }
        if (sachel.contains(object)) {
            sachel.remove(object);
            System.out.println("You have successfully dropped" + object + "from your sachel!");
        }
        System.out.println("There is nothing to drop!");
    }

    public static void viewInventory() {
        System.out.println("You currently have"+ inventory +"in your inventory");
    }
}