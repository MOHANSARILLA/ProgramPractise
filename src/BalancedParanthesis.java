import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<line.length();i++)
		{
			char ch=line.charAt(i);
			if(map.entrySet().contains(ch))
			{
				System.out.println(ch);
				stack.push(ch);
			}
			else if(!stack.empty()&&map.values().contains(ch))
			{
				System.out.println(ch+" "+stack.peek()+""+stack.peek());
				if(String.valueOf(map.get(stack.peek())).equals(String.valueOf(ch)))
					stack.pop();
				else
				{
					System.out.println("NO");
					break;
				}
			}
				
		}
		
		if(stack.empty())
			System.out.println("YES");
			
		

	}

}
