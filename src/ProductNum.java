import java.math.BigInteger;
import java.util.Scanner;

public class ProductNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		String str[]=new String[n];
		
		for (int i = 0; i < str.length; i++) {
			str[i]=in.next();			
		}
		
		
		BigInteger count=new BigInteger("1");
		BigInteger sum=new BigInteger("0");
		
		for (int i = 0; i < str.length; i++) {
			count=count.multiply(new BigInteger(str[i]));
			sum=count.mod(new BigInteger("1000000007"));	
		}
		
		System.out.println(sum);
		
	}

}
