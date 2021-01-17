package com.company;

public class Main {

    public static void main(String[] args) {
	int i ;
	for(i=0;i<=10;i++){
	    if(i%2==0 && i%3!=0 ){
	        System.out.println(i + "--->bakhshpazir bar 2");
        }
        else if(i%3==0 && i%2!=0){
            System.out.println(i + "--->bakhshpazir bar 3");
        }
        else if(i%2==0 && i%3==0 ){
            System.out.println(i + "--->bakhshpazir bar 3 , 2");
        }
    }
    }
}
