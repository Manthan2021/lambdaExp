package lambdaexpwork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("My System starts...");
//		MyInter myInter2=new MyInterImpl();
//		myInter2.sayHello();
		//Annonymous class
//		MyInter i=new MyInter() {
//        public void sayHello() {
//        	System.out.println("This is anonymous class");
//        }
//		
//		
//	};
//	i.sayHello();
//
//	MyInter i2=new MyInter() {
//        public void sayHello() {
//        	System.out.println("This is my second anonymous class");
//        }
//		
//};
//i2.sayHello();
		//using our interface with help of lambda
		MyInter i= ()-> System.out.println("this is first time I am using lambda");
		i.sayHello();
		
		MyInter i2=()-> System.out.println("this is second time i am using lambda");
		i2.sayHello();
		
//		SumInter sumInter=(int a,int b)->{
//			return a+b;
//		};
		
		SumInter sumInter=(a,b)-> a+b;
			
	
		SubInter subInter=(a,b)->a-b;
		
		System.out.println(sumInter.Sum(2, 2));
		System.out.println(sumInter.Sum(4,9));
		System.out.println(subInter.sub(8,2));
		
		LengthInter lengthInter=str->str.length(); 
		System.out.println("Length of the String is"+lengthInter.getLength("Manthan Bhagtani"));
	
}
}
