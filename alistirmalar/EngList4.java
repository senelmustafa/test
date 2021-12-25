package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngList4 {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>liste=new ArrayList(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		   
	    for (String w : liste) {
			
			if (!w.toLowerCase().contains("a")) {
				System.out.println(w);
			}
		}
		//EngList4

	}

}
