import java.util.Scanner;
 
class FlipDigit{
	private static Scanner in;
	private static String s;

	public static void main(String args[]){
		
		Scanner number = new Scanner(System.in);
		int T = number.nextInt();
		
		for(int testcase = 1; testcase <= T; testcase++){
			
			in = new Scanner(System.in);
			//System.out.println("Enter a string");
			
			s = in.nextLine();
			
			int zeroflag = 0;
			int oneflag = 0;
	
			for(int i = 0; i < s.length(); i++){
				if(	s.charAt(i) == '0'){
					zeroflag++;
				}
				else{
					oneflag++;
				}
				if(zeroflag >= 2 && oneflag >= 2){
					System.out.println("No");
					break;
				}
				
			}
			if(zeroflag == 0 || oneflag == 0){
				System.out.println("No");
			}
			if(zeroflag == 1 || oneflag == 1){
				System.out.println("Yes");
			}
		}
	}
}