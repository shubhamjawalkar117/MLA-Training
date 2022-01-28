package phase1;

public class privateAcces {
	 void display() {
		System.out.println("are using private access specifier");
	}
}


 class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		privateAcces  p=new privateAcces();
	}

}
