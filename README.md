# lambdaExp
Lambda Expressions-->
()->System.out.println("hi My  name is Manthan");

it is same as->
function(){
System.out.println("hi My  name is Manthan");
}
--------------------------------------- 
(a,b)->a+b;|(int a,int b)->{a+b;}|Type and curly braces optional in Lambda expression.
sum

str->str.length();  is equal to   int getlength(String str){return str.length()};

@FunctionalInterface annotation is used to declare functional interface,it has single abstract method.

create interface--->

package lambdaexpwork;
@FunctionalInterface
public interface MyInter {
public abstract void sayHello(); 
//	public abstract void how();
	
}

we can implement this method directly.
in main class implement MyInter{
MyInter myInter2=new MyInterImpl();-----MyInterImpl myInter2=new MyInterImpl();
//		myInter2.sayHello();
}

we can implement method by using Anonymous class
//		MyInter i=new MyInter() {//it is not the object of interface,it is the object of child class
//        public void sayHello() {
//        	System.out.println("This is anonymous class");
//        }	
//	};
//	i.sayHello();


------->how to use our interface using lambda
MyInter i= ()-> System.out.println("this is first time I am using lambda");
i.sayHello();


we can write this function
	SumInter sumInter=(int a,int b)->{
//			return a+b;
//		};


SumInter sumInter=(a,b)-> a+b;

Lambda function to return length of string
LengthInter lengthInter=str->str.length(); 
		System.out.println("Length of the String is"+lengthInter.getLength("Manthan Bhagtani"));






