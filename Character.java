import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Character {
    
    // private int characterLocation;
    ArrayList<String> numberList = new ArrayList<String>();
    static Scanner scanAnswers = new Scanner(System.in);
    static Random rand = new Random();


    // when a character is at the spot where the knight is
    public static boolean knight() {
        System.out.println("You have bumped into a knight in shining armor!");
        System.out.println("You notice that it seems to be moving on its own a little... but you go to steal its helmet....");
        System.out.println("When it grabs your arm! Do you A) talk to it or B) fight? Type talk or fight into console");
        String userAns = scanAnswers.nextLine().toLowerCase();
        while (true){
            if (userAns.contains("talk")){
                if (chanceOfSurvival(1) == true) {
                    if (chanceOfSurvival(3)== true) {
                        System.out.println("The knight tells you: 'you know, I normally don't do this with intruders, but I'm gonna help you.' ");
                        System.out.println("Curious, you ask how. It says 'take this scroll. It might be worth money, who knows. I've been \nin the museum for too long and I'm bored. Steal it.'");
                        scanAnswers.close();
                    } 
                    else {
                    System.out.println("'Sooo... hey,' you say to the suit of armor. 'Come here often?'");
                    System.out.println("The knight is taken aback by your audacity and yells for security. You are arrested");
                    scanAnswers.close();
                    return false;
                    }
                } else {
                System.out.println("Before you can even get a word out, the suit of armor grabs his sword and stabs you,");
                System.out.println("This was not a friendly suit of armor, apparently. maybe don't try to talk to it...");
                }
            }
            else if (userAns.contains("fight")) {
                // check inventory
                if (User.inventory.contains("Hammer")) {
                    if(chanceOfSurvival(2) == true) {
                        System.out.println("You decide to valiantly battle this knight, hitting this thin sheet of human-shaped metal right where it hurts...");
                        System.out.println("And you win! Congrats. You can go about your theivery, but don't forget to add your new trophy to your satchel!");
                        scanAnswers.close();    
                        return true;
                    }
                    else{
                    System.out.println("You do not make it against this knight. Who knew a suit of armor with no muscle or real body parts was so strong!");
                    scanAnswers.close();
                    return false;
                    }
                }
                else if (User.inventory.contains("Rope")) {
                    if(chanceOfSurvival(1) == true) {
                        System.out.println("You toss the rope cowboy-style at the franken-suit and its rusty screws crumble. The suit falls apart! Congrats!");
                        scanAnswers.close();
                        return true;
                    }
                    System.out.println("That knight knew what you were trying to do, and grabbed the rope. You lose!");
                    scanAnswers.close();
                    return false;
                }
                else if (User.inventory.contains("Sword")) {
                    if(chanceOfSurvival(3) == true) {
                        System.out.println("Even though you have never fought with a sword before, you are a natural!");
                        System.out.println("You and the knight clash swords, a long lasting and graceful battle.");
                        System.out.println("... and you win!");
                        scanAnswers.close();
                        return true;
                    }
                    System.out.println("You have never used a sword in your life and it shows... you lost!");
                    scanAnswers.close();
                    return false;
                }
                else if (User.inventory.contains("Armor")) {
                    if(chanceOfSurvival(1) == true) {
                        System.out.println("Well, using a suit of armor against a suit of armor was a choice, but a smart one apparently.");
                        System.out.println("because you win!");
                        scanAnswers.close();
                        return true;

                    }
                    System.out.println("Using a suit of armor against a suit of armor was not helpful. Nice try I guess.");
                    scanAnswers.close();
                    return false;
                }
                System.out.println("Since you have no weapons, you bravely decide to go up against the suit...by running");
                System.out.println("And you bravely get caught.");
                scanAnswers.close();
                return false;
            }  
        scanAnswers.close();
    }
}


    private void painting () {
        System.out.println("You have ran into a painting! It seems to be beconing you");
        System.out.println("You hear a voice and decide to inspect it.");
        System.out.println("It starts talking to you! Do you A) freak out, or B) chat with it? Type freak out or chat  into console.");
        String inputString = scanAnswers.nextLine().toLowerCase();
        if (inputString == "chat"){
            if (chanceOfSurvival(3) == true) {
                System.out.println("'Hey! You aren't supposed to be in here right now! Who are you?' Asks the painting. You decide not to question why there is a talking painting and get right into continuing your mission");
                    System.out.println("You decide to lie, and say that you are a janitor. The painting says, 'You don't look like you're dressed to be a janitor...'");
                    System.out.println("You simply reply that it is your first day on teh job, and that you haven't gotten your uniform yet.");
                    System.out.println("'I'm assigned to the most expensive and desirable objects. To clean them of course... can you direct me?");
                if (chanceOfSurvival(2) == true) {
                    System.out.println("For whatever reason, the paining does not suspect a thing. It offers you advice and says,");
                    System.out.println("'Actually, you can take this key that is behind my back on my frame. I'm not sure what it does, but its yours! You can steal it!");
                }
                System.out.println("'NO' It screams, alerting the gaurds.");
                System.out.println("though you are not arrested, you run away and start over");
            }
            System.out.println("You are arrested.");
            System.out.println("");
            // you talk to it.. 90% chance itll help you, 10 % chance itll scream for the gaurd
            // if it does yell, you have a 25% chance to hide and succeed, 75% chance to escape and start over, and 10% chance the gaurd doesn't hear you
            // if it helps you, it will let you take a key attached to the back of its frame.
        }
        if (inputString == "freak out") {
            // check inventory
            if (User.inventory.contains("Hammer")) {
                if(chanceOfSurvival(3) == true) {
                    System.out.println("Though unessesary and brutal, you destroy the talking painting, revealing the secret key on the back of the frame.");
                    //super.steal.object
                }
                // if it is false, restart
                System.out.println("You fight the painting but it fights back by having the frame explode, as you hit it with your hammer and all the pieces get everywhere.");
                System.out.println("You get one in your eye and scream in pain. You are arrested and taken to the hospital.");
            }
            if (User.inventory.contains("Rope")) {
                if(chanceOfSurvival(0) == true) {
                    System.out.println("Despite all odds, and somehow, you beat the painting with a rope. You come across the hidden key on the back of the portrait.");
                        //super.steal.object

                }
                System.out.println("Why would you even try to attack a painting with a rope. You are arrested and made fun of on twitter.");
            }
            if (User.inventory.contains("Sword")) {
                if(chanceOfSurvival(3) == true) {
                    System.out.println("Before you can even start to slice the painting, it implores you to stop.");
                    System.out.println("It tells you that there is a secret key hidden behind it, and asks you to take the key instead of destroying it.");
                }
                System.out.println("You are caught trying to slice up a painting and arrested.");
            }
            if (User.inventory.contains("Armor")) {
                if(chanceOfSurvival(1) == true) {
                    System.out.println("You throw your armour at the painting, and it hits the hook it hangs on just right.");
                    System.out.println("The painting screams as it falls but once laying flat, it quiets up. There, you see a key hidden on the back of the painting");
                }
                System.out.println("You have panicked and thrown your armor at the painting, causing a scene. You are arrested.");
            }
            //else you try to fistfight
            System.out.println("Since you have no weapons, you awkwardly decide how to deal with a painting that you want to fight.");
            System.out.println("You decide to unhook it and angrily toss it across the room, as it won't stop making an annoying sound");
            System.out.println("As it flies across the room, you notice a key drops.");
        }
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