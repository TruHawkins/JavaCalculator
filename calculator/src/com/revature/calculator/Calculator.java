package com.revature.calculator;

import java.util.Scanner;

public class Calculator {
	
	private Scanner sc;
	private String op;
	
	public void calculate() {
		sc = new Scanner(System.in);
		System.out.println("Hello I am calculator, pleased to meet you");
		int i = 0;
		do {
			i = 0;
			getOperation();
			System.out.println("Wanna go again?! Y/N");
			String inp = sc.next();
			if(inp.equals("Y")) {
				i = 1;
			}
		} while (i == 1);
		sc.close();
		
	}
	
	void getOperation() {
		System.out.println("please give me an operation you would like to perform");
		boolean goodOp = false;
		String inp = sc.next();
		op = inp;
		switch(inp) {
		case "+":
			System.out.println("lets ADD!");
			goodOp = true;
			break;
		case "-":
			System.out.println("its subtracton TIME!");
			goodOp = true;
			break;
		case "/":
			System.out.println("divide it up!");
			goodOp = true;
			break;
		case"*":
			System.out.println("Multiply like Pie");
			goodOp = true;
			break;
		default:
			System.out.println("Thats not correct! I need a +, -, /, or *");
			getOperation();
		}
		if(goodOp) {
			getNumberType();
		}
	}
	
	void getNumberType() {
		System.out.println("Now what type of number do you want?");
		String inp = sc.next();
		switch(inp) {
		case "byte":
			System.out.println("Byte, now what numbers do you want");
			System.out.println(getByte());
			break;
		case "short":
			System.out.println("its short TIME! WHAT NUMBERS SHOULD I DO!");
			System.out.println(getShort());
			break;
		case "int":
			System.out.println("int up! on what numbers though?");
			System.out.println(getInt());
			break;
		case"long":
			System.out.println("long like Dong, what numbers should I do");
			System.out.println(getLong());
			break;
		case"float":
			System.out.println("float away, with what numbers though?");
			System.out.println(getFloat());
			break;
		case"double":
			System.out.println("double or nothing! WHat numbers should I oprate on?");
			System.out.println(getDouble());
			break;
		default:
			System.out.println("Thats not correct! I can only deal with byte, short, int, long, float and double");
			getNumberType();
		}
	}
	
	
	Byte getByte() {
		String s1 = sc.next();
		String s2 = sc.next();
		byte b1 = Byte.valueOf(s1);
		byte b2 = Byte.valueOf(s2);
		
		switch(op) {
		case "+":
			return (byte) (b1 + b2);
		case "-":
			return (byte) (b1 - b2);
		case "/":
			return (byte) (b1 / b2);
		case"*":
			return (byte) (b1 * b2);
		default:
			System.out.println("Thats not correct!");
			return (byte) 0;
		}
	}
	
	short getShort() {
		String s1 = sc.next();
		String s2 = sc.next();
	
		short sh1 = Short.parseShort(s1);
		short sh2 = Short.parseShort(s2);
		switch(op) {
		case "+":
			return (short) (sh1 + sh2);
		case "-":
			return (short) (sh1 - sh2);
		case "/":
			return  (short) (sh1 / sh2);
		case"*":
			return (short) (sh1 * sh2);
		default:
			System.out.println("Thats not correct!");
			return (short) 0;
		}
	}
	
	int getInt() {
		String s1 = sc.next();
		String s2 = sc.next();
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		switch(op) {
		case "+":
			return i1 + i2;
		case "-":
			return i1 - i2;
		case "/":
			return i1 / i2;
		case"*":
			return i1 * i2;
		default:
			System.out.println("Thats not correct!");
			return 0;
		}
	}
	
	long getLong() {
		String s1 = sc.next();
		String s2 = sc.next();
		long l1 = Long.parseLong(s1);
		long l2 = Long.parseLong(s2);
		long result = 0;
		
		switch(op) {
		case "+":
			result = l1 + l2;
			break;
		case "-":
			result = l1 - l2;
			break;
		case "/":
			result = l1 / l2;
			break;
		case"*":
			result = l1 * l2;
			break;
		default:
			break;
		}
		
		return result;
	}
	
	float getFloat() {
		String s1 = sc.next();
		String s2 = sc.next();
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		
		switch(op) {
		case "+":
			return (float) (f1 + f2); 
		case "-":
			return (float) (f1 - f2);
		case "/":
			return (float) (f1 / f2);
		case"*":
			return (float) (f1 * f2);
		default:
			System.out.println("Thats not correct!");
			return (float) 0;
		}
	}
	
	double getDouble() {
		String s1 = sc.next();
		String s2 = sc.next();
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		
		switch(op) {
		case "+":
			return (double) (d1 + d2);
		case "-":
			return (double) (d1 - d2);
		case "/":
			return (double) (d1 / d2);
		case"*":
			return (double) (d1 * d2);
		default:
			System.out.println("Thats not correct!");
			return (double) 0;
		}
	}
}
