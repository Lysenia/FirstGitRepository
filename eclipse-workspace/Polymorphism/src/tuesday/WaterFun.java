package tuesday;

public class WaterFun {
	
	public static void main(String args[]) {
		
		Boat sail = new SailBoat();
		sail.aFloat();
		sail.move();
		
		
		Boat row = new RowBoat();
		row.aFloat();
		row.move();
		
		Boat b3 = sail;
		
		
		
	
		Boat boat[] = new Boat[3];
		
		boat[0] = sail;
		boat[1] = row;
		boat[2] = b3;
		
		for(int i=0; i<boat.length; i++) {
			boat[i].move();
		}
			
		Floatable f1 = new SailBoat();
		f1.aFloat();
		
		Floatable f2 = new RowBoat();
		f2.aFloat();
		
		
		Floatable f3 = new Duck();
		f3.aFloat();
		
		Floatable f4 = new SeaPlane();
		
		
		Floatable[] floatingThings = new Floatable [] {f1,f2,f3,f4};
		
		for(Floatable each:floatingThings) {
			each.aFloat();
		}
		

	}
}