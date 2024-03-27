package javatraining.stringassignments;

public class IsVowels {
	private String fullString;

	public String getFullString() {
		return fullString;
	}

	public void setFullString(String fullString) {
		this.fullString = fullString;
	}

	public IsVowels(String fullString) {
		this.fullString = fullString;
	}

	@Override
	public String toString() {
		return "IsVowels [fullString=" + fullString + "]";
	}
	public void vowelsCount(String b) {
		int vowels=0;
		for(int index=0;index<fullString.length();index++) {
			char ch=fullString.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				++vowels;
			}
						
		}
		System.out.println("no. of vowels"+vowels);
	}

}
