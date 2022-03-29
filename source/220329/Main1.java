package javaproject;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("일  월  화  수  목  금  토");

		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		int lastOfDate = calendar.getActualMaximum(Calendar.DATE);
		int week = calendar.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < week; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if (week % 7 == 0)
				System.out.println();
			week++;
		}

	}
}
