import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ExcelSheet {

	public static void main(String[] args) {
		
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int rem;
		char ch;
		ArrayList<Character> al=new ArrayList<Character>();
		while(n>0)
		{
			rem=n%26;
			if(rem==0)
			{
				al.add('Z');
				n=(n/26)-1;
			}
			else
			{
				ch=(char)((rem-1)+'A');
				al.add(ch);
				n=n/26;
			}
		}
		
		Collections.reverse(al);
		
		Iterator i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		

	}

}
