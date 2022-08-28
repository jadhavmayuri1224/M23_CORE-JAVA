package com.cg.annotations;

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//Custom annotation
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=35)
	public void display()
	{
		System.out.println("Hey, I am using Custom Annotation");
	}
}

public class CustAnnotation {

	public static void main(String[] args) throws Exception{
		C c=new C();
		Method m=c.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		c.display();
        System.out.println(obj.accept());
	}

}
