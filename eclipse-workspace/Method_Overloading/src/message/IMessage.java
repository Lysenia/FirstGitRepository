package message;

public class IMessage extends Message {

	public IMessage() {
		setType("iMessage");
	}
	
	public IMessage(String sender, String receiver, String messageBody) {
		setType("iMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
}
