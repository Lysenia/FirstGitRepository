package message;

public class Message {

	private String sender;
	private String receiver;
	private String type;
	private String messageBody;
	
	{
	sender = "unknown";
	receiver = "unknown";
	type = "unknown";
	messageBody = "";
	}
	
	public String getSender() {
		return sender;
	}



	public void setSender(String sender) {
		this.sender = sender;
	}



	public String getReceiver() {
		return receiver;
	}



	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getMessageBody() {
		return messageBody;
	}



	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	
	public void send() {
		
		if(sender.equals("unknown") || receiver.equals("unknown") || messageBody.isEmpty() ) {
			System.out.println("Error: Message sending failed");
			return;
		}
		
		String str = "Message Sent Successfully: \n" +
		           "[Sender="+sender+"]\n" +
		           "[Receiver="+receiver+"]\n" +
		           "[Type="+type+"]\n" +
		           "[MessageBody="+messageBody+"]\n";
		    System.out.println(str);
		  }
	
	public void reply(String messageBody) {
		String receiver = getReceiver();
		setReceiver(getSender());
		setSender(receiver);
		
		setMessageBody(messageBody);
		send();
	}

	}

