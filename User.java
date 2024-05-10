import java.util.ArrayList;

public class User {
    // The inventory houses weapons, you can only hold one wespon at a time
    static ArrayList<String> inventory = new ArrayList<String>();
    // satchel houses stolen objects such as the scroll, key, and necklace
    static ArrayList<String> satchel = new ArrayList<String>();

/**
 * Allows the user to take a weapon and store it in their inventory so as long as they don't have an object stored and they are
 * at the right coordinate.
 * 
 * @param object the object that the user wants to add to their inventory
 * @param room the room the user is in
 */
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

/**
 * Allows the user to steal an object and store it in their satchel if they are at the right coordinates and if they have interacted with the
 * proper characters
 * 
 * @param object the object that the user wants to steal
 * @param room the room the user is in
 */
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

/**
 * Allows the user to drop any specified object from either satchel or inventory
 * 
 * @param object the object that the user wants to remove
 */
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

/**
* Allows user to see what their inventory is within the satchel and inventory
*/
    public static void viewInventory() {
        System.out.println("You currently have "+ inventory + " in your inventory");
        System.out.println("You currently have "+ satchel + " in your inventory");
    }

/**
 * The helpUser() prints out a cheatsheet in case the player needs help getting around the map.
 * @returns String
 */
public static void helpUser(){
    System.out.println("Need some help?");
    System.out.println("If you're stuck on the map, heres what the map looks like:");
    System.out.println("Escape Museum Map:");
    System.out.println("You start at the door and face the rest of the map.");
    System.out.println("{Door,  Empty,  Trap,  Empty,   Trap,     Trap}");
    System.out.println("{Empty, Empty,  Rope,  Empty,   Painting, Key }");
    System.out.println("{Trap,  Empty,  Empty, Trap,    Empty,    Trap}");
    System.out.println("{Trap,  Sword,  Trap,  Trap,    Empty,    Trap}");
    System.out.println("{Trap,  Empty,  Empty, Empty,   Empty,    Trap}");
    System.out.println("{Empty, Empty,  Trap,  Knight,  Empty,    Exit}");
    System.out.println("You may want to steer clear of the Trap spaces!");
    System.out.println("The Knight and Painting are special characters you can interact with!");
    System.out.println("The objects like sword, rope, and key might be useful...");
    System.out.println("And the Exit is your way out!");
    System.out.println("Here are the commands in Escape the Museum:");
    System.out.println("- go + (forward, backward, left, right)");
    System.out.println("- take + (sword, rope)");
    System.out.println("- steal + (scroll, key, necklace)");
    System.out.println("- inventory");
    System.out.println("- drop + (necklace, scroll, sword, rope)");
    System.out.println("- exit");
    System.out.println("- fight (applicable to knight only)");
    System.out.println("- talk (applicable to knight only)");
    System.out.println("- freak out (applicable to painting only)");
    System.out.println("- chat (applicable to painting only)");
    System.out.println("- help");

}

}