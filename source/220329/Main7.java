package java;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main7 {

	public static void main(String[] args) {
		import java.util.Arrays;
		import java.util.Scanner;

		public class Main7 {

			public static void main(String[] args) {
				String str;
				int ja =0 , mo =0;
				Scanner scan = new Scanner(System.in);
				str = scan.nextLine();
				for(int i = 0; i <str.length();i++) {
					String subStr = str.substring(i,i+1);
					char subChar = str.charAt(i);
					if(subStr.equalsIgnoreCase("a")== true||
							subStr.equalsIgnoreCase("e")== true||
							subStr.equalsIgnoreCase("i")== true||
							subStr.equalsIgnoreCase("o")== true||
							subStr.equalsIgnoreCase("u")== true) {
						mo++;
					}
					else if(('a'<= subChar && subChar <='z' )||('A'<= subChar && subChar <= 'Z')) {
						ja++
					}
					System.out.println("자음 :" + ja + "개"\n "모음 : " + mo + "개");
				}
			
			
			
			}
			}
		}
	}
}