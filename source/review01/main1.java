package review01;

import java.io.InterruptedIOException;
import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.event.IIOReadWarningListener;
import javax.swing.plaf.multi.MultiInternalFrameUI;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("input first string");
	      String first = scanner.next();
	      System.out.println("input second string");
	      String second = scanner.next();

	      char[] charFirst = first.toCharArray();
	      char[] charSecond = second.toCharArray();
	      
	      Arrays.sort(charFirst);
	      Arrays.sort(charSecond);

	      String strFisrt = new String(charFirst);
	      String strSecond = new String(charSecond);

	      if (strFisrt.contains(strSecond) == true) {
	         System.out.println("Yes");
	      }else {
	         System.out.println("No");
	      }
	      
	   }


}




