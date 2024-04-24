import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

// initialize in main for objects and coordinates and anything that will be used across files

public class User {
    public String userName;
    public String whereAreYou;
    ArrayList<String> inventory = new ArrayList<String>();

/* will hold off until map is ready*/
    public void go(forward, backwards, left, right) {

    }

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
        if (//user near creature) {
           if (creature == knight) {
            if (//inventory != 0) {
                if (inventory.contains(sword)) {
                    System.out.println("You fight");
                    // 95% chance of winning, else you die
                }
                if (inventory.contains(rope)) {
                    System.out.println("You fight");
                    // 50% chance of winning
                }
                if (inventory.contains(hammer)) {
                    System.out.println("You fight");
                    // 75% chance of winning
                }
                // else its armor
                System.out.println("You fight");
                // does not do much for you, 30% chance, all it does is protect you
            }
            System.out.println("You cannot fight" + creature "you have nothing to fight it with!");
            System.out.println("If you want to keep fighting with your bare hands... type FIGHT!");
            System.out.println("...but the odds are not in your favor...");
            // scanner? make it a 25%
            // put position back to starting... die?
           }
           if (creature == painting) {
            // all the painting is, is annoying and loud
            if (//inventory != 0) {
                if (inventory.contains(sword)) {
                    System.out.println("You slice up the painting");
                }
                if (inventory.contains(rope)) {
                    // you do not win, rope vs a painting = stupid
                }
                if (inventory.contains(hammer)) {
                    // brutal... but ok
                }
                // else its armor
                // you also lose bc armor vs painting does nothing

            }
           }
           // if you have nothing to fight the painting with, you can just take it
           // off the wall and place it face down on the ground, shutting it up
        }
        System.out.println("There is nothing to fight here!");
    }

}
