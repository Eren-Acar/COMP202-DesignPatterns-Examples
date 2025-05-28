package StructrualDesignPatterns.Bridge;

public class Main {
	
	public static void main(String[] args) {
		Device device = new TV();
		AdvancedRemote remote1 = new AdvancedRemote(device);

		remote1.volumeUp();
		System.out.println("Volume: " + device.getVolume());
		
		remote1.volumeDown();
		System.out.println("Volume: " + device.getVolume());

	}

}
