package com.company;

public class Main {

    public static void main(String[] args) {
	int a=1;
	int b=1;
	int c;
	int i;
	System.out.println(a);
	System.out.println(b);
	for(i=1;i<=8;i++){
	    c=a+b;
	    System.out.println(c);
	    a=b;
	    b=c;
    }
    }
}
