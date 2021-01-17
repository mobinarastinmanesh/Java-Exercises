package com.company;

public class Main {

    public static void main(String[] args) {
	int sum=0;
	int i=1;
        while(sum<=10){
            System.out.println(i);
	        sum += i;
	        i++;
    }
    System.out.println("sum : " + sum);
    }
}
