package phase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class UsesOfCollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating arraylist
				System.out.println("ArrayList");
			ArrayList<String>city=new ArrayList<String>();   
			city.add("pune");//
			city.add("hadpasar");    	
			System.out.println(city);  
			
				//creating vector
			System.out.println("\n");
			System.out.println("Vector");
			      Vector<Integer>vec = new Vector<>();
			vec.add(0,33); 
			vec.add(0, 23); 
			System.out.println(vec);
				
				//creating linkedlist
			System.out.println("\n");
			System.out.println("LinkedList");
			      LinkedList<String>names=new LinkedList<String>();  
			names.add("Alex");  
			names.add("John");  	
			      Iterator<String>itr=names.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			
			//creating hashset
			System.out.println("\n");
			System.out.println("HashSet");
			       HashSet<Integer>set=new HashSet<Integer>();  
			set.add(111);  
			set.add(112);  
			set.add(113);
			set.add(114);
			System.out.println(set);
			
			//creating linkedhashset
			System.out.println("\n");
			System.out.println("LinkedHashSet");
			LinkedHashSet<Integer>set2=new LinkedHashSet<Integer>();  
			set2.add(11);  
			set2.add(13);  
			set2.add(12);
			set2.add(14);	
			System.out.println(set2);
				} 
			  }

			@SuppressWarnings("unused")
			private static Vector<Integer> newVector() {
				return null;
				
			}  
			}
