import java.util.*;
public class ArrayBilderTest {
	static int i;
	public static void main(String[] args) {
		System.out.println("Put a size af an binar array.");
		Scanner scn = new Scanner(System.in);
		i = scn.nextInt();
		ArrayBilder maxcalc = new ArrayBilder();
		System.out.print("The maximum sequence of value (0) is " + maxcalc); 
	}
  
}
