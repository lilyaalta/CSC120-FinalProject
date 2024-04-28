import java.util.ArrayList;

public class Map {

private ArrayList<ArrayList<ArrayList<String>>> Map;
private int x;
private int y;
private String place;



public Map(int x, int y, String[][] map){
    this.x = x;
    this.y = y;
    String[][] map = new String[x][y];

}
    ArrayList<ArrayList<String>> midievalRoom = new ArrayList();

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

    midievalRoom.add(mRowOne);
    midievalRoom.add(mRowTwo);
    midievalRoom.add(mRowThree);
    midievalRoom.add(mRowFour);
    
    System.out.print(midievalRoom.get(1).get(0));
      
}

