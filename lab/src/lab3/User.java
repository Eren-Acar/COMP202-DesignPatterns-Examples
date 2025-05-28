package lab3;

public class User {
	private String name;
    private ChatRoomMediator chatRoom;

    public User(String name, ChatRoomMediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void send(String message) {
        // TODO: Send message via chatRoom
    	System.out.println();
    	System.out.println(name + " sending: " + message);
    	chatRoom.sendMessage(message, this);
    	
    }

    public void receive(String message) {
    	System.out.println();
        System.out.println(name + " received: " + message);
    }

    public String getName() {
        return name;
    }


}
