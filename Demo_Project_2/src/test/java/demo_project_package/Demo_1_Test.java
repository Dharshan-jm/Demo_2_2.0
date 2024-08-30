package demo_project_package;

import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;

public class Demo_1_Test extends BaseClass{
	
	@Test
	public void demo1() {
		
		String name = System.getProperty("firstname");
		String lastname = System.getProperty("lastname");
		String city=System.getProperty("city");
		
		System.out.println(name);
		System.out.println(lastname);
		System.out.println(city);
		System.out.println("demo()-1");
	}
	
	@Test
	public void demo2() {
		System.out.println("demo()-2");
	}

}
