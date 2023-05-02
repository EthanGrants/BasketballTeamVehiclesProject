/** PlayerMain.java - Basketball Players
 * <p>Problem Statement: Determine the total score that a team of basketball players is likely to score.
 * </p>
 * 
 * <p>Algorithm: <br />
 * 1. Create main class <br/>
 * 2. Create array objects <br/>
 * 3. Create two methods, PrintTeam and CalculateScore <br/>
 * 4. In PrintTeam, print out a structure to list the slot number, player name, score and class <br/>
 * 5. Create a for loop and use ternary operators for the name, score, and class in order to either fill
 *    the column, or leave it empty. Then print it out. <br/>
 * 6. In CalculateScore, create a variable totalScore, set it to 0 <br/>
 * 7. Create a for loop to iterate through the team, adding the scores together, returning the totalScore <br/>
 * 8. In main, print out PrintTeam and then print out the calculated score using the method calculateScore <br/>
 * 9. Compile and test. <br/>
 * </p>
 * 
 *   @author Ethan Grant
 *   @version Module 11, Hw 1
 */
public class PlayerMain
{
    public static void main(String[] args)
    {
        // Create array of objects
        Player[] team = new  Player[10];    
        team[0] = new AllStar("Lebron James");
        team[1] = new Pro("Draymond Green");
        team[2] = new Scrub("Jr Smith");
        team[3] = new Pro("Stephen Curry");
        team[4] = new Scrub("Nikola Jokic");

        // Print out methods
        PrintTeam(team);
        System.out.println("    Total estimated points: " + CalculateScore(team));
    }
    // Methods
    public static void PrintTeam(Player[] team) {
        System.out.printf("%-5s %-15s %6s %-10s\n", "Slot", "Player-Name", "Score", "Class");
        System.out.printf("%-5s %-15s %6s %-10s\n", "----", "-----------", "-----", "-----");

        for (int i = 0; i < team.length; i++) {
            // Create either a slot for a player or an open slot
            String playerName = team[i] != null ? team[i].getName() : "(open)";
            int playerScore = team[i] != null ? team[i].getScore() : 0;
            String playerClass = team[i] != null ? team[i].getClass().getSimpleName() : "";
            // Print it out
            System.out.printf("%-5s %-15s %6s %-10s\n", i+1, playerName, playerScore, playerClass);
        }

    }

    public static int CalculateScore(Player[] team) {
        int totalScore = 0;
        // Loops to gather the total
        for (int i = 0; i < team.length && team[i] != null; i++) {
            totalScore += team[i].getScore();
        }
        return totalScore;
    }
}
