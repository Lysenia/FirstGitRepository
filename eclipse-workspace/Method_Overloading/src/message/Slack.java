package message;

public class Slack {

	public static void main(String args[]) {
		TextMessage st1 = new TextMessage();
		st1.send();
		
		TextMessage st2 = new TextMessage("Kevin", "Scott", "hi! how is it going?");
		st2.send();
		
		IMessage im1 = new IMessage("Adam", "Eve", "hope to see you soon");
		im1.send();
		
		VoiceMessage v1 = new VoiceMessage("Lora", "Philipp", "I love you");
		v1.send();
		
		st2.reply("I'm fine, and you?");
		
		Message msg = new Message();
		msg.setSender("John");
		msg.setReceiver("Bob");
		msg.setMessageBody("Good morning");
	
		msg.send();
	
	}
}
