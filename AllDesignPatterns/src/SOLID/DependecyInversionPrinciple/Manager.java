package SOLID.DependecyInversionPrinciple;

import java.util.List;

public class Manager {
//	List<Developer> developers;
//	List<Tester> testers;
//	
//	public void addDeveloper(Developer developer) {
//		// add developer
//		developers.add(developer);
//	}
//	
//	public void addTester(Tester tester) {
//		// add tester
//		testers.add(tester);
//	}
	
	List <IPersonel> personels;
	
	public void addPersonel(IPersonel personel) {
		personels.add(personel);
	}
}
