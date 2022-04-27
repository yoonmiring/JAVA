package review01;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("input m/s");
		int ms = scanner.nextInt();
		System.out.println("input km/h");
		int km = scanner.nextInt();
		System.out.println("input m/ms");
		double mms = scanner.nextDouble();

		
		int mms1 = ms/1000;
		double mms2 = km/3.6;
		
		if (mms > mms1) {
			if(mms>mms2) {
				if(mms1>mms2) {
					System.out.println(mms + "m/ms");
				}else {
					System.out.println(mms + "m/ms");
				}
			}else {
				System.out.println(km + "km/h");
			}
		}else {
			if(mms1>mms2) {
				if (mms>mms2) {
					System.out.println(ms +"m/s");
				}else {
					System.out.println(ms +"m/s");
				}
			}else {
				System.out.println(km + "km/h");
			}
		}

	}

}
