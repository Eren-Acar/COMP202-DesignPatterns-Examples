package BehavioralDesignPatterns.Visitor;
import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		Map map = new Map();
		map.addNode(new Hospital(123.0, 456.0, LocalDate.now()) );
		map.addNode(new School(123.0, 456.0, "www.example.com") );
		
		MapVisitor visitor = new MapVisitor();
		String xml = visitor.exportAsXML(map);
		
		System.out.println(xml);
		

}
}
