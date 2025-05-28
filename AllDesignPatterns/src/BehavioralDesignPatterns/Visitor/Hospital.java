package BehavioralDesignPatterns.Visitor;

import java.time.LocalDate;

public class Hospital extends Node {

	private LocalDate foundDate;
	public Hospital(double latitude, double longitude, LocalDate foundDate) {
		super(latitude, longitude);
		// TOD Auto-generated constructor stub
		this.foundDate = foundDate;
		
	}
	
	public LocalDate getFoundDate() {
		return foundDate;
	}
	
	
	public void setFoundDate(LocalDate foundDate) {
		this.foundDate = foundDate;
	}
	
	
	public double getLatitude() {
		return super.getLatitude();
	}
	
	
	
	

}
