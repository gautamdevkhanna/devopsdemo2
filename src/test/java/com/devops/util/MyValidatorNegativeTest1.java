package com.devops.util;

import org.junit.Before;
import org.junit.Test;

import com.devops.util.MyValidator;

import junit.framework.TestCase;
public class MyValidatorNegativeTest1 extends TestCase  {
   private String userName;
   private String password;
   
   private MyValidator myValidator = MyValidator.getInstance();
   
   @Before 
   public void setUp() {
      userName = "Igate";
      password = "igate@123";
   }
	
   @Test
   public void testIsUserAuthenticated() {
      assertFalse("Login Failed",myValidator.isUserAuthenticated(userName, password));
   }
   
   @Test
   public void testValidateFieldsAreNotEmpty() {
      assertTrue(myValidator.validateFieldsAreNotEmpty(userName, password));
   }

}

