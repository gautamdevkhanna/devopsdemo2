package com.devops.util;

import org.junit.Before;
import org.junit.Test;

import com.devops.util.MyValidator;

import junit.framework.TestCase;
public class MyValidatorNegativeTest2 extends TestCase  {
   private String userName;
   private String password;
   
   private MyValidator myValidator = MyValidator.getInstance();
   
   @Before 
   public void setUp() {
      userName = null;
      password = "igate@123";
   }
	
   @Test
   public void testIsUserAuthenticated() {
	   
		   assertFalse(myValidator.isUserAuthenticated(userName, password));
	   
   }
   
   @Test
   public void testValidateFieldsAreNotEmpty() {
	  assertFalse(myValidator.validateFieldsAreNotEmpty(userName, password));
      //assertTrue("username and Password Field cannot contain null or empty as value", myValidator.validateFieldsAreNotEmpty(userName, password));
   }

}

