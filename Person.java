
/**
 * Person.java - Creating different classes
 * 
 * <p>Problem Statement: Create a  Person, a  Vehicle, and a  Van  (child of  Vehicle)  class. 
 * Exercise many of the methods in all three classes.
 * </p>
 * <p> Instance variables: <br />
 *     String name - name of who owns the car
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 2
 */
public class Person
{
    private String name;
    //a constructor which takes a String parameter and sets the instance variable name to the value of the parameter
    /**
     * Constructs a new Person object with name
     * Pre-condition: name must be initialized
     * Post-condition - Peron object is created with name
     * @param name name of player
     */
    public Person(String name) {
        this.name = name;
    }
    //a no-argument constructor which sets the instance variable name to the String "(no name)"
    /**
     * Constructors person with no name
     * Pre-condition: name must be initialized
     * Post-condition - sets it as no name
     */
    public Person() {
        this.name = "(no name)";
    }
    /**
     * Gets name of Person
     * Pre-condition: name must be initialized
     * Post-condition: returns name
     * @return the name of Person
     */
    //a getter name instance variable
    public String getName() {
        return name;
    }
    /**
     * Sets name of Person
     * Pre-condition: name must be initialized
     * Post-condition: Sets name to provided parameter
     * @param name of Person
     */
    //a setter for the name instance variable
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Return a string of player information
     * Post-condition: A string ofplayer information is returned
     * @return the string
     */
    // a toString method which returns a String similar to: Name: <name>.
    public String toString() {
        return "Name: " + name;
    }
    //an equals method
    /**
     * Compares Person to another Person object to see if equals
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
        Person otherPerson = (Person) anObject;
        return (name.equals(otherPerson.name));
    }
}
