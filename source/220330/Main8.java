package javaproject;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main8 {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {// 5번 반복
			int a = (int) (Math.random() * 9);
			System.out.print(a + "*");// 0~8까지 수 랜덤 생성

			if (i % 2 == 0) {// 짝수행
				for (int k = 8 - a; k > 0; k--) {// 앞자리 공백만들기
					System.out.print(" ");
				}
				for (int j = 0; j < a; j++) {// 랜덤 갯수만큼 별 찍기
					System.out.print("*");
				}
			} else if (i % 2 == 1) {// 홀수행
				for (int j = 0; j < a; j++) {// 랜덤 갯수만큼 별 찍기
					System.out.print("*");
				}
				for (int k = 8 - a; k > 0; k--) {// 뒷자리 공백 만들기
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println();
		}
	}

}