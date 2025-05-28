package StructrualDesignPatterns.Bridge;

public class Remote {
	protected Device device;
	//private String channel;
	
	public Remote(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		if (device.isEnabled()) {
			device.disable();
		} else {
			device.enable();
		}
	}
	
	public void volumeUp() {
		if (device.getVolume() < 100) {
			device.setVolume(device.getVolume() + 1);
		}
		
	}
	
	public void volumeDown() {
		if (device.getVolume() > 0) {
			device.setVolume(device.getVolume() - 1);	
		}
		
    
	}
}
