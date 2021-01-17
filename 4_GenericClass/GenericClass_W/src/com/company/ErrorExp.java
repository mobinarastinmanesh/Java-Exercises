package com.company;


import java.util.InputMismatchException;

public class ErrorExp extends Exception {

    public static String ParseExp(Exception e){
        if(e instanceof InputMismatchException){//متغییری که از نوع اعشار هست رو رشته وارد کرده

            return  " please enter number ! ";

        }
        else if ( e instanceof MarkExp){//استثنایی که خودم تعریف کردم برای نمره کم

            return  "nomre kam ast !" ;
        }

        else return "Exception";
    }


}
