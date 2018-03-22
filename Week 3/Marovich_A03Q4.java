/**
 * This program has a parent class and two child classes
 * The RoundShape class sets up our objects and holds our information while
 * Sphere and Cone allow you to manipulate and change that information.
 * @author Donald
 * 
 *Sources: http://www.functionx.com/java/Lesson10.htm 
 *  http://stackoverflow.com/questions/3767365/super-in-java  
 *  https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 *  the book was very helpful
 */
import java.util.*;

public class Marovich_A03Q4 {
    
    public static class RoundShape {
        
        //create our variables, round shapes have all of these!
        double radius, height, area, volume;
        String name;
        
        //Constructor: sets the initial parameters
        public RoundShape(double r) {
            radius = r;
        }
        
        //Mutator to change the radius parameter
        public void setRadius(double r) {
            radius = r;
        }
        
        public double getRadius() {
            return radius;
        }

        public double getHeight() {
            return height;
        }
        
        public double getArea() {
            return area;
        }
        
        public double getVolume() {
            return volume; 
        }
        
        //Prints a string containing all the information stored
        public String toString() {
            return ("Type: " + name + "\t" + "Radius: " + radius + "\t" + 
            "Height: " + height + "\t" + "Volume: " + this.getVolume() + "\t" +
            "Area: " + this.getArea());
        }
    }
    
    //Sphere inherits from RoundShape
    public static class Sphere extends RoundShape {
        
        //Constructor, uses super to access parent class
        //gets the height from the radius by adding them togheter
        //takes 1 variable for the radius
        public Sphere(double r) {
            super(r);
            this.radius = r;
            this.height = r * 2;
            name = "Sphere";
        }
        
        //Calculates the volume and returns result
        public double getVolume() {
            volume = ((4.0/3.0)*Math.PI*(radius*radius*radius));
            return volume;
        }
        
        //Calculates the area and returns result
        public double getArea() {
            area = (4.0*Math.PI*(radius*radius));
            return area;
        }
    }
    
    //Cone inherits from RoundShape
    public static class Cone extends RoundShape {
        
        //Contstructor, uses super to access parent class
        //takes 2 variables for radius and height
        public Cone(double r, double h) {
            super(r); 
            this.radius = r;
            this.height = h;
            name = "Cone";
        }
        
        //Mutator to change the height
        public void setHeight(double h) {
            height = h;
        }
        
        //calculates and returns the volume of the cone
        public double getVolume() {
            volume = ((1.0/3.0)*Math.PI*(radius*radius)*height);
            return volume;
        }
        
        //calculates and returns the area of the cone
        public double getArea() {
            area = (Math.PI*radius*(height+radius));
            return area;
        }
    }    
    
    public static void main(String[] args) {
        
        //Creates two sphere objects and two cone objects
           Sphere sphere1 = new Sphere(2.4);
           Sphere sphere2 = new Sphere(7);
           Cone cone1 = new Cone(13,7);
           Cone cone2 = new Cone(8,9);
        
        //Prints out objects out using RoundShape's toString()
           System.out.println(sphere1);
           System.out.println(sphere2);
           System.out.println(cone1);
           System.out.println(cone2);
           
        //Calls on mutators in respective classes to change parameters
           sphere1.setRadius(4);
           sphere2.setRadius(5);
           cone1.setRadius(36);
           cone2.setHeight(33);
           
           System.out.println("\nChanges have occured to all the objects.\n");
           
        //Prints out objects out using RoundShape's toString() with the different parameters
           System.out.println(sphere1);
           System.out.println(sphere2);
           System.out.println(cone1);
           System.out.println(cone2);
    }
}