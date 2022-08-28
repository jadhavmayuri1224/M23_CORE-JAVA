package com.cg.annotations;

import java.lang.reflect.Method;

//Custom Annotation
@interface Custom1
{
	//abstract method
	//Multi value annotation
	String print() default"Mayuri";
	int speed() default 5;
	float percentage() default 8.8f;
}
class D
{
	@Custom(print="Hello Students",speed=50,percentage=88.3f)
	public void display()
	{
		System.out.println("Hurrah!It's Holiday");
	}
}

public class CustomAnnotations {

	public static void main(String[] args) throws Exception{
		D b=new D();
		b.display();
		Method m=b.getClass().getMethod("dispaly");
		Custom obj=m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());


	}

}
