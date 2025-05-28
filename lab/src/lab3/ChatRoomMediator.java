package lab3;

public interface ChatRoomMediator {
	void sendMessage(String message, User sender);
    void addUser(User user);

}
