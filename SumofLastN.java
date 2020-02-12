package arrayListQuestion;
import java.util.*;
public class SumofLastN {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> n=new ArrayList<String>();
		n.add("asdfghjkl");
		n.add("zxcvbnm");
		n.add("qwertyuio");
		n.add("fgdfhnvnmnk");
		ListIterator<String> it = n.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}


