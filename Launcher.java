package forTankNew;

public class Launcher {

	public static void main(String[] args) {
		TankNew t1 = new TankNew();
		t1.color = "dark green";
		t1.crew = 3;
		t1.maxSpeed = 55;
		t1.name = "Tank";

		TankNew t2 = new TankNew();
		t2.color = "khaki";
		t2.crew = 4;
		t2.maxSpeed = 60;
		t2.name = "Super tank";

		TankNew t3 = new TankNew();
		t3.color = "white";
		t3.crew = 4;
		t3.maxSpeed = 80;
		t3.name = "Super winter tank";
		
		TankNew.printTankInfo(t1);
		
	}
	
}
