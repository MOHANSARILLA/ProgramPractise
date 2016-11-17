import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Permute {
	HashSet<String> hs = new HashSet<String>();

	static void swap(char a[], int x, int y) {
		char temp;
		temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	void permute(char a[], int l, int r) {
		int i;
		if (l == r) {
			System.out.println(a);
			String temp = new String(a);
			hs.add(temp);
		} else {
			for (i = l; i <= r; i++) {
				swap(a, (l), (i));
				permute(a, l + 1, r);
				swap(a, (l), (i));
			}
		}
	}


	boolean find() throws IOException
	{
		BufferedReader br=null;
		try{
			br=new BufferedReader(new FileReader("D:/Sample.txt"));
			String str=br.readLine();
			while(str!=null)
			{
				if(hs.contains(str))
				{
					return true;
				}
				str=br.readLine();
				
			}
			return false;
		}finally{
			br.close();
		}
		
		
		
		
				
	}
	public static void main(String[] args) throws IOException {
		char str[] = { 'A', 'B', 'C' };
		int n = str.length;
		Permute p = new Permute();
		p.permute(str, 0, n - 1);
		System.out.println(p.find());
	}
}
