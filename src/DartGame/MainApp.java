package DartGame;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dart score : ");
		String inputVal = scanner.nextLine();

		int len  = inputVal.length();
		int step = 1; //1. 점수, 2. 영역 3. 옵션 #|*
		int lenPos = 0;
		int[] score = new int[3]; //점수
		int scorePos = 0;         //점수의 좌표

		//1S2D*3T - 37 1^1 * 2 + 2^2 * 2 + 3^3
		//예제	dartResult	answer	설명
		//1	1S2D*3T	37	1^1 * 2 + 2^2 * 2 + 3^3
		//2	1D2S#10S	9	1^2 + 2^1 * (-1) + 10^1
		//3	1D2S0T	3	1^2 + 2^1 + 0^3
		//4	1S*2T*3S	23	1^1 * 2 * 2 + 2^3 * 2 + 3^1
		//5	1D#2S*3S	5	1^2 * (-1) * 2 + 2^1 * 2 + 3^1
		//6	1T2D3D#	-4	1^3 + 2^2 + 3^2 * (-1)
		//7	1D2S3T*	59	1^2 + 2^1 * 2 + 3^3 * 2
		
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
						score[scorePos - 1] = score[scorePos - 1] * 2;
						if (scorePos > 1) {
							score[scorePos - 2] = score[scorePos - 2] * 2;
						}
					}
					else if("#".equals(target)) {
						//1.3.2 아차상
						score[scorePos - 1] = score[scorePos - 1] * (-1);
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
					score[scorePos] = (int)Math.pow(score[scorePos], 1);
				}
				else if("D".equals(target)) {
					// 1.2.2 Double 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 2);
				}
				else if("T".equals(target)) {
					// 1.2.3 Triple 처리
					score[scorePos] = (int)Math.pow(score[scorePos], 3);
				}				
				else if("0".equals(target)) {
					// 1.1.1 10점 처리
					if (score[scorePos] == 1) {
						score[scorePos] = 10;
						//2단계 처리를 다시 하기 위해서 값을 조절
						scorePos --;
						step ++;
					}

				}				
				else {
					System.out.println("유효한 다트점수가 아닙니다");
					return;
				} 
				scorePos ++;
				step --;
			}
			lenPos ++;
		}
		scanner.close();
		System.out.println(score[0] + score[1] + score[2]);
	}

}
