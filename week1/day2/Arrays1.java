package week1.day2;
import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values=new int[3];
		values[0]=11;
		values[1]=2;
		values[2]=100;
		System.out.println(values.length);// length or size of an array
		System.out.println("Before sort");
		for (int i = 0; i < values.length; i++) {
			System.out.println("Values of " + i +" " + values[i]);
		}
		
		//System.out.println(values[2]); // gets default value of 0 when no values are assigned
		Arrays.sort(values);
		for (int i = 0; i < values.length; i++) {
			System.out.println("Values of " + i + " "+values[i]);
		}
		//reverse order
				System.out.println("Reverse order");
				for (int i = values.length-1; i >=0; i--) {
					System.out.println("Values of " + i + " "+values[i]);
				}
	}


	}

