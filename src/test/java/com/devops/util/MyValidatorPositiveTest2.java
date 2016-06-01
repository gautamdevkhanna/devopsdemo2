package com.devops.util;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class MyValidatorPositiveTest2 extends TestCase  {
   private String userName;
   private String password;
   
   private MyValidator myValidator = MyValidator.getInstance();
   
   @Before 
   public void setUp() {
      userName = "igate";
      password = "igate@123";
   }
	
   @Test
   public void testIsUserAuthenticated() {
      assertTrue(myValidator.isUserAuthenticated(userName, password));
   }
   
   @Test
   public void testValidateFieldsAreNotEmpty() {
      assertTrue(myValidator.validateFieldsAreNotEmpty(userName, password));
   }

}

