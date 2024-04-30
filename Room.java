import java.util.ArrayList;

public class Room extends Museum{
    private String name;
    private ArrayList<Character> characters;
    private Map matrix;

    public Room(String name, int nFloors, ArrayList<Character> characters, Map matrix) {
        super(name, nFloors);
        this.name = name;
        this.characters = characters;
        this.matrix = null;
        
    }
    public static String roomBlocked(boolean isBlocked){
       return "Sorry, this space is blocked, try moving somewhere else!";
    }

    public static String roomEmpty(boolean isEmpty){
        return "This space is empty, keep going!";
    }

    public static String roomTrap(boolean isTrap){
        // make it so that their coordinates reset back to the front of the room
        return "Oh no! It's a trap. You just reset in the game. Back to square one!";
    }
    public static String roomDoor(boolean isDoor){
        // make it so they have an option of what room they wish to enter
        return "Looks like you're at a door! What room do you want to enter?";
    }
}
