package epam;

public class Word extends MainClass{

	void create(){
		  System.out.println("Put word to change");
		  word = scn.nextLine();
		}
	int createNum(){
		System.out.println("Put number of a word's symbols you need to change");
		num = scn.nextInt();
		return num;
	}
	@Override
	void makeArray() {
		// TODO Auto-generated method stub
		
	}
	@Override
	String changeWord(int num2, String word2) {
		// TODO Auto-generated method stub
		return null;
	}
}

