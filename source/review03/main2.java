package review03;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "88";
		String num2 = "93";
		
		int result1 = 100 - Integer.parseInt(num1);
		int result2 = 100 - Integer.parseInt(num2);
		
		int frontNum = result1 + result2;
		int backNum = result1 * result2;
		
		System.out.println("First two digits :"+ (100-frontNum));
		System.out.println("Last two digits :"+ backNum);
		if(backNum >100) {
			System.out.println("Result :"+(100-frontNum+1)+(backNum-100));
		}else {
			System.out.println("Result :"+(100-frontNum)+backNum);
		}
		
	}

}
