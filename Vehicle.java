
/**
 * Vehicle.java - Creating different classes
 * 
 * <p>Problem Statement: Create a  Person, a  Vehicle, and a  Van  (child of  Vehicle)  class. 
 * Exercise many of the methods in all three classes.
 * </p>
 * <p> Instance variables: <br />
 *     String manufacturerName - Says who the manufacturer is
 *     int cylinders - How many cylinders are in the car
 *     Person owner - who owns the car 
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 2
 */
public class Vehicle extends Person
{
    //instance variables
    private String manufacturerName;
    private int cylinders = 0;
    private Person owner;
    //a full constructor
    /**
     * Constructs a new Vehicle object with manufacturerName,cylinders,and namee
     * Post-condition - object is created
     * @param manufacturer the manufacturer's name
     * @param cylinders number of cylinders
     * @param owner owner of vehcile
     */
    public Vehicle(String manufacturerName, Person owner, int cylinders) {
        this.manufacturerName = manufacturerName;
        this.cylinders = cylinders;
        if (owner == null) {
            this.owner = null;
        }
        else {
            //create a new  Person  object with the same name.
            this.owner = new Person(owner.getName());
        }
    }
    //a no-argument constructor
    /**
     * Constructs vehicle with provided information 
     * Pre-condition: manufacturerName, cylinders, and owner all must be initialized
     * Post-condition: set instance variables to the following
     */
    public Vehicle() {
        this.manufacturerName = "";
        this.cylinders = 0;
        // sets the owner to the empty string
        this.owner = new Person();
    }
    //a toString method
    /**
     * Return a string of Vehicle information
     * Post-condition: A string of Vehicle information is returned
     * @return the string
     */
    public String toString() {
        return "Vehicle mfgr: " + manufacturerName + " Cylinders: " + cylinders + " Owner:" + owner.getName();
    }
    
    // getter and setter for owner
    /**
     * Gets owner of vehicle
     * Pre-condition: owner must be initialized
     * Post-condition: returns owner of vehicle
     * @return owner of vehicle
     */
    public Person getOwner() {
        return owner;
    }
    /**
     * Sets owner of vehicle
     * Pre-condition: owner must be initialized
     * Post-condition: Sets owner to provided parameter
     * @param owner of vehicle
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    
    //getter and setter for manufacturerName
     /**
     * Gets manufacturer name
     * Pre-condition: manufacturerName must be initialized
     * Post-condition: returns manufacturerName
     * @return manufacturerName
     */
    public String getManufacturerName() {
        return manufacturerName;
    }
    
    /**
     * Sets manufacturer name
     * Pre-condition: manufacturerName must be initialized
     * Post-condition: Sets manufacturerName to provided parameter
     * @param manufacturerName
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    //getter and setters for cylinders
     /**
     * Gets cylinders
     * Pre-condition: cylinders must be initialized
     * Post-condition: returns cylinders
     * @return cylinder
     */
    public int getCylinders() {
        return cylinders;
    }
    /**
     * Sets cylinders
     * Pre-condition: cylinders must be initialized
     * Post-condition: Sets cylinders to provided parameter
     * @param cylinders
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    // equals method
    /**
     * Compares Vehicle to another Vehicle object to see if equals
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
        Vehicle otherVehicle = (Vehicle) anObject;
        return (manufacturerName == otherVehicle.manufacturerName)
        && cylinders == otherVehicle.cylinders
        && owner.getName().equals(otherVehicle.owner.getName());
    }

}
