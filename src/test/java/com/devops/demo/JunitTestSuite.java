package com.devops.demo;

import junit.framework.Test;
import junit.framework.TestSuite;

public class JunitTestSuite {

	public static Test suite() {


		TestSuite suite = new TestSuite("Sample Tests");

		suite.addTestSuite(TestApp1.class);
		suite.addTestSuite(TestApp2.class);
		suite.addTestSuite(TestApp3.class);
		suite.addTestSuite(TestApp4.class);
		suite.addTestSuite(TestApp5.class);
		suite.addTestSuite(TestApp6.class);
		return suite;
	

		
//		return null;
	}
}