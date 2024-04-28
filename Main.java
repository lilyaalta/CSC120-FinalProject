public class Main {
    //initializing objects
    // objects which are sword, rope, hammer, armor

    String[] objects = {"Sword", "Rope", "Armor", "Hammer"};
    static String[][] midievalRoom = {
        {"Door", "Blocked", "Blocked", "Blocked"},
        {"Empty", "Empty", "Sword", "Blocked"},
        {"Trap", "Empty", "Empty", "Blocked"},
        {"Blocked", "Character", "Empty", "Door"}
    };
    static String[][] jewelryRoom = {
        {"Door", "Blocked", "Blocked", "Blocked"},
        {"Empty", "Hammer", "Empty", "Empty"},
        {"Trap", "Empty", "Empty", "Rope"},
        {"Blocked", "Blocked", "Blocked", "Door"}
    };
    static String[][] paintingRoom = {
        {"Door", "Character", "Blocked", "Trap"},
        {"Empty", "Trap", "Rope", "Trap"},
        {"Empty", "Empty", "Empty", "Sword"},
        {"Hammer", "Empty", "Trap", "Door"}
    };

    public static boolean checkRoom(String[][] String[][], int i, int j){
        if(String[i][j].contains("Blocked") == true){
             Room.roomBlocked(true);
        }
        if(String[i][j].contains("Empty") == true){
            Room.roomEmpty(true);
        }
        if(String[i][j].contains("Trap") == true){
            Room.roomTrap(true);
        }
        if((String[i][j].contains("Door") == true)){
            Room.roomDoor(true);
        }      
    }

    public static void main(String[] args) {
        Object check = checkRoom(jewelryRoom, 1, 0);
        System.out.println(check);

    

}