package day13;

public class Task1 {
	public static void main(String[] args) {
		User user1 = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");
		
		user1.sendMessage(user2, "Hello!");
		user1.sendMessage(user2, "I'm new here, can you help ?");
		user2.sendMessage(user1, "Hello there!");
		user2.sendMessage(user1, "I'm new too!");
		user2.sendMessage(user1, "Ofc! Whatsup?");
		user3.sendMessage(user1, "Hello new user1");
		user3.sendMessage(user1, "Nice to meet you, i'm bot");
		user3.sendMessage(user1, "type /help to print command list");
		user1.sendMessage(user3, "/help");
		user1.sendMessage(user3, "/commands");
		user1.sendMessage(user3, "/exit");
		user3.sendMessage(user1, "bye");
		
		MessageDatabase.showDialog(user1, user3);
	}
}
