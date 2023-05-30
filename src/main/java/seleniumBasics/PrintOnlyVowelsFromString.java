package seleniumBasics;

public class PrintOnlyVowelsFromString {

	public static void main(String[] args) {
		String input = "This is an example string";
        StringBuilder vowels = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {
                vowels.append(c);
            }
        }

        System.out.println(vowels.toString());

	}

}
