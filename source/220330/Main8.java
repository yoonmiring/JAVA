package javaproject;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main8 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {// 5�� �ݺ�
			int a = (int) (Math.random() * 9);
			System.out.print(a + "*");// 0~8���� �� ���� ����

			if (i % 2 == 0) {// ¦����
				for (int k = 8 - a; k > 0; k--) {// ���ڸ� ���鸸���
					System.out.print(" ");
				}
				for (int j = 0; j < a; j++) {// ���� ������ŭ �� ���
					System.out.print("*");
				}
			} else if (i % 2 == 1) {// Ȧ����
				for (int j = 0; j < a; j++) {// ���� ������ŭ �� ���
					System.out.print("*");
				}
				for (int k = 8 - a; k > 0; k--) {// ���ڸ� ���� �����
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}
	}

}