package arrayListQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteDuplicate {
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) { 
        ArrayList<T> newList = new ArrayList<T>(); 
        for (T element : list) { 
            if (!newList.contains(element)) { 
                newList.add(element); 
            } 
        } 
        return newList; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5)); 
    System.out.println("ArrayList with duplicates: "+ list); 
    ArrayList<Integer> newList = removeDuplicates(list); 
    System.out.println("ArrayList with duplicates removed: "+ newList);
	}

}
