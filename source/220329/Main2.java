package javaproject;

import java.util.Calendar;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		long d1,d2;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �⵵�� �Է��ϼ���");
		int oldYear = sc.nextInt();
		System.out.println("���� ���� �Է��ϼ���");
		int oldMonth = sc.nextInt();
		System.out.println("���� ���� �Է��ϼ���");
		int oldDay = sc.nextInt();
		System.out.println("������ �⵵�� �Է��ϼ���");
		int newYear = sc.nextInt();
		System.out.println("������ ���� �Է��ϼ���");
		int newMonth = sc.nextInt();
		System.out.println("������ ���� �Է��ϼ���");
		int newDay = sc.nextInt();
		Calendar c1=Calendar.getInstance();
		Calendar c2=Calendar.getInstance();
		
		c1.set(oldYear, oldMonth, oldDay);
		c2.set(newYear, newMonth, newDay);
		 
		d1=c1.getTimeInMillis();
		d2=c2.getTimeInMillis();
		
		int days =(int)((d2-d1)/(1000*60*60*24));
		System.out.println(days);

		}
		}