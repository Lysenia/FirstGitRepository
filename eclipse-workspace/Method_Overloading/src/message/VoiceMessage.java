package message;

public class VoiceMessage extends Message {

	public VoiceMessage() {
		setType("iMessage");
	}
	
	public VoiceMessage(String sender, String receiver, String messageBody) {
		setType("voiceMessage");
		setSender(sender);
		setReceiver(receiver);
		setMessageBody(messageBody);
	}
}

