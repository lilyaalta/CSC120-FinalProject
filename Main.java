import java.util.Scanner;

public class Main {
    //initializing objects
    // objects which are sword, rope, hammer, armor
    
    

    public static void main(String[] args) {
         // where should these go

        String[][] midievalRoom = {
            {"Door", "Blocked", "Blocked", "Blocked"},
            {"Empty", "Empty", "Object", "Blocked"},
            {"Trap", "Empty", "Empty", "Blocked"},
            {"Blocked", "Knight", "Empty", "Door"}
         };
        Scanner gameScanner = new Scanner(System.in);  // I don't know why this is being mad
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward");

        while(true) {
            String inputString = gameScanner.nextLine().toLowerCase();
            if(inputString.contains("go")){
                String direction = inputString;
                Map.getSpot(midievalRoom);
                Map.playerGo(direction, midievalRoom);
            }
            else{
                System.out.println("invalid input. PLease use 'go' along with a direction to move");
            }
        }
  }
}
