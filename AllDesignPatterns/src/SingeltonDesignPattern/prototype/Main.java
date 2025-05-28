package SingeltonDesignPattern.prototype;

public class Main {
	
	public static void main(String[] args) {
		Player player = new Player("John", 5);
		System.out.println(player.getName() + " " + player.getLevel());

		Player player2 = player.clone();
		System.out.println(player2.getName() + " " + player2.getLevel());
	
		Player player3 = player;
		
		player3.setName("Jane");
		player3.setLevel(7);
		
		System.out.println(player3.getName() + " " + player3.getLevel());
		System.out.println(player.getName() + " " + player.getLevel());
		
		
		player2.setName("Doe");
		player2.setLevel(10);
		
	
		System.out.println(player2.getName() + " " + player2.getLevel());
	}

}
