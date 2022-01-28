package phase1;

public class Method3 {
	public void area(int a,int b)
    {
         System.out.println("Area of Triangle : "+(0.5*a*b));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	Method3 ob=new Method3();
       ob.area(10,12);
       ob.area(5);  
   }

}
