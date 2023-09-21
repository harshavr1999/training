class Test{
		int i;
		Test(int i){
			System.out.println(i);
			this.i = i;
		}
		public static void main(String ka[]){
			Test obj = new Test(10);
			System.out.println(obj.i);
		}
	}
