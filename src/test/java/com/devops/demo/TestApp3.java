package com.devops.demo;

import junit.framework.Assert;
import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

public class TestApp3  extends TestCase {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}

}