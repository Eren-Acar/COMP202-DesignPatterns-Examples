package StructrualDesignPatterns.Bridge;

public abstract class Device {
	private boolean isEnabled = false;
	private int volume = 0;
	private String channel = "";
	
	public boolean isEnabled() {
		return isEnabled;
	}
	
	public void enable() {
		isEnabled = true;
	}
	
	public void disable() {
		isEnabled = false;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String getChannel() {
		return channel;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	
}
