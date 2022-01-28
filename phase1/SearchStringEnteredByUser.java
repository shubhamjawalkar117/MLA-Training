package phase1;

import java.util.Scanner;

public class SearchStringEnteredByUser {
	public static void main(String[] args) {
	     String Arr[]= {"shubham", "kiran","prem"};
	     String input; 
	     boolean flag=true;
	     try (Scanner sc1 = new Scanner(System.in)) {
			System.out.println("Please Enter Name");
			 input=sc1.nextLine();
		}
	     for(int i=0;i<Arr.length;i++) {
	    	 if(Arr[i].equals(input)) {
	    		 System.out.println("Present in array");
	    		 flag=false;
	    	 }}
	     if (flag) {
	    	 System.out.println("Not Present in array");
	    	 }
	     }
}
