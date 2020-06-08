import java.util.*;
public class Application {
	public static void main( String[] args )
    {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        Remov2As rm = new Remov2As();
        System.out.println(rm.DelA(st));
        sc.close();
    }
}
