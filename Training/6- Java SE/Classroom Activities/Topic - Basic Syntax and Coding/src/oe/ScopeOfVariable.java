package oe;

public class ScopeOfVariable{
	public static void main(String args[]){
		int var1=10;
		//var2 is now defined in an outer scope
		int var2=15;
		
		if (var1<100){
			//int var2=20;
			var2=20;
		}else{
			//int var2=21;
			var2=21;
		}
		
		//Access to var1 is allowed so no compile error
		System.out.println("Value of var1 = "+var1);
		
		//Access to var2 is not allowed so compile error will be generated
		System.out.println("Value of var2 = "+var2);
	}
}