package grep;

import java.util.*;


public class Line {
	String line, word;
	int times = 0;
	Scanner scn = new Scanner(System.in);
	 List<String> lines = new ArrayList<String>();
	void getword(){
		System.out.println("Введети ключевое слово");
		word = scn.nextLine(); 
	}
	
	void search(){
		
		Iterator<String> it = lines.iterator();
		while(it.hasNext()) {
			String s = it.next();
			Boolean found = s.toLowerCase().contains(word.toLowerCase());
			if(found){
			      System.out.println("Keyword matched the string");
			} else System.out.println("There is no such word, sorry");
		}
	}
		
	void printout(){
		
	}
		public void Scaning() {	
			for( int times = 0; times < 2; times++){ 
			System.out.println("Веведите строку");
			 line = scn.nextLine();
			 lines.add(line);
			}
		}	
}

