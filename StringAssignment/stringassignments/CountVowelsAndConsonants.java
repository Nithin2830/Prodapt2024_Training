package javatraining.stringassignments;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsVowels obj=new IsVowels(null);
		IsConsonants obj1=new IsConsonants(null);
		
		obj.setFullString("hi");
		obj1.setFulString("he");
		
		System.out.println("Enter your string\n"+obj.getFullString());
				
		obj.vowelsCount(obj.getFullString());
		obj1.ConsonantsCount(obj.getFullString());

	}

}
