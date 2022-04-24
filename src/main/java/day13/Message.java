package day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Message {
	private User sender;
	private User receiver;
	private String text;
	private Date date;
	
	public Message(User sender, User receiver, String text) {
		this.sender = sender;
		this.receiver = receiver;
		this.text = text;
		this.date = new Date();
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
		return "FROM: " + sender +
				"\nTO: " + receiver +
				"\nON: " + sf.format(date) + "\n"+
				text;
	}
}
