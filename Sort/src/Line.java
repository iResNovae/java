import java.util.*;
public class Line {
Scanner scn = new Scanner(System.in);
String str;
	protected void put(){
		System.out.println("Put a string to sort");
		str = scn.nextLine();
		str.toLowerCase();
	 }
	 void sort(){
		 String[] a1 = str.split(" ");
		 Arrays.sort(a1);
		 for (String out : a1){
		 System.out.println(out);
		 }
	 }
	 void sortlenght(){
		 String[] a2 = str.split(" ");
		 for(String out : a2){  
		 for (int i=0; i > out.length(); i++){
              System.out.println(out);
		}
    }
}
}
