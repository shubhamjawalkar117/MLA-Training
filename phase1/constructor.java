package phase1;



class App{
	App(){
		System.out.println("zero or no argument constructor.....");
	}
}
	
 class AdharCard {
		String name;
		String dob;
		long contactno;
	    
		
		AdharCard(String personname,String persondob,long cno){
			name=personname;
			dob=persondob;
			contactno=cno;
		}

	}

public class constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App();
		
		  //parameterized constructor defined
				AdharCard a1=new AdharCard("shubham","13/5/1987",1234567890);
				System.out.println("name= "+a1.name);
				System.out.println("dob= "+a1.dob);
				System.out.println("contactno= "+a1.contactno);
				
				System.out.println("-----------------");
				AdharCard a2=new AdharCard("krisna","12/1/1999",4567834);
				System.out.println("name= "+a2.name);
				System.out.println("dob= "+a2.dob);
				System.out.println("contactno= "+a2.contactno);
	}

}

