import java.util.Scanner;

public class MultiDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int c;
		
		if(n>26)
		{
			if(n%26==0)
			{
				c=(n/26)-1;
				while(c>26)
				{
					
				}
			}
			else
			{
				
			}
		}
		else
			System.out.print((char)n);

	}

}