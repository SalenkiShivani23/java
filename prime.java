package programs;

public class prime {

	public static void main(String[] args) {
		int n=7;
		int   r;
		int count=0;
		for(int i=2;i<n;i++)
		{
			r=n%i;
			if(r==0)
			{
				count=count+i;
			}
			}
		if(count==0)
		{
			System.out.println(n+"is a prime number");
		
		}
		else
		{
			System.out.println(n+"is not a prime number");
		}
		// TODO Auto-generated method stub

	}

}
