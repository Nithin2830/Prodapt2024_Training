package javatraining.stringassignments;

public class IsConsonants {
	
	private String fullString;

	public String getFulString() {
		return fullString;
	}

	public void setFulString(String fulString) {
		this.fullString = fulString;
	}

	public IsConsonants(String fulString) {
		this.fullString = fulString;
	}

	@Override
	public String toString() {
		return "IsConsonants [fulString=" + fullString + "]";
	}
	
	public void ConsonantsCount(String a) {
		int consonants=0;
		for(int index=0;index<fullString.length();index++) {
			char ch=fullString.charAt(index);
			if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
				++consonants;
			}
		}
		System.out.println("no. of consonants "+consonants);
	}
	
	

}
