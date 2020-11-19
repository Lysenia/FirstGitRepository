package linkedlist;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueCompare {
	public static void main(String args[]) {
		// Creating empty priority queue
		Planets Jupiter = new Planets( "Jupiter", 8.5, 5);
		Planets Earth = new Planets( "Earth", 4.5, 6);
		Planets Mars = new Planets( "Mars", 6.5, 4);

		PriorityQueue<Planets> pQueue = new PriorityQueue<Planets>();

		// Adding items to the pQueue
		pQueue.add(Jupiter);
		pQueue.add(Earth);
		pQueue.add(Mars);
	
		System.out.print(pQueue);
		System.out.println();
		System.out.println("================================================================");
		// Printing the most priority element
		System.out.println("Head value using peek method:" + pQueue.peek());
		System.out.println("================================================================");

		// Printing all elements
		System.out.println("The queue elements:");
		Iterator itr = pQueue.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println("================================================================");
		// Removing the top priority element (or head) and
		// printing the modified pQueue
		pQueue.poll();
		System.out.println("After removing an element" + "with poll function:");
		Iterator<Planets> itr2 = pQueue.iterator();
		while (itr2.hasNext())
			System.out.println(itr2.next());
		System.out.println("================================================================");
		// Removing Mars
		pQueue.remove(Mars);
		System.out.println("after removing Mars with" + " remove function:");
		Iterator<Planets> itr3 = pQueue.iterator();
		while (itr3.hasNext())
			System.out.println(itr3.next());
		System.out.println("================================================================");
		// Check if an element is present
		boolean b = pQueue.contains("C");
		System.out.println("Priority queue contains C " + "or not?: " + b);
		System.out.println("================================================================");
		// get objects from the queue in an array and
		// print the array
		Object[] arr = pQueue.toArray();
		System.out.println("Value in array: ");
		for (int i = 0; i < arr.length; i++)
			System.out.println("Value: " + arr[i].toString());
	}
}

class Planets implements Comparable<Planets> {
	int size;
	String name;
	double speed;

	public Planets( String n, double g,int i) {
		size = i;
		name = n;
		speed = g;
	}

	public boolean equals(Planets other) {
		return this.size == other.size;
		
	}
@Override
	public int compareTo(Planets other) {
		if (this.equals(other)) {
			return 0;
		} else if (size > other.size) {
			return 1;
		} else {
			return -1;
		}
//		return this.name.compareTo(other.name);
	}

	public String toString() {
		return size + " - " + name + " - " + speed + "  ";
	}

}
