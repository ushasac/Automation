
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int howmany=5;
     int n1=0,n2=1,num;
     System.out.println(n1+""+n2+"");
     for (int i=1;i<=howmany-2;i++)
     {
    	 num=n1+n2;
    	 System.out.print(num+"");
    	 n1=n2;
    	 n2=num;
    			 
     }
     
	}

}
