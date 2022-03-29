package javaproject;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Main8 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int mean=0, max=0, min=0, i =1;	
		while(true) {
			int input = scanner.nextInt();			
			mean += input;
			if(i == 1) {
				max = input;
				min = input;
			}else {
				if(input > max) {
					max = input;
				}
				if(input < min) {
					min = input;
				}
			}			
			System.out.println("Result : "+i+"- Mean"+mean/i+",Max"+max+",Min"+min);
			System.out.println("");
			i++;
			}
		}
	}