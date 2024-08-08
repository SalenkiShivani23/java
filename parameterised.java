package programs;

public class parameterised {
	int a;
	public parameterised(int x)
	{
		a=x;
	}

	public static void main(String[] args) {
		parameterised obj=new parameterised(30);
		System.out.println(obj.a);
		

	}

}
