package Temp;

public class MainApp {

	public static void main(String[] args) {
		int len = 10;
		int lenPos = 0;
		int step = 1;
		
		while (lenPos < len) {

			if (step == 1) {
				System.out.println("lenPos :: " + lenPos + " +++1 :: " + step);
				step ++;
			}
			else if (step == 2) {
				System.out.println("lenPos :: " + lenPos + " +++2 :: " + step);
			}
			
			lenPos ++;			
		}
		// TODO Auto-generated method stub

	}

}
