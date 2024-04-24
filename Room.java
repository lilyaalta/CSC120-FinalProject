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

    public Map create(){

    }

    private class Map(){
        private String[][] map;
        private int[] enter = [0,2];
        private int[] exit = [0,4];

        private Map(int x, int y){
        this.x = x;
        this.y = y;
        String[][] map = new String[x][y];
        }

        private void populate(int x, String[] row){
            this.map[x] = row;
        }

        private void check(int x, int y){
            if 

        }
    }   
}
