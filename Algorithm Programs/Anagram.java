import java.util.Scanner;

class Anagram{

	static boolean isAnagram(String s1, String s2) {
		int c1[] = new int[26];
		int c2[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			if (ch1 >= 'A' && ch1 <= 'Z') {
				System.out.println(ch1);
				c1[ch1 - 65]++;
			} else {
				c1[ch1 - 97]++;
			}
		}
		System.out.println();
		for (int i = 0; i < s2.length(); i++) {
			char ch2 = s2.charAt(i);
			if (ch2 >= 'A' && ch2 <= 'Z') {
				System.out.println(ch2);
				c2[ch2 - 65]++;
			} else {
				c2[ch2 - 97]++;
			}
		}

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Sentence>>  ");
		String s1 = sc.nextLine();

		System.out.println("Enter 2nd Sentence>>  ");
		String s2 = sc.nextLine();

		if ((isAnagram(s1, s2)) == true)
			System.out.println("Both the Sentences are Anagram");
		else
			System.out.println("Both the Sentences are not Anagram");

	}
}