package phase1;
abstract class Animal {
	  // Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	
	class Pig extends Animal {
	  public void animalSound() {
	   
	    System.out.println("The pig says: wee wee");
	  }
	}
public class Abstract {
	 public static void main(String[] args) {
		    Pig myPig = new Pig(); // Create a Pig object
		    myPig.animalSound();
		    myPig.sleep();
		  }
		}
