
/**
 * Player.java - Basketball Players
 * 
 * <p>Problem Statement: Determine the total score that a team of basketball players is likely to score.
 * </p>
 * <p> Instance variables: <br />
 *     String name = name for the players
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 1
 */
public class Player
{
    private String name;

    // a constructor which sets the player's name
    /**
     * Constructs a new Player object with name 
     * Post-condition - Sets the instance variable
     * @param name name of player
     */
    public Player(String name) {
        this.name = name;
    }

    // getter for the name instance variable
    /**
     * Get name of player
     * Pre-condition - name must be initialized
     * Post-condition - name of the player is returned
     * @return string of the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of player
     * Post-condition - Sets the name to the provided parameter
     * @param name the new name of player
     */
    // setter for the name instance variable
    public void setName(String name) {
        this.name = name;
    }

    // a method named getScore which simply returns 0
    /**
     *  Returns score of player
     *  Post-condition - return 0
     *  @return score of player
     */
    public int getScore() {
        return 0;
    }

    /**
     * Return a string of player information
     * Post-condition: A string of player information is returned
     * @return the string
     */
    //a toString method which returns the player's name and score
    public String toString() {
        return "Player name: " + name + ", Score: " + getScore();
    }

    //a "new-and-improved" equals method
    /**
     * Compares player to another object to see if equals
     * Post-condition - return true if objects are equal
     * @param anObject object being used to compare
     * @return true if objects are equal
     */
    public boolean equals(Object anObject) {
        if (anObject == null) {
            return false;
        }
        if (getClass() != anObject.getClass()) {
            return false;
        }
        Player otherPlayer = (Player) anObject;
        return (name == otherPlayer.name);
    }
}

