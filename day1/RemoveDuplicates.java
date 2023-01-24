package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String  text = "We learn java basics as part of java sessions in java week1";
		List<String> lst = new ArrayList<String>();
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++)
		{
			lst.add(split[i]);
		}
		
		Set<String> st = new LinkedHashSet<String>(lst);
		System.out.println(st);
		
}
		
}

