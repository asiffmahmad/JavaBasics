package com.easy;

class Solution1 {
	public int countCharacters(String[] words, String chars) {
		int result = 0;

		for (String word : words) {
			int temp = 0;

			for (int i = 0; i < word.length(); i++) {
				System.out.println(word.charAt(i));
				char currentChar = word.charAt(i);

				if (chars.contains(String.valueOf(currentChar))) {
					temp = temp + 1;
				}
			}

			if (temp == word.length()) {
				result = result + temp;
			}
		}

		return result;
	}
}
