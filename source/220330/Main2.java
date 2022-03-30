package javaproject;

import java.util.Calendar;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, i = 0;

		while (true) {
			System.out.println("#Menu\n1. Deposit \n2. Withdrawal");
			System.out.println("Balance : " + i);
			num = sc.nextInt();
			int input =  sc.nextInt();
			if (num == 1) {
					i = i + input; 
			} else if (num == 2) {
					i = i - input;
			} else {
				System.out.println("1과 2를 눌러주세요");
			}
		}
	}
}