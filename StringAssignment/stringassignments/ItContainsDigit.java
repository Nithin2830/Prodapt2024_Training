package javatraining.stringassignments;

public class ItContainsDigit {
	
	private String strDigit;

	public String getStrDigit() {
		return strDigit;
	}

	public void setStrDigit(String strDigit) {
		this.strDigit = strDigit;
	}

	public ItContainsDigit(String strDigit) {
		this.strDigit = strDigit;
	}

	@Override
	public String toString() {
		return "ItContainsDigit [strDigit=" + strDigit + "]";
	}
	
	public void CotainsDigit() {
		for(int index=0;index<strDigit.length();index++) {
			char ch= strDigit.charAt(index);
			if(ch<'0'||ch>'9') {
				System.out.println(" contains only numbers");
			}else {
				System.out.println("Worng input");
			}
			
		}
	}
	

}
