package phase1;

public class InnerClass2 {
	private String msg="welcome to Inner Classes2";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner obj=new Inner();  
	  obj.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerClass2  ob=new InnerClass2 ();  
		ob.display();  
		}
	}

