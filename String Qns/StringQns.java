package javatraining.dayfive;

public class StringQns {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb1.capacity());

		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.indexOf("b"));

		StringBuffer sb2 = new StringBuffer("Was it a car or a cat I saw?");
		System.out.println(sb2.substring(9, 12));

		String original = "software";

		StringBuffer result = new StringBuffer("hi");

		int index = original.indexOf('a');

		/* 1 */ result.setCharAt(0, original.charAt(0));

		/* 2 */ result.setCharAt(1, original.charAt(original.length() - 1));

		/* 3 */ result.insert(1, original.charAt(4));

		/* 4 */ result.append(original.substring(1, 4));

		/* 5 */ result.insert(3, (original.substring(index, index + 2) + " "));

		System.out.println(result);

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

		String hi = "Hi, ";
		String mom = "mom.";
		System.out.println(hi.concat(mom));

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

		String fullName = "Nithin R";
		int var = fullName.lastIndexOf(fullName);
		System.out.println(fullName.charAt(var));

		String S1 = "Parliment";
		String S2 = "partial ben";

		int f = 0;
		for (int i = 0; i < S1.length(); i++) {
			f = 0;
			for (int j = 0; j < S2.length(); j++) {
				if (S2.charAt(i) == ' ') {
					f = 100;
				} else if (S1.charAt(i) == S2.charAt(j)) {
					f = 1;
					break;

				}
			}

			if (f == 0) {
				System.out.println("not anagram");
				break;
			}
		}
		if (f == 1) {
			System.out.println("anagram");

		}

	}

}
