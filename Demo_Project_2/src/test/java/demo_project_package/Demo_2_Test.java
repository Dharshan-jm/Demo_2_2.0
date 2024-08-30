package demo_project_package;

import org.testng.annotations.Test;

public class Demo_2_Test {
  
	@Test
	public void test1() {
		String name = System.getProperty("firstname");
		String lastname=System.getProperty("lastname");
		String city=System.getProperty("city");
		
		System.out.println(name+" "+lastname+" "+city);
		System.out.println("test()-1");
	}
	
	@Test
	public void test2() {
		System.out.println("test()-2");
	}
}
