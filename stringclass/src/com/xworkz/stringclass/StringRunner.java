package com.xworkz.stringclass;

public class StringRunner {

	String name = "java is a programing language";

	public void StringReverse() {
		char[] a = name.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println("------------");
	}

	public void count() {
		char[] b = name.toCharArray();
		System.out.println("count:" + b.length);
		System.out.println("--------");
	}

	public void vowles() {
		char[] c = name.toCharArray();
		for (int i = 0; i <= c.length - 1; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				// name++;
				System.out.print(c[i]);
			}

		}
	}

	public void countVowlesAndConsonant() {
		String name = "java is a programing language";
		int vowles = 0;
		int consonant = 0;
		char[] d = name.toCharArray();
		for (int i = 0; i < d.length; i++) {
			if (d[i] == 'a' || d[i] == 'e' || d[i] == 'i' || d[i] == 'o' || d[i] == 'u') {
				vowles++;

			} else {
				if (d[i] >= 'a' && d[i] <= 'z') {
					consonant++;
				}
			}
		}
		System.out.println("vowels: " + vowles);
		System.out.println("consonants: " + consonant);
	}

	public void splitString() {
		int count = 0;
		String[] words = name.split("\\s");
		for (int i = 0; i < words.length; i++) {
			count++;
			System.out.println(words[i]);
		}
		System.out.println("count:" + count);
		System.out.println("-----------------");
	}

	public void duplicates() {

		char[] symbol = { '1', '2', '5', '3', '2', '4', '5', '3' };
		int count = 0;
		for (int i = 0; i < symbol.length; i++) {
			for (int j = i + 1; j < symbol.length; j++) {
				if (symbol[i] == symbol[j]) {
					count++;
					System.out.println(symbol[i]);

				}

			}
		}
		System.out.println("total count");
		System.out.println(count);
	}

}
