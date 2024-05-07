
public class Map {

    private static int playerPosx = 0;
    private static int playerPosy = 0;
    
    public static boolean getSpot(String[][] place) {
        // Check if coordinates are within the map bounds
        if (playerPosx >= 0 & playerPosx < (place.length - 1) || playerPosy >= 0 & playerPosy < (place[0].length - 1)) {
            return true;
        } 
        else {
             return false;
            }
    }

    public static void playerGo(String direction, String[][] room){
        if(getSpot(room)){
            if(direction.contains("left")){
                if(playerPosy++ < (room.length -1)){
                    playerPosy = playerPosy++;
                    checkRoom(playerPosx, playerPosy, room);
                }
        }
            else if(direction.contains("right")){
                if(playerPosy-- > 0){
                    playerPosy = playerPosy--;
                    checkRoom(playerPosx, playerPosy, room);
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
                if(playerPosx-- < 0){
                    playerPosx = playerPosx--;
                    checkRoom(playerPosx, playerPosy, room);
                }
                }
            else{
                System.out.println("Invalid direction. Please try again.");
            }
        }
        else{
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
            //just added
                System.out.println("You have bumped into a knight in shining armor!");
                System.out.println("You notice that it seems to be moving on its own a little... but you go to steal its helmet....");
                System.out.println("When it grabs your arm! Do you A) talk to it or B) fight? Type talk or fight into console");
                // fix
                //if (Character.knight() == false){
                    //System.out.println("You lost."); 
                //}
                //else if (Character.knight() == true){
                    //System.out.println("Keep going!");
                //}
                break;
            case "Painting":
                System.out.println("You have ran into a painting! It seems to be beconing you");
                System.out.println("You hear a voice and decide to inspect it.");
                System.out.println("It starts talking to you! Do you A) freak out, or B) chat with it? Type freak out or chat  into console.");
            case "Sword":
                System.out.println("There's a sword! Do you want to take the sword? Use the action 'take' along with the object name to grab the object!");
                break;
            case "Exit":
                System.out.println("You have escaped the museum!!! CONGRATS!!!");
                break;
        }      
    }  
    public static int trackCoordsX(){
        return playerPosx;
    }    
    public static int trackCoordsY(){
        return playerPosy;
    }
}