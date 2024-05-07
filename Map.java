
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
        if (playerPosx > (-1) & playerPosx < 3 || playerPosy > (-1) & playerPosy < 3) {
            return true;
        } 
        else {
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
                if(playerPosy++ < (room.length -1)){
                    playerPosy = playerPosy++;
                    checkRoom(playerPosx, playerPosy, room);
                }
                else {
                    System.out.println("You fell off the map!");
                    System.out.println("Y  = " + playerPosy + " Y =" + playerPosx);
                }
        }
            else if(direction.contains("right")){
                if(playerPosy-- > -1){
                    playerPosy = playerPosy--;
                    checkRoom(playerPosx, playerPosy, room);
                }
                    else {
                        System.out.println("You fell off the map!");
                        System.out.println("Y  = " + playerPosy + " Y =" + playerPosx);
                    }
        }
            else if(direction.contains("forward")){
                if(playerPosx++ <= (room.length -1)){
                    playerPosx = playerPosx++; 
                    // System.out.println(" row " + playerPosx + " column " + playerPosy); 
                    checkRoom(playerPosx, playerPosy, room);    
                }
                
        }
            else if(direction.contains("backward")){
                if(playerPosx-- < -1){
                    playerPosx = playerPosx--;
                    checkRoom(playerPosx, playerPosy, room);
                }
                    else {
                        System.out.println("You fell off the map!");
                        System.out.println("Y  = " + playerPosy + " Y =" + playerPosx);
                    }
                }
            else{
                System.out.println("Invalid direction. Please try again.");
            }
            }
        else if(getSpot(room) == false){
            System.out.println("You fell off the map! Time to start over:( Your coordinates are back to the start.");
            playerPosx = 0;
            playerPosy = 0;
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
                playerPosx = 0;
                playerPosy = 0;
                break;

            case "Door":
                System.out.println("Looks like you're at a door! If you wish to leave you can type quit, if not you should go another way.");
                break;
            case "Knight":
                System.out.println("Here is the knight! If you want to interact with the knight, type 'knight!'");
                if (Character.knight()== false){
                    System.out.println("You lost."); 
                }
                break;
            case "Sword":
                System.out.println("There's a sword! Do you want to take the sword? Use the action 'take' along with the object name to grab the object!");
                break;
            case "Exit":
                System.out.println("You have escaped the museum!!! CONGRATS!!!");
                break;
        }      
    }      
}