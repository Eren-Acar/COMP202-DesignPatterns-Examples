package BehavioralDesignPatterns.Mediator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AirController {
	Set<Flight> flights = new HashSet<Flight>();
	private boolean[] destination = new boolean[10]; 
	
	void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	//anser call
	int answerCall(Flight flight) {
        if (flights.contains(flight)) {
            //false means empty true means full
        	    for (int i = 0; i < destination.length; i++) {
                if (!destination[i]) {
                    destination[i] = true;
                	return i;
                }
            }
        }
        return -1;
    }
	
	public String getCurrentStatus() {
		return "Current status of flight" + Arrays.toString(destination);
	}

	public void sendTakeOffSignal(Flight flight, int des) {
		// TODO Auto-generated method stub
		destination[des] =!destination[des];
		flights.remove(flight);
		
		
	}
	
	
	}
	
