package week1.day2;

import java.util.Arrays;

public class Arrays_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s=new String[3];
		s[0]="Dan";
		s[1]="Dad";
		s[2]="Den";
		Arrays.sort(s);
		 for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
