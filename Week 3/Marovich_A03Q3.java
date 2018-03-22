/**
 * Histogram that visually inspects the frequency
 * distribution of a set of values.
 * 
 * @author Donald Marovich
 * Sources: http://stackoverflow.com/questions/23699132/how-to-make-a-menu-until-user-inputs-to-exit
 * http://stackoverflow.com/questions/2426671/variable-length-dynamic-arrays-in-java
 * https://www.youtube.com/watch?v=KCH_ZDygrm4
 * 
 */
import java.util.*;


public class Marovich_A03Q3
{
 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);        
        List<Integer> list = new ArrayList<Integer>();
        boolean found = false;
        int user_guess, quit = 0;
        int[] hist = new int[11];
        
        while (found == false) {
                System.out.print("Enter a value to plot: ");
                user_guess = scan.nextInt();
                
                if (user_guess <= 10 && user_guess > 0) {
                    list.add(user_guess);
                    
                    for (int i = 1; i < 11; i++) {
                        if(user_guess == i) {
                            hist[i] += 1;
                        }
                    }
                }
                else if (user_guess == quit) {
                    System.out.println("You have chosen to stop entering numbers.");
                    System.out.println("Your numbers are: " + list);
                    found = true;
                }
                else if (user_guess > 10 || user_guess < 0) {
                    System.out.println("Please enter 1-10 only and 0 to stop.");
                }
        }
        
        for (int i=1; i < 11; i++){
            String hash = "#";
            String result = "";
            System.out.print(i + " | ");
                for (int j = 0; j < hist[i]; j++) {
                    System.out.print(hash);
                }
            
            System.out.println();
        }
    }
    
    
        
}
