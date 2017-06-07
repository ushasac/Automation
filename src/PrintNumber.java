
public class PrintNumber {
	
	public static void selfie(int n)
	
	{
		if(n>0)
		{
			System.out.println(n);
			selfie(n-1);
		}
		else 
		{
			System.out.println("End");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selfie(10);

	}

}
