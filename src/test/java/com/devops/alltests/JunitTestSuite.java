package com.devops.alltests;

import com.devops.util.MyValidatorNegativeTest1;
import com.devops.util.MyValidatorNegativeTest2;
import com.devops.util.MyValidatorNegativeTest3;
import com.devops.util.MyValidatorNegativeTest4;
import com.devops.util.MyValidatorPositiveTest1;
import com.devops.util.MyValidatorPositiveTest2;
import com.devops.util.MyValidatorPositiveTest3;

import junit.framework.Test;
import junit.framework.TestSuite;

public class JunitTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Sample Tests");
		suite.addTestSuite(MyValidatorNegativeTest1.class);
		suite.addTestSuite(MyValidatorNegativeTest2.class);
		suite.addTestSuite(MyValidatorNegativeTest3.class);
		suite.addTestSuite(MyValidatorNegativeTest4.class);
		suite.addTestSuite(MyValidatorPositiveTest1.class);
		suite.addTestSuite(MyValidatorPositiveTest2.class);
		suite.addTestSuite(MyValidatorPositiveTest3.class);
		return suite;
	}
}