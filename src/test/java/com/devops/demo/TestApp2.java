package com.devops.demo;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

public class TestApp2  extends TestCase {

	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}