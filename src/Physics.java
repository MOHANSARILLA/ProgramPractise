import java.util.Scanner;

public class Physics {

	public static int findTime(int a[],int v[],int n,int l)
	{
		int time=0;
		while(true)
		{
			int flag=0;
			for(int i=0;i<n;i++)
			{
				if(v[i]>0)
				{
					a[i]=a[i]+v[i];
				}
				else if(v[i]<0)
				{
					a[i]=a[i]+v[i];
				}
				
				
				
				if((a[i]==0)||(a[i]==l))
				{
					for(int j=0;j<n;j++)
					{
						if((a[j]==0)||(a[j]==l))
							;
						else
							break;
						flag=1;
					}
				}
				
	
				
			}
			time=time+1;
			
			if(flag==1)
				return time;
			
				
		}
		
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		
		int l=in.nextInt();
		
		int[] a=new int[n];
		int[] v=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		
		for(int i=0;i<n;i++)
			v[i]=in.nextInt();
		
		System.out.println(findTime(a,v,n,l));
		
		
	}

}
