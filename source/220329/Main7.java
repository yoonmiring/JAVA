package javaproject;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main7 {

	public static void main(String[] args) {
		int cnt[] =new int [26];
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.toUpperCase().charAt(i);
			if(Character.isLetter(ch)){
				cnt[ch - 'A']++;
			}
		}

		for(int i=0; i <26; i++) {
			if (cnt[i] >= 1) {
				System.out.println((char)(65 + i)+ " - " +cnt[i]);
			}
		}
	}
}