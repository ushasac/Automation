import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt(); */
		 int num=3;
		String msg="Prime";
		if(num>1)
		{
			
		for(int i=2;i<num;i++)
			
		{
			
			if(num%i==0)
			{
				msg="not Prime";
				break;
			}
			
					
		}
		}
		else 
		{
			msg="Not Prime";
		}
		
		System.out.println(msg);
		

	}}
