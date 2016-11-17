import java.util.Scanner;

public class PowerString {

	public static int checkPowerString(String s,int a,int e,int i,int o,int u) {
		
		int[] c=new int[5];
		char[] ch=s.toCharArray();
		
		
		c[0]=a;
		c[1]=e;
		c[2]=i;
		c[3]=o;
		c[4]=u;
		
		for(int j=0;j<c.length;j++)
		{
			int min=100000000;
			int flag=0;
			if(j==0)
			{
				if(c[j]==1)
				{
					for(int k=0;k<ch.length;k++)
					{
						if((ch[k]!='e')&&(ch[k]!='i')&&(ch[k]!='o')&&(ch[k]!='u'))
						{
							int res=Math.abs(ch[k]-'a');
			
							if(res<min)
								min=res;
							flag=1;
						}
					}
					if(flag==1)
						return min;
				}
			}
			else if(j==1)
			{
				if(c[j]==1)
				{
					for(int k=0;k<ch.length;k++)
					{
						if((ch[k]!='a')&&(ch[k]!='i')&&(ch[k]!='o')&&(ch[k]!='u'))
						{
							int res=Math.abs(ch[k]-'e');
							if(res<min)
								min=res;
							flag=1;
						}
					}
					if(flag==1)
						return min;
				}
			}
			else if(j==2)
			{
				if(c[j]==1)
				{
					for(int k=0;k<ch.length;k++)
					{
						if((ch[k]!='e')&&(ch[k]!='a')&&(ch[k]!='o')&&(ch[k]!='u'))
						{
							int res=Math.abs(ch[k]-'i');
							if(res<min)
								min=res;
							flag=1;
						}
					}
					if(flag==1)
						return min;
				}
			}
			else if(j==3)
			{
				if(c[j]==1)
				{
					for(int k=0;k<ch.length;k++)
					{
						if((ch[k]!='e')&&(ch[k]!='i')&&(ch[k]!='a')&&(ch[k]!='u'))
						{
							int res=Math.abs(ch[k]-'o');
							if(res<min)
								min=res;
							flag=1;
						}
					}
					if(flag==1)
						return min;
				}
			}
			else if(j==4)
			{
				if(c[j]==1)
				{
					for(int k=0;k<ch.length;k++)
					{
						if((ch[k]!='e')&&(ch[k]!='i')&&(ch[k]!='o')&&(ch[k]!='a'))
						{
							int res=Math.abs(ch[k]-'u');
							if(res<min)
								min=res;
							flag=1;
						}
					}
					if(flag==1)
						return min;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		
		String str=in.next();
		
		System.out.println(checkPowerString(str,1,1,1,1,1));
		
		
		

	}

}
