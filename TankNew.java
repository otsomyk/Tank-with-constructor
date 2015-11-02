package forTankNew;

public class TankNew {
	public String color;
	public int crew;
	public int maxSpeed;
	public String name;

	public void Tank(String color, int crew, int maxSpeed, String name) {
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
		this.name = name;
	}	
	
	public String toString()
	{
		return "Tank color: " + color + ", crew: " + crew + ", max speed: " + maxSpeed + " km/h" + 
				", name: " + name;
	}
	public void printSelf()
	{
		System.out.println(toString());
	}
	
	
	public static void printTankInfo (TankNew t){
		System.out.println("Tank name: " +  t.name +  ", Tank color: " + t.color + ", Tank crew: " + t.crew + 
				", tank max speed: " + t.maxSpeed + "km/h");				
	}
}
