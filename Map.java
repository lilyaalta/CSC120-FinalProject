/**
 * Class Map that aids in keep track of user location. It also deals with the spaces of the map
 * and what they can do/ do to the user.
 */
public class Map {
    // initializing COORDINATE PLACES in order to move along the map
    private static int playerPosx = 0;
    private static int playerPosy = 0;
    
    /**
    * getSpot() checks whether the coordinates are out of bounds
    * @param place : the room and which map we are checking
    * @returns boolean 
    */
    public static boolean getSpot(String[][] place) {
        if (playerPosx >= 0 & playerPosx < (place.length - 1) || playerPosy >= 0 & playerPosy < (place[0].length - 1)) {
            return true;
        } else {
             return false;
        }
    }

    /**
    * playerGo() allows the player to move around the map 
    * @param direction : checks to see if the input string contains "left", "right", "forward", or "backward"
    * @param room : checks which room user is in 
    */
    public static void playerGo(String direction, String[][] room){
        if(getSpot(room)){
            if(direction.contains("left")){
                if(playerPosy++ < (room.length -1)){
                    // moves coords one digit
                    playerPosy = playerPosy++;
                    // calls on method to give the room a specific coord function
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
                if(playerPosx++ < (room.length -1)){
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
            } else{
                // if input string contains none of the directions
                System.out.println("Invalid direction. Please try again.");
            }
        } else{
            // if coords are out of bounds
            System.out.println("You fell off the map! Time to start over:( Your coordinates are back to the start.");
            playerPosx = 0;
            playerPosy = 0;
        }
    }
         
    /**
    * checkRoom() directs the game to printed statement based on the keyword of the map from the coordinates
    * @param x coordinate for which row the player is in
    * @param y coordinate for which place in the row the player is in
    * String[][] map midieval map
    */
    public static void checkRoom(int x, int y, String[][] map) {
        switch (map[x][y]) { // using switch case in order to check if the location of the map has any of the following Strings
            case "Empty":
                System.out.println("This space is empty, keep going!");
                break;
                // The trap brings the player back to the beginning by resetting the coordinates
            case "Trap":
                System.out.println("Oh no! It's a trap. You just reset in the game. Back to square one!");
                playerPosx = 0;
                playerPosy = 0;
                break;
                // the entrance/starting point of the game
            case "Door":
                System.out.println("Looks like you're at a door! If you wish to leave you can type quit, if not you should go another way.");
                break;
                // the Knight space starts the storyline of the knight
            case "Knight":
                System.out.println("You have bumped into a knight in shining armor!");
                System.out.println("You notice that it seems to be moving on its own a little... but you go to steal its helmet....");
                System.out.println("When it grabs your arm! Do you A) talk to it or B) fight? Type talk or fight into console");
                break;
                // the painting space starts the storyline of the painting 
            case "Painting":
                System.out.println("You have ran into a painting! It seems to be beconing you");
                System.out.println("You hear a voice and decide to inspect it.");
                System.out.println("It starts talking to you! Do you A) freak out, or B) chat with it? Type freak out or chat  into console.");
                break;
                // sword space...lets you know you can take it
            case "Sword":
                System.out.println("There's a sword! Do you want to take the sword? Use the action 'take' along with the object name to grab the object!");
                break;
                // exit space is the end of the game depending on if you have the key or not
            case "Exit":
                    if (User.satchel.contains("key")) {
                        System.out.println("You have escaped the museum!!! CONGRATS!!!");
                        System.out.println("You have escaped with" + User.inventory + " as your weapon and" + User.satchel + "in your satchel.");
                    } else {
                        System.out.println("You need to find the key to escape!");
                break;
                    }
                break;
                // weapon you can take
            case "Rope":
                System.out.println("There's a rope! Do you want to take the rope? Use the action 'take' along with the object name to grab the object!");
                break;
                // needed to esape!
            case "key":
                System.out.println("Here is the key! Add this to your satchel by stealing this so you can leave!");
                break;
        }
    }  
    /**
     * returns the current x coords of the player
     * @return player position x
     */
    public static int trackCoordsX(){
        return playerPosx;
    }

     /**
     * returns the current y coords of the player
     * @return player position xy
     */
    public static int trackCoordsY(){
        return playerPosy;
    }
}