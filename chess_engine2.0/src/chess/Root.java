package chess;
import java.util.*;

public class Root implements Figure {
	Random rand = new Random();
	static private int i;
	static private int j;
	Root(){ 
		i = rand.nextInt(7);
		j = rand.nextInt(7);	
	}
	public void move (){
		switch(rand.nextInt(1)){
		case 0:
		i = rand.nextInt(7); break;
		case 1:
			i = rand.nextInt(7); break;
	}
		
	}
//	 public void setI(int i) {
//	       this.i = i;
//	    }
//	 public void setJ(int j) {
//	       this.j = j;
//	    }
	@Override
	public int[][] places(Figure fig) {
		// TODO Auto-generated method stub
		return null;
	}

 
}
