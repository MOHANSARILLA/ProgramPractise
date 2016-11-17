import java.util.Scanner;

public class DigitReplace {
	
	public static int digitReplace(int num,char src,char tar) {
		
		
		String word=String.valueOf(num);
		
		String res=word.replace(src,tar);
		
		return Integer.valueOf(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		
		int a=in.nextInt();
		int b=in.nextInt();
		
		
		System.out.println(digitReplace(a,'5','6')+digitReplace(b,'5','6'));
		
		System.out.println(digitReplace(a,'6','5')+digitReplace(b,'6','5'));

	}

}
