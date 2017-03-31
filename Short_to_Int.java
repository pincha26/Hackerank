
public class Short_to_Int {

	public static void main(String[] args) {
		try {
	
			System.out.println("Enter the int Value:");
			int myint = 32769;
			short myshort = (short) (myint);
			System.out
					.println("Convert value from int to short is: " + myshort);
		} catch (Exception e) {
			System.out.println(" Error " + e);
		}
	}
}
