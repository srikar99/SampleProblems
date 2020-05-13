package com.practice.conditioncheck;

public class Main {

	public static void main(String[] args) {
		MyIdmReq input = new MyIdmReq();
		input.setUserDelete("Y");
		input.setLocationDelete("N,N,N");
		input.setApplicationTypeDelete("Y");
		
		System.out.println(isDeleteOperation(input));
	}

	private static boolean isDeleteOperation(MyIdmReq input) {
		return (input.getUserDelete() != null || input.getLocationDelete() != null
				|| input.getApplicationTypeDelete() != null)
				&& (input.getUserDelete().equals("Y") || input.getLocationDelete().contains("Y")
						|| input.getApplicationTypeDelete().equals("Y"));
	}
}
