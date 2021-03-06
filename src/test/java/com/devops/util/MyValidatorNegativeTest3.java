package com.devops.util;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class MyValidatorNegativeTest3 extends TestCase  {
   private String userName;
   private String password;
   
   private MyValidator myValidator = MyValidator.getInstance();
   
   @Before 
   public void setUp() {
      userName = "igate";
      password = "   ";
   }
	
   @Test
   public void testIsUserAuthenticated() {
    assertFalse(myValidator.isUserAuthenticated(userName, password));
	//assertTrue("Login Failed", myValidator.isUserAuthenticated(userName, password));
   }
   
   @Test
   public void testValidateFieldsAreNotEmpty() {
	 assertFalse(myValidator.validateFieldsAreNotEmpty(userName, password));
    //  assertTrue("username and Password Field cannot contian null or empty as value", myValidator.validateFieldsAreNotEmpty(userName, password));
   }

}

