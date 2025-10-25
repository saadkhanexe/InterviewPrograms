package in.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class practise2 {
 
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		List<String> li=new ArrayList<String>();
//		li.add("Saad");
//		li.add("Ahmed");
//		li.add("Khan");
//		System.out.println(li);
//		li.add(2,"Afreen");
//		System.out.println(li);
//		
//		List<String> nl=new ArrayList<>();
//		nl.add("Naghma");
//		nl.add("Madiha");
//		nl.add("Kubra");
//		System.out.println(nl);
//		li.addAll(nl);
//		System.out.println(li);
//		
//		System.out.println(li.get(4));
//		System.out.println(li.get(5));
//		li.remove(1);
//		System.out.println(li);
//		
//		li.remove(String.valueOf("Madiha"));
//		System.out.println(li);
//		li.clear();
//		System.out.println(li);
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		
		System.out.println(li);
		for(int s:li) {
			System.out.println("for each: "+s);
		}
		
		for(int i=0; i<li.size(); i++) {
			System.out.println("normal for loop:" +li.get(i));
		}
		
		Iterator<Integer> it=li.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator: "+it.next());
		}
		
		
		
//		System.out.println(li);	
//		li.remove(3);
//		System.out.println(li);
//		System.out.println(li.contains(30));
//		li.set(2, 200);
//		System.out.println(li);
	}

}
