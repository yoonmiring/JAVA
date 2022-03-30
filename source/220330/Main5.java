package javaproject;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		System.out.println("조건\n#1.글자수 10개 이상");
		System.out.println("#2.첫글자 대문자");
		System.out.println("#3.소문자 \'x\'포함");
		System.out.println("#4.특수문자 \'!\' 포함");
		System.out.print("#5.공백은 사용할 수 없습니다.\n->");

		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //입력 값
		char[] id = str.toCharArray();//배열 id값에 str입력값을 배열로 넣음
		boolean a = str.contains("x");
		boolean b = str.contains("!");
		int length = id.length; // 아이디 길이
		
		if (length < 10) {
			System.out.println("10글자 이상 적어주세요.");
		} else if (length > 9) {
			if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
				if (str.contains("x")) {
					if(str.contains("!")) {
						System.out.println("True");
					}else {
						System.out.println("특수 문자 !를 넣어주세요");
					}
				}else {
					System.out.println("소문자 x의 값을 넣어주세요.");
				}
			} else {
				System.out.println("첫글자는 대문자를 입력해주세요.");
			}
		}


	}
}
