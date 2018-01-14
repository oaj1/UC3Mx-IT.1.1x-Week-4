/**
 * Main class of the Java program.
 */

public class Car {

	
	/**
     * The car color
     */
	String color;
	
	/**
     * If lights are turned on is true, false otherwise
     */
	boolean lights;
	
	/**
     * Creates a new car
     *
     * @param c  the car color
     * @param l  the state of the car lights
     */
	public Car(String c, boolean l){
	    
	    color = c; //color is assigned the arguement passed to parameter c
	    lights = l;//lights is assigned the arguement passed to parameter l
	    
	}
	
	public void printCarInformation(){
	    String state = "";
	    if(lights){
	        state = "on";
	    }else{
	        state = "off";
	    }
	    System.out.println("This car is "+color+" and lights are "+state);
	}
	
	
	public static void main(String[] args) {
		Car c = new Car("green",true);
		System.out.println("We have created a car!");
		c.printCarInformation();
	}
}