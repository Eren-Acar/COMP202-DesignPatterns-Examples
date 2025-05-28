package StructrualDesignPatterns.FlyWeight;

import java.util.HashMap;

public class MermiFactory {
	private static  HashMap<String, Mermi> mermiPool = new HashMap<String, Mermi>();
	
	public static Mermi GetMermi(Asker asker) {
		
		
		Mermi mermi = null;
		int mermiSize = asker.getMermiSize();
		
		if(asker instanceof Komutan) {
           if((mermi = mermiPool.get("Komutan")) == null) {
        	   mermi = new Mermi(mermiSize);
        	   mermiPool.put("KomutanMermi", mermi);
           }
	}
	else if (asker instanceof Er) {
		if ((mermi = mermiPool.get("Er")) == null) {
			mermi = new Mermi(mermiSize);
			mermiPool.put("ErMermi", mermi);
		}
	}
		
		return mermi;
    }

}
	

