package abs;

public class CastingFun {
	
	public static void main(String[] args) {
		
		Engineer e1 = new Engineer("Adam",25,101);
		Person p1 = e1;//(Person)e1
		Object o1 = e1;
		Object o2 = p1;
		Engineer e2 = (Engineer)o2;
		e2.design(" spaceship");
		
		((Engineer) o2).design(" pensil");
		
		((Engineer) o1).design(" pen");
		
		Person p2 = (Person) new Engineer("Adam",25,101);
		
		((Person) e1).getAge();
		
		Smarty smarty = new Engineer("Joshua",33,678);
		Engineer sm = (Engineer)smarty;
		Smarty smarty2 = sm;
	}

}
