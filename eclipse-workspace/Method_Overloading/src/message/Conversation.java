package message;

import java.util.ArrayList;
import java.util.List;

public class Conversation {
	
	public static void main(String args[]) {
		List<String> msg = new ArrayList<>();
		msg.add("Hello");
		msg.add("Hi");
		msg.add("How are you? What are you doing");
		msg.add("I'm fine, coding Java. What about you?");
		msg.add("Also learning Java and eating banana");
		msg.add("share some fancy code, if you wrote");
		msg.add("sure. Public class A extends B");
		msg.add("cool!  Do not forget private members are not inherited");
		msg.add("yes, but protected and public are always inherited");
		msg.add("and default members are also inherited if both classes are in the same packeg");
		msg.add("bye");
		
		IMessage imessage = new IMessage("Sara","Fatime", msg.get(0));
		imessage.send();
		
		for(int i=1; i<msg.size(); i++) {
			imessage.reply(msg.get(i));
			
			
		}
		
		
	
				
		
	}

}
