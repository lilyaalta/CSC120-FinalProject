# CSC120-FinalProject

## Deliverables:
 - Your final codebase (see code)
 - Your revised annotated architecture diagram (see file attached on gradescope)
 - Design justification (including a brief discussion of at least one alternative you considered)

Main:
    The main class has a scanner where it calls methods from each class based on the input of the user. For this code, it was recommended by Jordan to use a switch case. However, we felt it would have been too limiting since the switch case needed an exact phrase and not let the user type a bit more freely. For example, if a user wanted some help, if a switch case was used then the user would have to type in exactly “help.” With our .contains() method, the user could type in “help me please” or “pls helppp” which felt more user-friendly. 
Map:
        The Map class allows the user to move throughout the map, tracks where the user is, and prints statements depending on where the user is. The playerGo() method calls the getSpot() to check if the user will not fall off the map, then uses a bunch of nested if statements and else if statements to figure out what the user’s next step is. All the methods are public and static so they can all interact with the other classes. The initial player positions are private so the initial positions cannot be changed directly.  
Character:
    This file holds important information regarding the characters of which the user can interact with. When the user lands on the spot labeled “Knight” or “Painting, ” the information runs through the Map file, and is directed to the character file. The character is introduced with some print statements, and the user has two options: fight, or talk. For each option, there is a chance that the user will get caught and have to start over. This is determined by the chanceOfSurvival() method, where a random number is generated, and depending on the initial input 0-3, there is an “x” chance of returning true or false. For example, an input of 0 is a very low chance of true, where the generated number must be equal to or below 1. This helped determine the level of difficulty for each battle or discussion with the characters. If you talk to the painting, you have a very high chance of returning true, or being safe. If you talk to the knight, you have a lower chance of being safe. This also applies to the weapons the user has… if the user fights with a rope rather than a sword against the knight, they are more likely to fail. As well, these characters drop/give items to steal. Since there are options of interaction within the game, and using multiple scanners and closing them gets unnecessary complicated, we had divided the initial “knight” function, which originally contained both options as if statements, into “knightTalk” or knightFight.” This allowed for both a visually easier digestible code and the use of one scanner.
User: 
    The user file contains the user-focused methods of the game interaction. Here, the inventory and satchel, both of which are used to store objects the user takes, are initialized. As well, the take, steal, drop, and viewInventory methods are there. Take and steal are two different methods for the sake of their separate inventories and the limitations surrounding them. The regular inventory is only allowed one object at a time… either the sword or rope. This helps create a random feel to the game, as the user has a 50% chance of finding the rope first, and a 50% chance of finding the knight first, where the rope versus the knight has a low survival chance. As well, they have to make the decision if they want to keep the rope of sword when faced with the chance that they may already have a rope in their inventory but come across the sword. Which one is a better choice to take… that is the user’s choice and there is no right answer. The steal method is used to put things in the satchel, such as the key to escape and the scroll/necklace which can be taken from the characters. There is no limitation since part of the goal is to steal and the other is to leave. The drop method is mainly for dropping weapons to switch to another weapon, but could also be used to drop the stolen items. viewInventory() is just to see what the user has.
 - A map of your game's layout (if applicable)
    (see cheatsheet)
 - `cheatsheet.md`
    (see cheatsheet)
 - Completed `rubric.md`
    (done!)
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
    The approach to this project was sectioning off certain classes in our game and having each member focus on that class. Then we would bring them all together in the Main class to play the game. Dumping code first and then figuring out how to make it efficient was our overall approach as well. In taking this “brain dump” approach, we were able to refine our ideas and be flexible when issues arose, as we were not tied down to certain methods having to be a certain way.

 - What **new thing(s)** did you learn / figure out in completing this project?
    We learned how to use a nested string to make a map where we could track its coordinates and be able to assign certain spots as keywords that made sense for the storyline. We also used a switch case in the checkRoom method to identify what each word placed in the map made sense. We were also able to better understand the scanner and how it works across different files/classes. This allowed for a fully, continuously interactive game.

 - Is there anything that you wish you had **implemented differently**?
    The map was placed in the main class but it would have made more sense to place it in the Map class. For simplicity, it was put in the main class. There had also been a plan to make different rooms and different maps for each room, so a lot of the classes have a parameter of a room but ultimately, we only had one room. As well, at the end of the game, we were debating if you had to interact with both the painting and knight to escape, but decided on just needing a key. If we had gone that route, it may have been harder to win, but maybe that could be a good thing. 

 - If you had **unlimited time**, what additional features would you implement?
    If given unlimited time, multiple rooms and doors would be allocated to moving on to a new room. In the early planning, there were multiple rooms and vents the user could crawl through to end up on opposite sides of that map. There were also more characters and storylines, but they were ultimately not in the final codebase.

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
    The most helpful feedback was from the 120 TA Bobi. Bobi was really helpful when learning how to track the coordinates of the user, as well as explaining the nested string. She answered our DM’s and helped us clean up our code in the coming days of demo day.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
    Lily: 
        The advice I would give would be to not get too far ahead of myself. I was trying to focus on the more complex code and I think once I focused more on the basics, the coding got easier.
	Abby: 
        I would tell myself that even though it seems very overwhelming and with no direction, just scanning what you have or looking at the plans can help alleviate that anxiety. As well, try not to aim too big in terms of plans, as we only have a few weeks to do this and coding is always more intensive that you anticipate.

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
    Lily: 
        I think both of us contributed to all the classes, but my main focus was the Main and Map classes. I was more focused on how to make the user move throughout the map, as well as having the user have more freedom of what they could input. I also focused on finding keywords in spots, as well as tracking the coordinates of the user.
	Abby: 
        We worked very well together in that we were both open to new ideas regarding the map layout, new methods, a storyline, etc as we were working. We were able to make sure our classes that we specialized in worked well together and in alignment with our overall idea. I focused on the Character class and the User class, and we both helped in reviewing each others code. Being with a partner or in a group always helps to make projects less intimidating, and having two brains is better than one!

