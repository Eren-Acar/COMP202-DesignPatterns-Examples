package BehavioralDesignPatterns.Observer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated metşturhod stub
		User user1 = new User("John");
		User user2 = new User("Jane");

		YoutubeChannel channel = new YoutubeChannel("Tech Channel");
		YoutubeChannel channel2 = new YoutubeChannel("Cooking Channel");

		user1.followChannel(channel);
		user2.followChannel(channel);
		
		user1.followChannel(channel2);
		
		user2.followChannel(channel2);
		
		channel.setState("New video on Java Generics!");

		channel.setState("New video on Java Design Patterns!");

		channel.detach(user1);

		channel.setState("New video on Java Streams!");

	}
}
