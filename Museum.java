public class Museum {

    private String name;
    private int nRooms;
    
    public Museum(String name, int nRooms) {
        if (name != null) { this.name = name; } 
        if (nRooms < 1){
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nRooms = nRooms;
    }
    public String getName() {
        return this.name;
    }

    public int getFloors() {
        return this.nRooms;
    }

    public String toString() {
        return this.name + " is a " + this.nRooms + " story building.";
    }

    //check location
    public static void main(String[] args) {
        Museum fordHall = new Museum("Ford Hall", 4);
        System.out.println(fordHall);
    }
}