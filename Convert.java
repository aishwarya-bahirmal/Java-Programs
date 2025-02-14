package com.assignment.ws;
//import java.util.*;
public class Convert {
	public String convertOctal(int n)
	{
		String octal=Integer.toOctalString(n);
		return octal;
	}
	public String convertBinary(int n)
	{
		String octal=Integer.toBinaryString(n);
		return octal;
	}
	public String convertHex(int n)
	{
		String octal=Integer.toHexString(n);
		return octal;
	}

}
