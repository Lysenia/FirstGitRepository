package rev;

public class DogGenerator {
	public static void main(String args[]) {
		
		
		
		String names [] = {"Jessie", "Vikie", "Lucie", "Titi", "Momo"};
int sizes [] = {12, 34, 9, 23, 40};
Dog manyDogs [] = new Dog[5]; 

for (int i=0; i< manyDogs.length; i++) {
	manyDogs[i]=new Dog(); 
	manyDogs[i].name = names[i];
	manyDogs[i].size = sizes[i];
	
}
for(Dog eachDog: manyDogs) {
	eachDog.bark();
	System.out.println(eachDog.play("park"));
	
}


}
}

