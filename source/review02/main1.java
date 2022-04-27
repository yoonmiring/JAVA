package review02;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please input 0 and 1");
		int[] first = new int[4];
		for (int i = 0; i < first.length; i++) {
			first[i] = sc.nextInt();
		}
		int[] second = new int[4];
		for (int i = 0; i < second.length; i++) {
			second[i] = sc.nextInt();
		}
		int[] third = new int[4];
		for (int i = 0; i < third.length; i++) {
			third[i] = sc.nextInt();
		}
		int result1 = (first[0] + second[0] + third[0]);
		int result2 = (first[1] + second[1] + third[1]);
		int result3 = (first[2] + second[2] + third[2]);
		int result4 = (first[3] + second[3] + third[3]);
		if (result1 == 0 | result2 == 0 | result3 == 0 | result4 == 0) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
