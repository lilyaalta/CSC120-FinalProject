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
}
