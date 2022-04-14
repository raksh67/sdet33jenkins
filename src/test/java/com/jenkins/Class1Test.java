package com.jenkins;

import org.testng.annotations.Test;

public class Class1Test {
@Test
public void test1() {
	String browser = System.getProperty("BROWSER");
	String url = System.getProperty("URL");
	System.out.println(browser+"   "+url);
	System.out.println("START JENKINS ");
	
}
}
