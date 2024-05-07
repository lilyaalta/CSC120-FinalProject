import java.util.Random;
import java.util.ArrayList;
public class Character {
    
    // private int characterLocation;
    ArrayList<String> numberList = new ArrayList<String>();
    static Random rand = new Random();


    public static boolean knightFight() {
        if (User.inventory.contains("rope")) {
            if(chanceOfSurvival(1) == true) {
                System.out.println("You toss the rope cowboy-style at the franken-suit and its rusty screws crumble. The suit falls apart! Congrats!");
                return true;
            }
            System.out.println("That knight knew what you were trying to do, and grabbed the rope. You lose!");
            System.out.println("Game Over!");
            return false;
        }
        else if (User.inventory.contains("sword")) {
            if(chanceOfSurvival(3) == true) {
                System.out.println("Even though you have never fought with a sword before, you are a natural!");
                System.out.println("You and the knight attack each other, ducking and swinging...");
                System.out.println("... and you win!");
                System.out.println("Game Over!");
                return true;
            }
            System.out.println("You have never used a sword in your life and it shows... you lost!");
            System.out.println("Game Over!");
            return false;
        }
        System.out.println("Since you have no weapons, you bravely decide to go up against the suit...by running");
        System.out.println("And you bravely get caught.");
        System.out.println("Game Over!");
        return false;
    }  

    public static boolean knightTalk () {
        if (chanceOfSurvival(1) == true) {
            if (chanceOfSurvival(3)== true) {
                System.out.println("The knight tells you: 'you know, I normally don't do this with intruders, but I'm gonna help you.' ");
                System.out.println("Curious, you ask how. It says 'take this scroll. It might be worth money, who knows. I've been \nin the museum for too long and I'm bored. Steal it.'");
                return true;
            } 
            else {
            System.out.println("'Sooo... hey,' you say to the suit of armor. 'Come here often?'");
            System.out.println("The knight is taken aback by your audacity and yells for security. You are arrested.");
            System.out.println("Game Over!");
            return false;
            }
        } else {
        System.out.println("Before you can even get a word out, the suit of armor grabs his sword and stabs you,");
        System.out.println("This was not a friendly suit of armor, apparently. Maybe don't try to talk to it...");
        System.out.println("Game Over!");
        return false;
        }
    }

    public static boolean paintingFight() {
        if (User.inventory.contains("rope")) {
            if(chanceOfSurvival(0) == true) {
                System.out.println("Despite all odds, you beat the painting with a rope. You come across a shimmery expensive-looking necklace on the back of the portrait.");
                    return true;
            }
            System.out.println("Why would you even try to attack a painting with a rope. You are arrested and made fun of on twitter.");
            System.out.println("Game Over!");
            return false;
        }
        if (User.inventory.contains("sword")) {
            if(chanceOfSurvival(3) == true) {
                System.out.println("Before you can even start to slice the painting, it implores you to stop.");
                System.out.println("It tells you that there is a an expensive neccklace hidden behind it, and asks you to take it instead of destroying it.");
                return true;
            }
            System.out.println("You are caught trying to slice up a painting and arrested.");
            System.out.println("Game Over!");
            return false;
        }
        //else you try to fistfight
        System.out.println("Since you have no weapons, you awkwardly decide how to deal with a painting that you want to fight.");
        System.out.println("You decide to unhook it and angrily toss it across the room, as it won't stop making fun of you for being angry at it.");
        System.out.println("As it flies across the room, you notice a necklace drops drops.");
        System.out.println("Its quite shiny and expensive looking. You decide you want it.");
        return true;
    }

    public static boolean paintingChat() {
        if (chanceOfSurvival(3) == true) {
            System.out.println("'Hey! You aren't supposed to be in here right now! Who are you?' Asks the painting. You decide not to question why there is a talking painting and get right into continuing your mission");
                System.out.println("You decide to lie, and say that you are a janitor. The painting says, 'You don't look like you're dressed to be a janitor...'");
                System.out.println("You simply reply that it is your first day on the job, and that you haven't gotten your uniform yet.");
                System.out.println("'I'm assigned to the most expensive and desirable objects. To clean them of course... can you direct me?");
            if (chanceOfSurvival(2) == true) {
                System.out.println("For whatever reason, the paining does not suspect a thing. It offers you advice and says,");
                System.out.println("'Actually, there is a centuries old necklace hidden behind me, in my frame. You should take it, as a thank you for being such a good janitor! I'm pretty sure our staff has forgotten about it.");
                return true;
            }
            System.out.println("'NO' It screams, alerting the gaurds.");
            System.out.println("You are arrested :( )");
            System.out.println("Game Over!");
            return false;
        }
        System.out.println("You are arrested.");
        System.out.println("Game Over!");
        return false;
    }



    /*
     * the chance of survival based off a non-changing number input
     * @param number, the set number that helps determine chances
     * @return a boolean t/f that shows survival of the user
     */
    private static boolean chanceOfSurvival (int number) {
        // if input number 3
        int randomNumber = rand.nextInt(10);
        if (number == 3) {
            if (randomNumber <= 9) {
                return true;
            }
            return false;
        }
        // if input number 2
        if (number == 2) {
            if (randomNumber <= 7) {
                return true;
            }
            return false;
        }
        // if inout number 1
        if (number == 1) {
            if (randomNumber <= 5) {
                return true;
            }
            return false;
        }
        // if input number 0 very low chance
        if (number == 0) {
            if (randomNumber <= 1) {
                return true;
            }
            return false;
        }
        System.out.println("need to input valid number");
        return false;
    }
}