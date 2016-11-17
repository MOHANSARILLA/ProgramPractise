import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordReverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer line=new StringBuffer(br.readLine());
		
		
		int start=0;
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)==' ')
			{
				StringBuffer word=new StringBuffer(line.substring(start,i));
				line.replace(start, i,word.reverse().toString());	
				start=i+1;
			}
			else if(i==line.length()-1)
			{
				StringBuffer word=new StringBuffer(line.substring(start,i+1));
				line.replace(start, i+1,word.reverse().toString());
			}
		}
		
		System.out.println(line);
		System.out.println("You have done successfully");
	}

}
