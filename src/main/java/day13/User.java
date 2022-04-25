package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private List<User> subscriptions;

	public User(String name) {
		super();
		this.name = name;
		this.subscriptions = new ArrayList<>();
	}

	public void subscribe(User user) {
		this.subscriptions.add(user);
	}

	public boolean isSubscribed(User user) {
		return this.subscriptions.contains(user);
	}

	public boolean isFriend(User user) {
		return this.isSubscribed(user)
				&& user.isSubscribed(this);
	}

	public void sendMessage(User receiver, String text) {
		MessageDatabase.sendMessage(this, receiver, text);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<User> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(List<User> subscriptions) {
		this.subscriptions = subscriptions;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}
