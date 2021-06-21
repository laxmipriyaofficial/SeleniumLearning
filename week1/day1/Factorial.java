package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1*2*3*4*5
		int i,factorial;
		factorial=1;
		for(i=5;i>=1;i--) {
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
	}

}
