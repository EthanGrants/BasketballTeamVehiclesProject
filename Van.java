/**
 * Van.java - Creating different classes
 * 
 * <p>Problem Statement: Create a  Person, a  Vehicle, and a  Van  (child of  Vehicle)  class. 
 * Exercise many of the methods in all three classes.
 * </p>
 * <p> Instance variables: <br />
 *     double loadCapacity - says how much weight can be held
 *     int cargoSpace - how much room there is in the car
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 2
 */
public class Van extends Vehicle
{
    private double loadCapacity = 0.0;
    private int cargoSpace = 0;

    // Full constructor
    /**
     * Constructs a new Van object with manufacturerName,cylinders,owner, loadCapacity,
     * and cargoSpace
     * Post-condition - object is created
     * @param manufacturer the manufacturer's name
     * @param cylinders number of cylinders
     * @param owner owner of vehcile
     * @param loadCapacity weight that can be held
     * @param cargoSpace room that can be held 
     */
    public Van(String manufacturerName, int cylinders, Person owner, double loadCapacity, int cargoSpace) {
        super(manufacturerName, owner, cylinders);
        this.loadCapacity = loadCapacity;
        this.cargoSpace = cargoSpace;
        if(owner == null) {
            this.setOwner(null);
        }
        else {
            this.setOwner(new Person(owner.getName()));
        }
    }
    // a no-argument constructor which sets all of the instance variables to their default values
    /**
     * Constructs van with provided information 
     * Pre-condition: manufacturerName, cylinders,owner, loadCapacity, and cargoSpace must
     * all must be initialized
     * Post-condition: set instance variables to the following
     */
    public Van() {
        this("",0,null,0.0,0);
    }

    // getters and setters for the load capacity
    /**
     * Gets loadCapacity
     * Pre-condition: loadCapacity must be initialized
     * Post-condition: returns loadCapacity
     * @return loadCapacity
     */
    public Double getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets loadCapacity
     * Pre-condition: loadCapacity must be initialized
     * Post-condition: Sets loadCapacity to provided parameter
     * @param loadCapacity
     */
    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    // getters and setters for cargo space
    /**
     * Gets cargoSpace
     * Pre-condition: cargoSpace must be initialized
     * Post-condition: returns cargoSpace
     * @return cargoSpace
     */
    public int getCargoSpace() {
        return cargoSpace;
    }

    /**
     * Sets cargoSpace
     * Pre-condition: cargoSpace must be initialized
     * Post-condition: Sets cargoSpace to provided parameter
     * @param cargoSpace
     */
    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }
    //a toString method
    /**
     * Return a string of Van information
     * Post-condition: A string of Van information is returned
     * @return the string
     */
    public String toString() {
        return super.toString() + " Load: " + loadCapacity + " Cargo: " + cargoSpace + " cu ft";
    }

    // equals method
    /**
     * Compares Van to another Van object to see if equals
     * Post-condition - return true if objects are equal
     * @param anObject object being used to compare
     * @return true if objects are equal
     */
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        Van other = (Van) obj;
        return loadCapacity == other.loadCapacity && cargoSpace == other.cargoSpace;
    }
}

