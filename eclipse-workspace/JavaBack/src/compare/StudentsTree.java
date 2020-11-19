package compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class StudentsTree {

	public static void main(String[] args) {

		TreeSet<Student> people = new TreeSet<>();
		
		Comparator<Student> idCom = Comparator.comparing(w-> w.getId());
       
      
		people.add(new Student(1, "Adam"));
		people.add(new Student(2, "Dave"));
		people.add(new Student(5, "Dave"));
		people.add(new Student(4, "Zain"));
		people.add(new Student(2, "Bob"));
		
		System.out.println(people);
//		
//	Comparator<Student> idCom =  new ComparatorStudent();
//	
//	TreeSet<Student> people2 = new TreeSet<>(idCom);
//	System.out.println(people);
//	//  
//	Comparator<Student> stRev = new ComparatorStudent();
//	Collections.sort(people,stRev);
//	System.out.println(people);
//	//  
//	Comparator<Student> bothCom = idCom.thenComparing(stRev);
//	Collections.sort(people,bothCom);
//	System.out.println(people);
	  
//		  
//		  System.out.println(people);
		
	}
}
