package practice01;
public class Game369 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i < 100 ; i++){
			String s = String.valueOf(i);
			int clapCount = 0;
			
			for(int j = 1 ; j <= s.length() ; j++){
				char c = s.charAt(j-1);
				if( c == '3' || c == '6' || c == '9' ){
					clapCount++;
					
				}
			}

			if( clapCount == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for(int j = 0 ; j < clapCount ; j++ ){
				System.out.print("짝");
			}
			
			System.out.println();
		}
	}
}
