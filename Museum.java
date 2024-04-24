public class Museum {

    private String name;
    private int nFloors;
    
    public Museum(String name, int nFloors) {
        if (name != null) { this.name = name; } 
        if (nFloors < 1){
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    public String getName() {
        return this.name;
    }

    public int getFloors() {
        return this.nFloors;
    }

    public String toString() {
        return this.name + " is a " + this.nFloors + " story building.";
    }

    //check location
    public static void main(String[] args) {
        Museum fordHall = new Museum("Ford Hall", 4);
        System.out.println(fordHall);
    }
}