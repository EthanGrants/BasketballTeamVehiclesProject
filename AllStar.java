
/**
 * AllStar.java - Basketball Players
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
public class AllStar extends Player
{
    // constructors, takes parents name and passes it to parent class constructor
    /**
     * Constructs a new AllStar object with name
     * Pre-condition: name must be initialized
     * Post-condition - AllStar object is created with name
     * @param name name of player
     */
    public AllStar(String name) {
        super(name);
    }

    /**
     * Get score of AllStar player
     * Post-condition: Score of the AllStar player is returned
     * @return int of the score of the AllStar player
     */
    // get the score
    public int getScore() {
        return 30;
    }

    /**
     * Return a string of AllStar information
     * Post-condition: A string of AllStar information is returned
     * @return the string
     */
    // return a string of provided information
    public String toString() {
        return "All-Star: " + getName() + "  Score: " + getScore();
    }
}