package week1.day1;

public class Mobile {
	String brandName="Samsung"; //Global Variables-declared at class level
	String color="Red";
	int price=25000;
	
	public void sendSMS() {
		System.out.println("Message is sent");
		System.out.println("Phone color:" +color); //no need obj reference to call global variable inside a non static method
	}
	public void takePhoto() {
		System.out.println("Picture is Captured");
		sendSMS(); // Methods can be called directly without object reference within non static methods
	}
	public void makeCall() {
		System.out.println("Call is connected");
		int phoneNo=123456;
		System.out.println(phoneNo);
	}
	public static void main(String[] args) {
		
Mobile m=new Mobile();
System.out.println("Mobile Brand:" +m.brandName);// obj reference is used to call global variable into static method
m.makeCall();
m.sendSMS();
m.takePhoto();
	}

}
