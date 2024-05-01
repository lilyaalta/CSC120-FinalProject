import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

// initialize in main for objects and coordinates and anything that will be used across files

public class User {
    public String userName;
    public String whereAreYou;
    ArrayList<String> inventory = new ArrayList<String>();
    ArrayList<String> sachel = new ArrayList<String>();

    public void take() {
        if (//object is there to take//) {
            if (//inventory.size() == 0)//) {
                inventory.add(//object);
                //object must be deleted from coordinates//
            }
            System.out.println("You already have an object in your inventory... you can only have one!");
        }
        System.out.println("There is currently nothing to take!");
    }

    public void steal() {
        if (//object is there to take//) {
            if (//object is not already in the list) {
                if (//object is smth to be stolen) {
                    sachel.add(//object);
                }
                System.out.println("You can't steal this object, try taking it!");
            }
            System.out.println("You already have an object in your inventory... you can only have one!");
        }
        System.out.println("There is currently nothing to take!");
    }

    public void drop() {
        if (//inventory.size() == 0 //) {
            System.out.println("You have successfully dropped" + object + "!");
            // object added to new coordinates
        }
        System.out.println("There is nothing to pick up!");
    }

    public void inventory() {
        System.out.println("You currently have"+ inventory +"in your inventory");
    }

/* user can fight any creatures */
    public void fight() {

}