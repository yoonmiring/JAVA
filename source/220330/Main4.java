//P11
package javaproject;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("#Menu\n1. Encryption \n2. Decryption");
			int num = sc.nextInt();
			System.out.print("->");
			String str = sc.next();

			char[] id = str.toCharArray();// �迭 id���� str�Է°��� �迭�� ����
			char a1 = 0;
			int a = 0, b, Result;

			for (int i = 0; i < str.length(); i++) {
				char[] newid = new char[id.length];
				if (num == 1) {
					newid[i] = (char) (str.charAt(i) + 13);
					System.out.print(newid[i]);
				} else if (num == 2) {
					newid[i] = (char) (str.charAt(i) - 13);
					System.out.print(newid[i]);
				}

			}
		}
	}
}
