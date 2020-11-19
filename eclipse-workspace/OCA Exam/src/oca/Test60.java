package oca;

public class Test60 {
	
	public String name;
	public int moons;
	
	public Test60(String name, int moons) {
		this.name=name;
		this.moons=moons;
	}
	
	public static void main(String[] args) {
		
		Test60 [] planets = {new Test60("Mercury",0),new Test60("Venus",0),
				new Test60("Earth",1), new Test60("Mars",2)};
	System.out.println(planets);
	System.out.println(planets[2]);
	System.out.println(planets[2].moons);			
	}

}
