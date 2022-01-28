package phase1;

class Main1 extends Exception {
    public Main1(String s) 
    { 
        super(s); 
    } 
} 
public class MyException 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new Main1("temp"); 
        } 
        catch (Main1 ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    }}

