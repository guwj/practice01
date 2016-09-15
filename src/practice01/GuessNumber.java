package practice01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		// 입력
		Scanner scanner = new Scanner(System.in);

		while (true) {

			// 1 ~ 100 사이의 난수 발생
			Random r = new Random();
			int ran = r.nextInt(100) + 1;
			System.out.println("숫자를 정했다! 맞춰보라!!");

			// 하한값과 상한값
			int low = 1;
			int up = 100;

			// 시도 횟수
			int try_num = 1;

			while (true) {

				System.out.println(low + " ~ " + up);
				System.out.print(try_num + "회 시도 : ");
				int input = scanner.nextInt();

				if (ran > input) {
					System.out.println("더 큰 수거든 바부야~~");
					// 입력값이 하한값으로 재설정
					low = input;
					// 시도 횟수 증가
					try_num++;
				} else if (ran < input) {
					System.out.println("더 작은수지롱~");
					// 입력값이 상한값으로 재설정
					up = input;
					// 시도 횟수 증가
					try_num++;
				} else {
					System.out.println("올~ 맞췄는데~~");
					break;
				}

			}

			System.out.print("다시 할거야?(Y/N)");
			String reask = scanner.next();
			if (reask.equals("N")) {
				break;
			}

		}

	}

}
