import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

// initialize in main for objects and coordinates and anything that will be used across files

public class User {
    static ArrayList<String> inventory = new ArrayList<String>();
    static ArrayList<String> satchel = new ArrayList<String>();
    public static int x = Map.getPlayerPosx();
    public static int y = Map.getPlayerPosy();

        // Modifying player position
    // Map.setPlayerPosx(x + 1);
    // Map.setPlayerPosy(y - 1);

    public static void take(String object, String[][] room) {
        //if you are at the right location
        // would normally say "Object"
        if(room[y][x] == "Sword"){
            // if spot contains the object
            if (object == "sword" | object == "Rope" | object == "Armor" | object == "Hammer" ) {
                // if your inventory is empty
                if (inventory.size() == 0) {
                    inventory.add(object);
                    System.out.println("you have added" + object + "to your inventory!");
                }
                System.out.println("You already have an object in your inventory... you can only have one!");
            }
            System.out.println("There is currently nothing to take!");
        }
    }

    //Map.getSpot(room[0][0]);

    public static void steal(String object, String[][] room) {
        // if the coordinates are right
        if (room[y][x] == "Object") {
            // if there is not one already in the satchel
            if (!satchel.contains(object)) {
                // if the character is one of these 2 things
                if (object == "Key" | object == "scroll") {
                    satchel.add(object);
                    System.out.println("You have added" + object+ "to your secret satchel");
                }
                System.out.println("You can't steal this object, try taking it!");
            }
            System.out.println("You already have an object in your inventory... you can only have one!");
        }
        System.out.println("There is currently nothing to steal!");
    }

    public static void drop(String object) {
        if (inventory.contains(object)) {
            inventory.remove(object);
            System.out.println("You have successfully dropped" + object + "from your inventory!");
        }
        if (satchel.contains(object)) {
            satchel.remove(object);
            System.out.println("You have successfully dropped" + object + "from your sachel!");
        }
        System.out.println("There is nothing to drop!");
    }

    public static void viewInventory() {
        System.out.println("You currently have"+ inventory + "in your inventory");
    }
}