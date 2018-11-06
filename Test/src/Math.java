
public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method git testing
		Math m = new Math();
		
	int s1=2, s2= 3,s3= 4, s4=5;
		int y= m.multiply(s1, s2, s3, s4);
		System.out.println( "result ....."+y);
		
		
		///fjhjg
		   
		int a1=10, a2 = 20, a3 =30, a4= 40;
		 y = m.multiply(a1, a2, a3, a4);
		 System.out.println("result..."+y);
		 
		 y = m.add(a1, s4);
		 System.out.println("result...."+y);
		 
		 System.out.println("find a largest no..."+m.largestnumer(s1, a3));
		
		 System.out.println("find a largest of three no.."+m.largestnumber(s4, a2, s3));
		 
		 y = m.subtraction(a2, a1);
		 System.out.println("subtraction result..."+y);
		 y = m.devide(a3, a1);
		 System.out.println("division result...."+y);

	}
	public int multiply(int a, int b,int c, int d)
	{
		int X = a*b*c*d;
		return X;
		
		
	}
	public int add(int a, int b)
	{
		int x = a+b;
		return x;
	}
	
	public int largestnumer(int a, int b)
	{
		if(a>b) {
			return a;
			
		}
		else
		{
			return b;
		}
		
	}
	public int largestnumber(int a, int b, int c)
	{
		int x ;
		
		if((a>b)&&(a>c)) {
			x = a; 
		}
		else if ((b>a)&&(b>c)){
			
			x = b;
		}
		else {
			x = c;
		}
		return x;
		
	}



public int subtraction(int a, int b)
{
	int c = a-b;
	return c;	
}


public int devide(int a, int b)
{
	int c = a/b;
	return c;
}
	
}	












