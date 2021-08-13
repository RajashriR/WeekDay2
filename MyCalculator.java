package Selenium;

public class MyCalculator {
    public int add()
    {
    int x = 10,y = 12;
    int a = x+y;
    return a;
    }
    public int sub()
    {
    	int x=20,y=12;
    	int  s= x-y;
    	return s;
    }
    public int mul()
    { 
    	 int a= 4, b=5;
    	 int m = a*b;
    	 return m;
    }
    public int div()
    {
    	int a= 9,b= 3;
    	int d = a/b;
    	return d;
    }
    
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		
		int add = cal.add();
		System.out.println("Addition of 10 +12 = "+add );
		
		int sub =cal.sub();
		System.out.println("Subtraction of 20 - 12 = "+sub );
		
		int mul =cal.mul();
		System.out.println("Multiplication of 4 * 5 = "+mul );
		
		int div= cal.div();
		System.out.println("Division of 9/3 = "+div );
	}

}
