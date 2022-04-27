package review03;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 88;
		int num2 = 93;

		int result1 = 100 - num1;
		int result2 = 100 - num2;

		int frontNum = result1 + result2;
		int backNum = result1 * result2;
		
		System.out.println("First two digits :"+ (100-frontNum));
		System.out.println("Last two digits :"+ backNum);
		System.out.println("Result :"+(100-frontNum)+backNum);
	}

}
