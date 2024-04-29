import java.util.Scanner;

public class Main {
    //initializing objects
    // objects which are sword, rope, hammer, armor

    String[] objects = {"Sword", "Rope", "Armor", "Hammer"};
    static String[][] midievalRoom = {
        {"Door", "Blocked", "Blocked", "Blocked"},
        {"Empty", "Empty", "Sword", "Blocked"},
        {"Trap", "Empty", "Empty", "Blocked"},
        {"Blocked", "Character", "Empty", "Door"}
    };
    static String[][] jewelryRoom = {
        {"Door", "Blocked", "Blocked", "Blocked"},
        {"Empty", "Hammer", "Empty", "Empty"},
        {"Trap", "Empty", "Empty", "Rope"},
        {"Blocked", "Blocked", "Blocked", "Door"}
    };
    static String[][] paintingRoom = {
        {"Door",   "Character", "Blocked", "Trap"},
        {"Empty",  "Trap",      "Rope",     "Trap"},
        {"Empty",  "Empty",     "Empty",    "Sword"},
        {"Hammer", "Empty",     "Trap",     "Door"}
    };

    public static int coordChecker(int row, int collumn, String action){
        for(action){
            if(action == "forward"){
                
            }
        }
    }

    /*/
    how do I get this to pin point the specific coordinates and then 
    have it read whatever is in the coordinates
     */

    public static boolean checkRoom(String[][] String[][], int i, int j){
        if(String[i][j].contains("Blocked") == true){
             Room.roomBlocked(true);
        }
        if(String[i][j].contains("Empty") == true){
            Room.roomEmpty(true);
        }
        if(String[i][j].contains("Trap") == true){
            Room.roomTrap(true);
        }
        if(String[i][j].contains("Door") == true){
            Room.roomDoor(true);
        }      
        if(String[i][j].contains("Charcter") == true){
                //vharcter class
        }
        else{
            User.

        }

    }

    public static void main(String[] args) {
        Scanner gameScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward");

        String inpuString = gameScanner.nextLine();  // Read user input
        System.out.println();  // Output user input
  }
}

    

}