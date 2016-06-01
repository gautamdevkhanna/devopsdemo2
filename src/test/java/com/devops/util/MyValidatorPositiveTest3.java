package com.devops.util;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
public class MyValidatorPositiveTest3 extends TestCase  {
   private String userName;
   private String password;
   
   private MyValidator myValidator = MyValidator.getInstance();
   
   @Before 
   public void setUp() {
      userName = "   ";
      password = "igate@123";
   }
	
   @Test
   public void testIsUserAuthenticated() {
      assertFalse(myValidator.isUserAuthenticated(userName, password));
   }
   
   @Test
   public void testValidateFieldsAreNotEmpty() {
      assertFalse(myValidator.validateFieldsAreNotEmpty(userName, password));
   }

}

