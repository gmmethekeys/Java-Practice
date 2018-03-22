//Sources:
//http://stackoverflow.com/questions/290884/what-is-the-reason
//-behind-non-static-method-cannot-be-referenced-from-a-static
//Week 3 discussion board, textbook, and videos
import java.lang.Math;

public class Marovich_A03Q1
{
   //creates our class for Cylinder
   public static class Cylinder {
       
       // instance data
       private double radius,height;
       
       //constructor: sets initial parameters
       public Cylinder(double radius, double height) {
           this.radius = radius;
           this.height = height;
       }
       
       //area formula method
       public double getArea() {
           double area = ((Math.PI*radius*height*2)+(Math.PI*(Math.pow(radius,2)*2)));
           return area;
       }
       
       //volume formula method
       public double getVolume(){
           double volume = ((Math.pow(radius,2))*Math.PI*height);
           return volume;
       }
       
       //Accessor Method called that will return you the current radius
       public double getRadius(){
           return radius;
       }
       
       //Accessor Method called that will return the current height  
       public double getHeight(){
           return height;
       }
       
       //Mutator Method used to set new radius
       public void setRadius(double r){
           radius = r;
       }
        
       //Mutator Method used to set new height
       public void setHeight(double h){
           height = h;
       }
       
       //Automatically prints when called
       //This will call on the getVolume() and getArea() methods
       public String toString(){
           return ("Radius: " + radius + "\t" + "Height: " + height + "\t" + 
           "Volume: " + getVolume() + "\t" + "Area: " + Double.toString(getArea()));
       }
   }
   
   public static void main(String[] args){
       
       //Create our four cylinder obects with random parameters
       Cylinder one = new Cylinder((Math.random()*10),(Math.random())*10);
       Cylinder two = new Cylinder((Math.random()*10),(Math.random())*10);
       Cylinder three = new Cylinder((Math.random()*10),(Math.random())*10);
       Cylinder four = new Cylinder((Math.random()*10),(Math.random())*10);
       
       //Automatically calls the toString method
       System.out.println(one);
       System.out.println(two);
       System.out.println(three);
       System.out.println(four);
       
       //Calls set methods to change object parameters
       one.setRadius(3);
       two.setHeight(4);
       three.setRadius(2);
       four.setHeight(1);
       
       //Prints the new object results with the newest parameters
       System.out.println(one);
       System.out.println(two);
       System.out.println(three);
       System.out.println(four);       
   }          
}
