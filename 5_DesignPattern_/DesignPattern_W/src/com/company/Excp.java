package com.company;


import java.util.InputMismatchException;

public class Excp {

public static String parse(Exception e){

    if(e instanceof InputMismatchException){
        return "please inter number ! ";
    }
    else {
        return "Exception";//فکر نمیکنم اصلا این خط اجرا بشه :/
    }

}
}
