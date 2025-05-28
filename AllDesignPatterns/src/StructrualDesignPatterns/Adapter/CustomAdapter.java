package StructrualDesignPatterns.Adapter;

public class CustomAdapter implements Analyzer {
	private ThirdPartyAnalyzer analyzer;
	
	class ThirdPartyImpl extends ThirdPartyAnalyzer{
		public String analyze(String xmlData) {
			return "Analysis performed";
		};
	}
	
	public CustomAdapter() {
		this.analyzer=new ThirdPartyImpl();
	}

	@Override
	public void analyze(String jsonData) {
		// TODO Auto-generated method stub
		//First step convert all jsonData into XML Format
		//Second step: Send data to ThirdPartyAnalyzer in XML format
		//Last step return the answer JSON format
		System.out.println("Converison JSON to XML Happens");
		System.out.println("Analysis Performss");
		String xmlData=null;//assume it stores json data in xml format
		analyzer.analyze(xmlData);
		System.out.println("Analysis: ....");

	}

}
