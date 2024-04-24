import java.util.ArrayList;

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
    public void fight(){
        if(/*something in your hand */){
            if(/* There is a creature near you */){
            return /*hit whatever is in front of you */
            }
        else{
            //say you have nothing in your hand and gets hit by creature
            }
        }

        }



    }
}
