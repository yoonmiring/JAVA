package javaproject;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		int j = 0;
		int[] a = new int[10];
		if (n <= 20 && n >= 1) {
			for (int i = 1; i <= n; i++) {
				if ((i % m) == 0) {
					sum = sum + i;
					a[j] = i;
					j++;
				} else if ((n % m) != 0) {
					continue;
				}
			}
		} else {
			System.out.println("숫자값을 20이하로 다시 입력하세요.");
		}
		System.out.print("SUM :" + sum + " (");
		for (int k = 0; k < a.length; k++) {
			if (a[k] != 0) {
				System.out.print(a[k] + ",");
			} else if (a[k] == 0) {
				continue;
			}
		}
		System.out.print(")");
	}
}