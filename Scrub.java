
/**
 * Scrub.java - Basketball Players
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
public class Scrub extends Player
{
    // constructors, takes parents name and passes it to parent class constructor
    /**
     * Constructs a new Scrub object with name
     * Pre-condition: name must be initialized
     * Post-condition - Scrub object is created with name
     * @param name name of player
     */
    public Scrub(String name) {
        super(name);
    }

    // get the score
    /**
     * Get score of Scrub player
     * Post-condition: Score of the Scrub player is returned
     * @return int of the score of the Scrub player
     */
    public int getScore() {
        return 10;
    }

    // return a string of provided information
    /**
     * Return a string of Scrub player information
     * Post-condition: A string of Scrub player information is returned
     * @return the string
     */
    public String toString() {
        return "Scrub: " + getName() + "  Score: " + getScore();
    }
}
