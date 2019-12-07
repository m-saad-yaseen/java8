public class Array {
	//Reference https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
	public static void main(String args[]) {
		//declare integer array by setting array length 
		
		int[] intArray;
		intArray = new int[10];
		intArray[0] = 1;
		System.out.println(intArray[0]);
		
		//declare and init an array predefined
		
		int[] predefinedIntArray = {1, 2, 4, 6};
		System.out.println(predefinedIntArray[3]);
		
		//declare and init a multi dimentional array
		String[][] names = {
			{"Mr.", "Ms."},
		    {"Saad", "Mou"}
		};
		System.out.println(String.format("%s %s", names[0][0], names[1][0]));
	}
}