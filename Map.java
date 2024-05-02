
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
    
    public static boolean getSpot(String[][] place) {
        // Check if coordinates are within the map bounds
        if (playerPosx >= 0 && playerPosx < place.length && playerPosy >= 0 && playerPosy < place[0].length) {
            return true;
        } else {
             System.out.println("Coordinates out of bounds.");
             return false;
            }
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
                    checkRoom(playerPosx, playerPosy, room);
                }
            }
            if(direction.contains("right")){
                if(playerPosy-- > 0 && !room[playerPosx][playerPosy - 1].contains("Blocked")){
                    playerPosy = playerPosy--;
                }
                else {
                    checkRoom(playerPosx, playerPosy, room);
            }
        }
            if(direction.contains("forward")){
                if(playerPosx++ < 4 && !room[playerPosx + 1][playerPosy].contains("Blocked")){
                    playerPosx = playerPosx++;  
                }
                else {
                    checkRoom(playerPosx, playerPosy, room);
            }
        }
            if(direction.contains("backward")){
                if(playerPosx-- < 0 && !room[playerPosx - 1][playerPosy].contains("Blocked")){
                    playerPosx = playerPosx--;
                }
                else {
                    checkRoom(playerPosx, playerPosy, room);
            } 
        }
            else{checkRoom(playerPosx, playerPosy, room);
            }
        }
        


    }     


    public static void checkRoom(int x, int y, String[][] map) {
        switch (map[x][y]) {
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
                System.out.println("Looks like you're at a door! If you wish to leave you can type quit, if not you should go another way.");
                break;
            case "Knight":
                System.out.println("Here is the knight! If you want to interact with the knight, type 'knight!'");
                Character.knight();
                break;
            case "Sword":
                System.out.println("There's a sword! Do you want to take the sword? Use the action 'take' along with the object name to grab the object!");
                
                break;
        }      
    }      
}