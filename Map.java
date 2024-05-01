import java.util.ArrayList;

public class Map {

    private static int playerPosx;
    private static int playerPosy;

    playerPosx = 0;
    playerPosy = 0;
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
    public static void getSpot(String[][] room) {
        // Check if coordinates are within the map bounds
        if (playerPosx >= 0 && playerPosx < room.length && playerPosy >= 0 && playerPosy < room[0].length) {
            checkRoom(room[playerPosx][playerPosy]);
        } else {
             System.out.println("Coordinates out of bounds.");
            }
    }
    /*/
    how do I get this to pin point the specific coordinates and then 
    have it read whatever is in the coordinates
     */

    public static void playerGo(String direction, String[][] room){
        if(direction.contains("forward")){
            if(playerPosy++ < 3 && !room[playerPosx][playerPosy++].contains("Blocked")){
                playerPosy = playerPosy++;
            }
        }
        if(direction.contains("backward")){
            if(playerPosy-- > 0 && !room[playerPosx][playerPosy++].contains("Blocked")){
                playerPosy = playerPosy--;
            }
        }
        if(direction.contains("left")){
            if(playerPosx++ < 3 && !room[playerPosx][playerPosy++].contains("Blocked")){
                playerPosx = playerPosx++;  
            }
        }
        if(direction.contains("right")){
            if(playerPosx-- < 0 && !room[playerPosx][playerPosy++].contains("Blocked")){
                playerPosx = playerPosx--;
            }
        }
    }

    public static void checkRoom(String coordinates){
        switch (coordinates) {
            case "Blocked":
                Room.roomBlocked(true);
                break;
            case "Empty":
                Room.roomEmpty(true);
                break;
            case "Trap":
                Room.roomTrap(true);
                break;
            case "Door":
                Room.roomDoor(true);
                break;
            case "Character":
                Character.knight();
                break;
            case "Object":
                //handle object logic
                break;
        }
       
    }

  
      
}