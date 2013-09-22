package com.fg;

public class MessagePropogation {

	private String message;
	private String setterMsg;
	
	public MessagePropogation(String message){
		this.message = message;
	}
	
	public MessagePropogation(){
		
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}

	public String getSetterMsg() {
		return setterMsg;
	}

	public void setSetterMsg(String setterMsg) {
		this.setterMsg = setterMsg;
	}	
	

}
