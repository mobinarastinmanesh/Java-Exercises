package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("enter mark : ");

        Double M ;

            try {

                M = Input.nextDouble();//اگر رشته وارد کنه اینجا ارور ایجاد میشه
                Mark o = new Mark();
                o.mark(M);//در اینجا قرار است که زیر 10 بودن نمره رو بررسی کنه

                /**
                 اولویت برای من اینه که نمره وارد شده غیر عدد نباشه
                اگر کاربر غیر عددی وارد کنه دیگه اهمیتی نداره که زیر 10 باشه یا نه ! پس اول خطای غیر رشته بودن رو بررسی میکنیم!
                **/

            } catch (Exception e) {
                System.err.println(ErrorExp.ParseExp(e));
            }

        }


    }

