package DartGame;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dart score : ");
		String inputVal = scanner.nextLine();
		
		int len  = inputVal.length();
		int step = 1; //1. 점수, 2. 영역 3. 옵션 #|*
		int lenPos = 0;
		int[] score = new int[3]; //점수
		int scorePos = 0;         //점수의 좌표

		//1S2D*3T - 37 1^1 * 2 + 2^2 * 2 + 3^3
		//1. 입력된 길이만큼 반복 분서
		while (lenPos < len) {
			String target = inputVal.substring(lenPos, lenPos + 1);
			if (step == 1) {
				try {
					// 1.1 1단계 점수 처리 (숫자만 올수 있다)
					score[scorePos] = Integer.parseInt(target);
					step ++;
				}
				catch (Exception e) {
					// 1.3 3단계 옵션 처리
					if("*".equals(target)) {
						//1.3.1 스타상
					}
					else if("#".equals(target)) {
						//1.3.2 아차상
					}
					else {
						System.out.println("유효한 다트점수가 아닙니다");
						return;
					}
					
				}
			}
			else if (step == 2) {
				// 1.2 2단계 영역처리
				if ("S".equals(target)) {
					// 1.2.1 Single 처리
				}
				else if("D".equals(target)) {
					// 1.2.2 Double 처리
				}
				else if("T".equals(target)) {
					// 1.2.3 Triple 처리
				}				
				else {
					System.out.println("유효한 다트점수가 아닙니다");
					return;
				} 
			}
			lenPos ++;
		}
		System.out.println(score[0] + score[1] + score[2]);
	}

}
 	