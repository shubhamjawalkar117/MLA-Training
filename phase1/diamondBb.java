package phase1;
interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 

interface Second2 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  

public class diamondBb implements First, Second2  {
    public void show() 
    {  
        First.super.show(); 
        Second2.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	diamondBb ob = new diamondBb(); 
        ob.show(); 
    } 
}

