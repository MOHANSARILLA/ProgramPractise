import java.util.Scanner;

public class Dhanno {
	
		public static void main(String[] args)
		{
			StringBuilder sb=new StringBuilder();
			System.out.println("Enter a number");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			while(n>0)
			{
				n--;
				char ch=(char)(n%26+'A');
				n/=26;
				sb.append(ch);
			}
			sb.reverse();
			System.out.println(sb);

		}

}
