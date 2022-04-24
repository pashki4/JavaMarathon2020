package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
	private static List<Message> messages = new ArrayList<>();

	public static void sendMessage(User u1, User u2, String text) {
		Message message = new Message(u1, u2, text);
		messages.add(message);
	}

	public static List<Message> getMessages() {
		return messages;
	}

	public static void showDialog(User u1, User u2) {
		List<Message> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (Message message : messages) {
			if ((message.getSender().equals(u1)
					&& message.getReceiver().equals(u2))
					|| (message.getSender().equals(u2)
							&& message.getReceiver().equals(u1))) {
				list.add(message);
			}
		}
		for (Message message : list) {
			sb.append(message.getSender().getName())
			   .append(": ")
			   .append(message.getText())
			   .append("\n");
		}
		System.out.print(sb);
	}
}
