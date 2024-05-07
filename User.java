import java.util.ArrayList;


public class User {
    static ArrayList<String> inventory = new ArrayList<String>();
    static ArrayList<String> satchel = new ArrayList<String>();

        // Modifying player position

    public static void take(String object, String[][] room) {
        //if you are at the right location
        if(room[Map.trackCoordsX()][Map.trackCoordsY()] == "Sword"){
            // if spot contains the object
            if (object.equals("sword")) {
                // if your inventory is empty
                if (inventory.size() == 0) {
                    inventory.add(object);
                    System.out.println("you have added " + object + " to your inventory!");
                } else {
                    System.out.println("You already have an object in your inventory... you can only have one!");
                }
            } else {
                System.out.println("This object is not to take! Try stealing it?");
            }
        } 
        else if(room[Map.trackCoordsX()][Map.trackCoordsY()] == "Rope"){
            // if spot contains the object
            if (object.equals("rope")) {
                // if your inventory is empty
                if (inventory.size() == 0) {
                    inventory.add(object);
                    System.out.println("you have added " + object + " to your inventory!");
                } else {
                    System.out.println("You already have an object in your inventory... you can only have one!");
                }
            } else {
                System.out.println("This object is not to take! Try stealing it?");
            }
        } else {
            System.out.println("There is currently nothing to take!");
        }      
    }

    //Map.getSpot(room[0][0]);

    public static void steal(String object, String[][] room) {
        // if the coordinates are right
        if (room[Map.trackCoordsX()][Map.trackCoordsY()] == "Knight") {
            // if there is not one already in the satchel
            if (!satchel.contains(object)) {
            // if the character is one of these 2 things
                if (object == "scroll") {
                    satchel.add(object);
                    System.out.println("You have added " + object + " to your secret satchel");
                } else {
                    System.out.println("You can't steal this object, try taking it!");
                }
            } else {
            System.out.println("You already have this object in your satchel... you can only have one!");
            }
        }
        else if (room[Map.trackCoordsX()][Map.trackCoordsY()] == "Painting") {
        // if there is not one already in the satchel
            if (!satchel.contains(object)) {
        // if the character is one of these 2 things
                if (object == "necklace") {
                    satchel.add(object);
                    System.out.println("You have added " + object + " to your secret satchel");
                } else {
                System.out.println("You can't steal this object, try taking it!");
                }
            } else {
            System.out.println("You already have this object in your satchel... you can only have one!");
            }
        } else {
        System.out.println("There is no object to steal!!");
        }
    }

    public static void drop(String object) {
        if (inventory.contains(object)) {
            inventory.remove(object);
            System.out.println("You have successfully dropped " + object + " from your inventory!");
        }
        else if (satchel.contains(object)) {
            satchel.remove(object);
            System.out.println("You have successfully dropped " + object + " from your sachel!");
        } else {
            System.out.println("There is nothing to drop!");
        }
    }

    public static void viewInventory() {
        System.out.println("You currently have "+ inventory + " in your inventory");
        System.out.println("You currently have "+ satchel + " in your inventory");
    }
}
public static String helpUser(){
    return """
            Need some help?

            If you're stuck on the map, heres what the map looks like:

            Escape Museum Map:

            You start at the door and face the rest of the map.

            {"Door",  "Empty",  "Trap",  "Empty",   "Trap",     "Trap"}
            {"Empty", "Empty",  "Rope",  "Empty",   "Painting", "Key" }
            {"Trap",  "Empty",  "Empty", "Trap",    "Empty",    "Trap"}
            {"Trap",  "Sword",  "Trap",  "Trap",    "Empty",    "Trap"}
            {"Trap",  "Empty",  "Empty", "Empty",   "Empty",    "Trap"}
            {"Empty", "Empty",  "Trap",  "Knight",  "Empty",    "Exit"}

            You may want to steer clear of the Trap spaces!

            The Knight and Painting are special characters you can interact with!

            The objects like sword, rope, and key might be useful...

            And the Exit is your way out!

            Here are the commands in Escape the Museum:

            - go + (forward, backward, left, right)
            - take + (sword, rope)
            - steal + (scroll, key, necklace)
            - inventory
            - drop + (necklace, scroll, sword, rope)
            - exit
            - fight
            - talk
            - freak out
            - chat
            - help

            """;
}