package lab3;

import java.util.List;

public class ChatRoom implements ChatRoomMediator {
	// TODO: Maintain a list of users and send messages to all except sender
	private List<User> users;
	
	public ChatRoom(List<User> users) {
		this.users = users;
	}
	
	@Override
	public void sendMessage(String message, User sender) {
		for (int i = 0; users.size() > i; i++) {
			User user = users.get(i);
			if (user != sender) {
				user.receive(message);
				
			} 
			else {
				System.out.println("aaaaaa");
			}
		}
	}
	
	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println(user.getName() + " added to chat room.");
		
	}
	
	
	

}
