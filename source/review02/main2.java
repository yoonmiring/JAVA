package review02;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input the current date");
		int current = sc.nextInt();
		System.out.println("input the birthday");
		int birth = sc.nextInt();
		
		int currentYear =  current/10000;
		int currentMonth = current%10000;
		int birthYear =  birth/10000;
		int birthMonth = birth%10000;
		
		if(currentYear ==  birthYear) {
			if(currentMonth < birthMonth) {
			System.out.println("만0세입니다");
			}else {
				System.out.println("ERROR");
			}
		}else if(currentYear >  birthYear) {
			if((currentMonth <= birthMonth)) {
				System.out.println((currentYear-birthYear+1) +"years old in Korean age");
				System.out.println((currentYear-birthYear-1) +"years old in international age");
			}else if(currentMonth > birthMonth) {
				System.out.println((currentYear-birthYear+1) +"years old in Korean age");
				System.out.println((currentYear-birthYear) +"years old in international age");
			}
		}else {
			System.out.println("ERROR");
		}
		
	}

}
