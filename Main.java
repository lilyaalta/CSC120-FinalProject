import java.util.Scanner;

public class Main {
    //initializing objects
    // objects which are sword, rope, hammer, armor
    
    private static int playerPosx;
    private static int playerPosy;

    playerPosx = 0;
    playerPosy = 0;

    String[] objects = {"Sword", "Rope", "Armor", "Hammer"};
     static String[][] midievalRoom = {
        {"Door", "Blocked", "Blocked", "Blocked"},
        {"Empty", "Empty", "Sword", "Blocked"},
        {"Trap", "Empty", "Empty", "Blocked"},
        {"Blocked", "Character", "Empty", "Door"}
    };
    // static String[][] jewelryRoom = {
    //     {"Door", "Blocked", "Blocked", "Blocked"},
    //     {"Empty", "Hammer", "Empty", "Empty"},
    //     {"Trap", "Empty", "Empty", "Rope"},
    //     {"Blocked", "Blocked", "Blocked", "Door"}
    // };
    // static String[][] paintingRoom = {
    //     {"Door",   "Character", "Blocked", "Trap"},
    //     {"Empty",  "Trap",      "Rope",     "Trap"},
    //     {"Empty",  "Empty",     "Empty",    "Sword"},
    //     {"Hammer", "Empty",     "Trap",     "Door"}
    };
    public static void getSpot(int x, int y) {
        // Check if coordinates are within the map bounds
        String[][] medievalRoom;
        if (x >= 0 && x < medievalRoom.length && y >= 0 && y < medievalRoom[0].length) {
            Main.checkRoom(medievalRoom[x][y]);
        } else {
             System.out.println("Coordinates out of bounds.");
        }

    /*/
    how do I get this to pin point the specific coordinates and then 
    have it read whatever is in the coordinates
     */

    public static void playerGo(String direction){
        if(direction.contains("forward")){
            if(playerPosy++ < 3 ){
                playerPosy = playerPosy++;
                checkRoom(midievalRoom[playerPosx][playerPosy]);
            }
        }
        if(direction.contains("backward")){
            if(playerPosy-- > 0){
                playerPosy = playerPosy--;
                checkRoom(midievalRoom[playerPosx][playerPosy]);
            }
        }
        if(direction.contains("left")){
            if(playerPosx++ < 3){
                playerPosx = playerPosx++;
                checkRoom(midievalRoom[playerPosx][playerPosy]);
            }
        }
        if(direction.contains("right")){
            if(playerPosx-- < 0){
                playerPosx = playerPosx--;
                checkRoom(midievalRoom[playerPosx][playerPosy]);
            }
        }
    }

    public static void checkRoom(String coordinates){
        if(String[][].equals("Blocked") == true){
             Room.roomBlocked(true);
        }
        if(String[][].equals("Empty") == true){
            Room.roomEmpty(true);
        }
        if(String[][].equals("Trap") == true){
            Room.roomTrap(true);
        }
        if(String[][].equals("Door") == true){
            Room.roomDoor(true);
        }      
        if(String[][].equals("Charcter") == true){
                //vharcter class
        }
        else{
            User.

        }

    }

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        String spot = getSpot(x, y);
        System.out.println("Spot at coordinates (" + x + ", " + y + "): " + spot);

        Scanner gameScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward");

        String inpuString = gameScanner.nextLine();  // Read user input
        System.out.println();  // Output user input
  }
}

    

}