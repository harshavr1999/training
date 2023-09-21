package oe;

public class ConvertingPrimitivesToWrappers {

	public static void main(String[] args) {

		// Create Integer object instance
		Integer dataCount = new Integer(7801);

		// Convert Integer type into int primitive type using intValue() method
		int newCount = dataCount.intValue();

		System.out.println("int newCount = " + newCount);

		// Using static method of the Integer wrapper class
		// to convert a String type to int primitive type

		String pennsylvania = "65000";
		int penn = Integer.parseInt(pennsylvania);

		System.out.println("int penn = " + penn);

		// Convert int primitive type into Integer type

		Integer myInteger = new Integer(penn);
		System.out.println("Integer myInteger = " + myInteger);
		
		// Create Long object instance
		Long longCount = new Long(780);
		
		// Convert Long type into long primitive type using longValue() method
		long newLong = longCount.longValue();

		System.out.println("long newLong = " + newLong);
		
	}
}