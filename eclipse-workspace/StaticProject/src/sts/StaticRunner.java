package sts;

public class StaticRunner {
	
	public static void main (String args[]) {
		
		Persona p1 = new Persona();
		p1.name = "Adam";
		
		Persona.species = "Human";
		

		Persona p2 = new Persona();
		p2.name = "Eve";
		
	System.out.println(p1.name);
	System.out.println(p2.name);
	
	System.out.println(Persona.species);
	
	System.out.println(p1.species);
	
	p1.species = "Humanoid";
	
	System.out.println(p2.species);
	}

}
