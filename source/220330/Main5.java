package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		System.out.println("����\n#1.���ڼ� 10�� �̻�");
		System.out.println("#2.ù���� �빮��");
		System.out.println("#3.�ҹ��� \'x\'����");
		System.out.println("#4.Ư������ \'!\' ����");
		System.out.print("#5.������ ����� �� �����ϴ�.\n->");

		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //�Է� ��
		char[] id = str.toCharArray();//�迭 id���� str�Է°��� �迭�� ����
		boolean a = str.contains("x");
		boolean b = str.contains("!");
		int length = id.length; // ���̵� ����
		
		if (length < 10) {
			System.out.println("10���� �̻� �����ּ���.");
		} else if (length > 9) {
			if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
				if (str.contains("x")) {
					if(str.contains("!")) {
						System.out.println("True");
					}else {
						System.out.println("Ư�� ���� !�� �־��ּ���");
					}
				}else {
					System.out.println("�ҹ��� x�� ���� �־��ּ���.");
				}
			} else {
				System.out.println("ù���ڴ� �빮�ڸ� �Է����ּ���.");
			}
		}


	}
}
