import java.util.ArrayList;

public class Map {

// private String[][] map;
// private int x;
// private int y;
// private String place;
// private int[] enter = [0,2];
// private int[] exit = [0,4];



// public Map(int x, int y){
//     this.x = x;
//     this.y = y;
//     String[][] map = new String[x][y];

// }
public static void main(String[] args){
    ArrayList<ArrayList<String>> midievalRoom = new ArrayList();
    ArrayList<String> mRowOne;
    ArrayList<String> mRowTwo;
    ArrayList<String> mRowThree;
    ArrayList<String> mRowFour;
    
    midievalRoom.add(mRowOne);
    midievalRoom.add(mRowTwo);
    midievalRoom.add(mRowThree);
    midievalRoom.add(mRowFour);

    ArrayList<String> mRowOne = new ArrayList();
    mRowOne.add("Door");
    mRowOne.add("Blocked");
    mRowOne.add("Blocked");
    mRowOne.add("Blocked");

    ArrayList<String> mRowTwo = new ArrayList();
    mRowTwo.add("Empty");
    mRowTwo.add("Empty");
    mRowTwo.add("Object");
    mRowTwo.add("Blocked");

    ArrayList<String> mRowThree = new ArrayList();
    mRowThree.add("Trap");
    mRowThree.add("Empty");
    mRowThree.add("Empty");
    mRowThree.add("Blocked");

    ArrayList<String> mRowFour = new ArrayList();
    mRowFour.add("Blocked");
    mRowFour.add("Character");
    mRowFour.add("Empty");
    mRowFour.add("Door");
    
    System.out.print(midievalRoom);
}      
}

