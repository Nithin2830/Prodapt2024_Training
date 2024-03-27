package javatraining.stringassignments;

public class ItContainsBoth {
	
	private String strBoth;

	public String getStrBoth() {
		return strBoth;
	}

	public void setStrBoth(String strBoth) {
		this.strBoth = strBoth;
	}

	public ItContainsBoth(String strBoth) {
		this.strBoth = strBoth;
	}

	@Override
	public String toString() {
		return "ItContainsBoth [strBoth=" + strBoth + "]";
	}
	
	public void CotainsBoth(){
		
		for(int index=0;index<strBoth.length();index++) {
			char ch=strBoth.charAt(index);
			if((!Character.isLetter(ch))&&(ch<'0'||ch>'9')) {
				System.out.println(" It contains string as well as numbers");
			}else {
				System.out.println("Wrong Input");
			}
		}
	}

}
