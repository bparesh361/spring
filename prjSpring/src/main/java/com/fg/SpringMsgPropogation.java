package com.fg;

public class SpringMsgPropogation {

	private MessagePropogation messagePropogation;

	public MessagePropogation getMessagePropogation() {
		return messagePropogation;
	}

	public void setMessagePropogation(MessagePropogation messagePropogation) {
		this.messagePropogation = messagePropogation;
	}
	
	public void hello(){
		System.out.println("Hello....");
//		throw new RuntimeException("exception throwing explicitly...");
	}
	
	
}
