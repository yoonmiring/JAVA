package javaproject;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p = 0, n = 0, o = 0, e = 0;

		while (true) {
			int input = scanner.nextInt();

			if (input == 0) {
				System.out.println("다른 값을 입력해주세요.");
				continue;
			} else if (input > 0) {
				p++;
				if (input % 2 == 1) {
					o++;
				} else {
					e++;
				}
			} else {
				n++;
				input = Math.abs(input);
				if (input % 2 == 1) {
					o++;
				} else {
					e++;
				}
			}
			System.out.println("P - " + p + ", N - " + n + ", O - " + o + ", E - " + e);
			System.out.println("");
		}

	}
}