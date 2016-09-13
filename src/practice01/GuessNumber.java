package practice01; 

 
 import java.util.Scanner; 
 import java.util.Random; 
 
 
 public class GuessNumber { 
 	public static void main(String[] args) { 
 		 
 		Scanner scanner = new Scanner( System.in ); 
 		
 		while(true){
 			
 			// 난수 생성
 			Random r = new Random();
 			int guessNumber = r.nextInt(100) + 1;
 			System.out.println("수를 결정했습니다. 맞춰보세요!");
 			
 			//범위 표시
 			int upper = 1;
 			int lower = 100;
 			
 			//시도 횟수 & 입력값
 			int count = 0;
 			int input = 0;
 			
 			while(true){
 				count++;
 				System.out.print(count+ "회 시도~ : ");
 				input = scanner.nextInt();
 				
 				if(guessNumber > input){
 					System.out.println("더 큰 수다");
 					lower = input;
 				}else if(guessNumber < input) {
 					System.out.println("더 작은 수다");
 					upper = input;
 				}else {
 					System.out.println("정답입니다");
 				}
 			}
 		}
 	}
 }
