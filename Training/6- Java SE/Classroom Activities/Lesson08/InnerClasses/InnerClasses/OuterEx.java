class OuterEx 
{
	//  Member Variables

	String name;

	// Class Variable

	static int Reg;

	public void MyouterMethod()
	{
			Inner inobj=new Inner();
			inobj.MyInnerMethod();
	}

	
		static class Inner
			{
				// MV

				//MF

			 public void MyInnerMethod()
				{
					OuterEx obj=new OuterEx();
					System.out.println(Reg);
					System.out.println(obj.name);				
							
				 }
					
			}

	public static void main(String[] args) 
	{


			OuterEx outobj=new OuterEx();
			outobj.MyouterMethod();

			Inner inobj=new Inner();

			
			//

			OuterEx.Inner OBJ=outobj.new Inner();

	}
}
