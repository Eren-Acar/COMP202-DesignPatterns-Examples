package SingeltonDesignPattern.Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person.Builder().name("Eren").surname("Yilmaz").address("Istanbul").build();
		
		System.out.println(person.getAddress());
		
//		Person person2 = new Person();
//		person2.setName("Eren");
//		person2.setSurname("Yilmaz");
//		
//		System.out.println(person2.getName());
		
	}

}
