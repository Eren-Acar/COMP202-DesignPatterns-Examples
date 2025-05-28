package StructrualDesignPatterns.Adapter;

public class Client {
	
	
	public static void main(String[] args) {
		String jsonData="datapoint : 'Some data'";
		Analyzer analyzer= new CustomAdapter();
		analyzer.analyze(jsonData);
		
	}

}
