import cs1.Keyboard;

public class cs1KeyboardExample{
	public static void main(String args[]){
		String userName;
		int favNum;
		System.out.print ("Please enter your name: ");
		userName = Keyboard.readString();
		System.out.print("Please enter your favorite number: ");
		favNum = Keyboard.readInt();
		System.out.println();
		System.out.println("Your name is "+ userName);
		System.out.println("Your favorite number is " +favNum);
	}
}