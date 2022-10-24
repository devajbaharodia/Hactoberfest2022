import java.util.Scanner;
public class sum3
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("The addition of two number is:"+(a+b));
			
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}