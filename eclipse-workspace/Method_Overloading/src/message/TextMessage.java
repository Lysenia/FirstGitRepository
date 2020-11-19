package message;

public class TextMessage extends Message {

	public TextMessage() {
		setType("textMessage");
	}
	
	public TextMessage(String sender, String receiver, String messageBody) {
		setType("TextMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
	
	public void reply(String messageBody) {
		String receiver = getReceiver();
		setReceiver(getSender());
		setSender(receiver);
		
		setMessageBody(messageBody);
		send();
	}
}
