package javatraining.stringassignments;

public class ItContainsString {
	
	private String strVariable;

	public String getStrVariable() {
		return strVariable;
	}

	public void setStrVariable(String strVariable) {
		this.strVariable = strVariable;
	}

	public ItContainsString(String strVariable) {
		this.strVariable = strVariable;
	}
	
	
	
	@Override
	public String toString() {
		return "ItContainsString [strVariable=" + strVariable + "]";
	}

	public void ContainString() {
		for(int index=0;index<strVariable.length();index++) {
			char ch=strVariable.charAt(index);
			if(!Character.isLetter(ch)) {
				System.out.println(" THe given str contains only strings");
			}else {
				System.out.println(" There might other datas included ");
			}
		}
	}
}
				
	
   
        
	
		

