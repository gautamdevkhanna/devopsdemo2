package com.devops.util;

public class MyValidator {
	private static MyValidator myValidator;
	
	public static MyValidator getInstance() {
		if(myValidator != null) {
			return myValidator;
		} else {
			return new MyValidator();
		}
	}

	public boolean validateFieldsAreNotEmpty(String userName, String password) {
		if (isNullOrEmpty(userName) || isNullOrEmpty(password)) {
			return false;
		}
		return true;
	}

	public boolean isNullOrEmpty(String str) {
		return str == null || str.trim().equals("");
	}

	public boolean isUserAuthenticated(String userName, String password) {
		if ("igate".equals(userName) && password.equals("igate@123")) {
			return true;
		}
		return false;
	}
}
