/**
 * A class to simulate rolling many dice and finding the ratio of snake eyes.
 * 
 * @author Lewis et al., CST200 team.
 * Edited by: Donald Marovich
 * Sources: Discussion board
 */

public class Marovich_A03Q2 {
    
    //Note: you should not need to change the Die class.
    public static class Die {
        
        private final int MAX = 6;
        private int faceValue;
        
        public Die() {
            faceValue = 1;
        }
        public int roll() {
            faceValue = (int)(Math.random() * MAX) + 1;
            
            return faceValue;
        }
        
        public void setFaceValue(int value) {
            if(value > 0 && value <= MAX)
                faceValue = value;
        }
        
        public int getFaceValue() {
            return faceValue;
        }
        
        public String toString() {
            String result = Integer.toString(faceValue);
            
            return result;
        }
    }    
    
    public static class PairOfDice {     
        
        //method to return the current sum of the two die values
        private Die die1;
        private Die die2;
        int sum;
        
        //Contructor: initiates our dice
        public PairOfDice() {
            die1 = new Die();
            die2 = new Die();
        }   
        
        //Rolls the dice by calling methods in the Die class
        public void rollDice(){
            die1.roll();
            die2.roll();
        }
        
        //Gets the die1 facevalue by calling the getFaceValue method in Die
        public int getDie1() {
            return (die1.getFaceValue());
        }
        
        //Gets the die2 facevalue by calling the getFaceValue method in Die
        public int getDie2() {
            return (die2.getFaceValue());
        }
        
        //Sets the die1facevalue by calling the setFaceValue method in Die
        public void setDie1(int value) {
            die1.setFaceValue(value);
        }
        
        //Sets the die2facevalue by calling the setFaceValue method in Die
        public void setDie2(int value) {
            die2.setFaceValue(value);
        }
        
        //Method that returns the current sum of the two die values
        public int getSum() { //I laughed at the class name
            sum = die1.getFaceValue() + die2.getFaceValue();
            return sum;
        }
    }

    public static void main(String[] args) {
        final int ROLLS = 500;
        int count = 0;
        int dieRollcount = 0;
        
        //Initialize the pair of dice method
        PairOfDice die1;
        
        
        for(int roll = 0; roll <= ROLLS; roll++)
        {
            //TODO: roll the die pair and count the number of snake eyes.
            //      snake eyes occur when both dice roll one.
            
            
            die1 = new PairOfDice();
            die1.rollDice();
            /*Uncomment if you want to see what is going on in the background
            //System.out.println("Die Roll: " + dieRollcount + "\t" + die1.die1 + "\t" + die1.die2 +
                               "\t" + "The sum is: " + die1.getSum());
            */
            dieRollcount++;
            
            if ((die1.getDie1()) == 1 && (die1.getDie2()) == 1) {
                count++;
            }
        }
        
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + count);
        System.out.println("Ratio: " + (double)count / ROLLS);
    }
    
}