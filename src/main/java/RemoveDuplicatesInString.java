import java.util.HashMap;

public class RemoveDuplicatesInString {
	static HashMap<Character, Integer> wordsWithRepeatation(String str) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		char[] strArray = str.toCharArray();
		for (char ch : strArray) {
			if (hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		HashMap<Character, Integer> nonRepeatHmap = new HashMap<>();

		return hmap;

	}

	public static void main(String[] args) {
		String words = "RemoveDuplicatesInString";
		System.out.println(wordsWithRepeatation(words.toLowerCase()));
		String words2 = "Javaj2ee";
		System.out.println(wordsWithRepeatation(words2.toLowerCase()));
	}
}
