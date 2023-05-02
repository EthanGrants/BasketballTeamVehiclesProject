
/**
 * Pro.java - Basketball Players
 * 
 * <p>Problem Statement: Determine the total score that a team of basketball players is likely to score.
 * </p>
 * <p> Instance variables: <br />
 *     String name = inherits name from Player
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 1
 */
public class Pro extends Player
{
    // constructors, takes parents name and passes it to parent class constructor
    /**
     * Constructs a new Pro object with name
     * Pre-condition: name must be initialized
     * Post-condition - Pro object is created with name
     * @param name name of player
     */
    public Pro(String name) {
        super(name);
    }

    /**
     * Get score of Pro player
     * Post-condition: Score of the Pro player is returned
     * @return int of the score of the Pro player
     */
    // get the score
    public int getScore() {
        return 20;
    }

    // return a string of provided information
    /**
     * Return a string of Pro player information
     * Post-condition: A string of Pro player information is returned
     * @return the string
     */
    public String toString() {
        return "Pro: " + getName() + "  Score: " + getScore();
    }
}
