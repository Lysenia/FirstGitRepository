package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	
		    
		 public static void main(String[] args) {
			    
		     List<Student> people = new ArrayList<>();
		     people.add(new Student(1,"Adam"));
		     people.add(new Student(2,"Dave"));
		     people.add(new Student(5,"Dave"));
		     people.add(new Student(4,"Zain"));
		     people.add(new Student(2,"Bob"));
		  
		//  Comparator<Student> idCom =  new IdComparator();
		//  Collections.sort(people,idCom);
		//  System.out.println(people);
		//  
		//  Comparator<Student> stRev = new ReversedNameComparator();
		//  Collections.sort(people,stRev);
		//  System.out.println(people);
		//  
		//  Comparator<Student> bothCom = idCom.thenComparing(stRev);
		//  Collections.sort(people,bothCom);
		//  System.out.println(people);
		  
		  Comparator<Student> lCom = Comparator.comparing(s-> s.getId());
		  Comparator<Student> nCom = Comparator.comparing(p-> p.getName());
		  
		  Collections.sort(people,nCom.reversed());
		  System.out.println(people);
		  
		  //TreeSet<Student> ts = new TreeSet<>();
		  
		  
		  
		  // Task 2  
		  // Create a class called ReversedNameComparator
		  // and add your compare logic inside 
		  // sort your list of Student 
		    
		    
		  }
		  
		  
		  
		}
