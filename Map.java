import java.util.ArrayList;

public class Map {

    private static int playerPosx = 0;
    private static int playerPosy = 0;

    public static int getPlayerPosx() {
        return playerPosx;
    }

    public static int getPlayerPosy() {
        return playerPosy;
    }

    public static void setPlayerPosx(int newPosx) {
        playerPosx = newPosx;
    }

    public static void setPlayerPosy(int newPosy) {
        playerPosy = newPosy;
    }

    // playerPosx = 0;
    // playerPosy = 0;
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
    // };
    public static boolean getSpot(String[][] room) {
        // Check if coordinates are within the map bounds
        if (playerPosx >= 0 && playerPosx < room.length && playerPosy >= 0 && playerPosy < room[0].length) {
        } else {
             System.out.println("Coordinates out of bounds.");
            }
        return true;
    }
    /*/
    how do I get this to pin point the specific coordinates and then 
    have it read whatever is in the coordinates
     */

    public static void playerGo(String direction, String[][] room){
        if(getSpot(room) == true){
            if(direction.contains("left")){
                if(playerPosy++ < 3 && !room[playerPosx][playerPosy + 1].contains("Blocked")){
                    playerPosy = playerPosy++;
                }
                else {
                    checkRoom(room[playerPosx][playerPosy]);
                }
            }
            if(direction.contains("right")){
                if(playerPosy-- > 0 && !room[playerPosx][playerPosy + 1].contains("Blocked")){
                    playerPosy = playerPosy--;
                }
            }
            if(direction.contains("forward")){
                if(playerPosx++ < 3 && !room[playerPosx + 1][playerPosy].contains("Blocked")){
                    playerPosx = playerPosx++;  
                }
            }
            if(direction.contains("backward")){
                if(playerPosx-- < 0 && !room[playerPosx + 1][playerPosy].contains("Blocked")){
                    playerPosx = playerPosx--;
                }
            } 
            }


    }     
}


    public static void checkRoom(String coordinates) {
        switch (coordinates) {
            case "Blocked":
            System.out.println("Sorry, this space is blocked, try moving somewhere else!");
                break;
            case "Empty":
                System.out.println("This space is empty, keep going!");
                break;
            case "Trap":
                System.out.println("Oh no! It's a trap. You just reset in the game. Back to square one!");
                break;
            case "Door":
                System.out.println("Looks like you're at a door! Do you wish to leave?");
                break;
            case "Knight":
                System.out.println("call knight!!!!");
                break;
            case "Object":
                System.out.println("say something idk");
                break;
        }      
    }      
}