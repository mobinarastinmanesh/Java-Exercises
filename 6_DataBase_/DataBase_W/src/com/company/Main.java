package com.company;

import java.io.ObjectInputStream;
import java.util.*;
//این تمرین رو میشد مثل قبلی ها با ساخت چند کلاس جنریک و شی سازی از هر کدوم و مقدار دهی از طریق سازنده هاشون  انجام داد اما
// (چون تمرین های قبلی با این الگوریتم نوشته شده بودند)برای تمرین بیشتر به این فرم نوشتیم
public class Main {

    public static void main(String[] args) {
        String name1;
        String lastname1;
        String fathername1;
        String codemelly1;
        String melliyat1;
        int saltavalod1;
        int engheza1;

        //////////////////person1///////////////////////
        System.out.println("********person1********");
        System.out.println("1)sabtkart\n2)tagheeretelaat\n3)tamdid\n4)eelamemafghodi\n");
        int n1 ;
        Scanner scanner = new Scanner(System.in);
        KArt_melly object1 = new KArt_melly();
        n1=scanner.nextInt();
        switch (n1){
            case 1:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object1.sabtkart(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,0);

                Map<String,String> map =new LinkedHashMap<>();
                map.put("name :" , object1.name);
                map.put("last name:" , object1.lastname);
                map.put("fathername: " , object1.fathername);
                map.put("codemelly:" , object1.codemelly);
                map.put("saltavalod : " , String.valueOf(object1.saltavalod));
                map.put("melliyat : " , object1.melliyat);
                map.put("engheza:", String.valueOf(object1.engheza));
                Set set = map.keySet();
                for (Object o : set ){
                    System.out.println( o + map.get(o));
                }
                break;
            case 2:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object1.edit(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1);

                map = new LinkedHashMap<>();
                map.put("name :" , object1.name);
                map.put("last name:" , object1.lastname);
                map.put("fathername: " , object1.fathername);
                map.put("codemelly:" , object1.codemelly);
                map.put("saltavalod : " , String.valueOf(object1.saltavalod));
                map.put("melliyat : " , object1.melliyat);

                set = map.keySet();
                for (Object o : set ){
                    System.out.println( o + map.get(o));
                }
                break;
            case 3:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object1.tamdid(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map = new LinkedHashMap<>();
                map.put("name :" , object1.name);
                map.put("last name:" , object1.lastname);
                map.put("fathername: " , object1.fathername);
                map.put("codemelly:" , object1.codemelly);
                map.put("saltavalod : " , String.valueOf(object1.saltavalod));
                map.put("melliyat : " , object1.melliyat);
                map.put("engheza:", String.valueOf(object1.engheza));
                set = map.keySet();
                for (Object o : set ){
                    System.out.println( o + map.get(o));
                }
                break;
            case 4:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object1.mafghodi(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map = new LinkedHashMap<>();
                map.put("name :" , object1.name);
                map.put("last name:" , object1.lastname);
                map.put("fathername: " , object1.fathername);
                map.put("codemelly:" , object1.codemelly);
                map.put("saltavalod : " , String.valueOf(object1.saltavalod));
                map.put("melliyat : " , object1.melliyat);
                map.put("engheza:", String.valueOf(object1.engheza));
                set = map.keySet();
                for (Object o : set ){
                    System.out.println( o + map.get(o));
                }
                break;
        }
        ////////////////////person2/////////////////////
        System.out.println("********person2********");
        System.out.println("1)sabtkart\n2)tagheeretelaat\n3)tamdid\n4)eelamemafghodi\n");
        int n2 ;
        scanner = new Scanner(System.in);
        KArt_melly object2 =new KArt_melly();
        n2=scanner.nextInt();
        switch (n2){
            case 1:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object2.sabtkart(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,0);

                Map<String,String> map2 =new LinkedHashMap<>();
                map2.put("name :" , object2.name);
                map2.put("last name:" , object2.lastname);
                map2.put("fathername: " , object2.fathername);
                map2.put("codemelly:" , object2.codemelly);
                map2.put("saltavalod : " , String.valueOf(object2.saltavalod));
                map2.put("melliyat : " , object2.melliyat);
                map2.put("engheza:", String.valueOf(object2.engheza));
                Set set2 = map2.keySet();
                for (Object o : set2 ){
                    System.out.println( o + map2.get(o));
                }
                break;
            case 2:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object2.edit(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1);

                map2 = new LinkedHashMap<>();
                map2.put("name :" , object2.name);
                map2.put("last name:" , object2.lastname);
                map2.put("fathername: " , object2.fathername);
                map2.put("codemelly:" , object2.codemelly);
                map2.put("saltavalod : " , String.valueOf(object2.saltavalod));
                map2.put("melliyat : " , object2.melliyat);

                set2 = map2.keySet();
                for (Object o : set2 ){
                    System.out.println( o + map2.get(o));
                }
                break;

            case 3:


                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object2.tamdid(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map2 = new LinkedHashMap<>();
                map2.put("name :" , object2.name);
                map2.put("last name:" , object2.lastname);
                map2.put("fathername: " , object2.fathername);
                map2.put("codemelly:" , object2.codemelly);
                map2.put("saltavalod : " , String.valueOf(object2.saltavalod));
                map2.put("melliyat : " , object2.melliyat);
                map2.put("engheza:", String.valueOf(object2.engheza));
                set2 = map2.keySet();
                for (Object o : set2 ){
                    System.out.println( o + map2.get(o));
                }
                break;
            case 4:


                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object2.mafghodi(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map2 = new LinkedHashMap<>();
                map2.put("name :" , object2.name);
                map2.put("last name:" , object2.lastname);
                map2.put("fathername: " , object2.fathername);
                map2.put("codemelly:" , object2.codemelly);
                map2.put("saltavalod : " , String.valueOf(object2.saltavalod));
                map2.put("melliyat : " , object2.melliyat);
                map2.put("engheza:", String.valueOf(object2.engheza));
                set2 = map2.keySet();
                for (Object o : set2 ){
                    System.out.println( o + map2.get(o));
                }
                break;
        }
        ///////////////////////person3/////////////////
        System.out.println("********person3********");
        System.out.println("1)sabtkart\n2)tagheeretelaat\n3)tamdid\n4)eelamemafghodi\n");
        int n3 ;
        scanner = new Scanner(System.in);

        n3=scanner.nextInt();
        KArt_melly object3 =new KArt_melly();
        switch (n3){
            case 1:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                //System.out.println("tarikh engheza:");
                //engheza1=scanner.nextInt();

                object3.sabtkart(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,0);

                Map<String,String> map3 = new LinkedHashMap<>();
                map3.put("name :" , object3.name);
                map3.put("last name:" , object3.lastname);
                map3.put("fathername: " , object3.fathername);
                map3.put("codemelly:" , object3.codemelly);
                map3.put("saltavalod : " , String.valueOf(object3.saltavalod));
                map3.put("melliyat : " , object3.melliyat);
                map3.put("engheza:", String.valueOf(object1.engheza));
                Set set3 = map3.keySet();
                for (Object o : set3 ){
                    System.out.println( o + map3.get(o));
                }
                break;
            case 2:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object3.edit(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1);

                map3 = new LinkedHashMap<>();
                map3.put("name :" , object3.name);
                map3.put("last name:" , object3.lastname);
                map3.put("fathername: " , object3.fathername);
                map3.put("codemelly:" , object3.codemelly);
                map3.put("saltavalod : " , String.valueOf(object3.saltavalod));
                map3.put("melliyat : " , object3.melliyat);

                set3 = map3.keySet();
                for (Object o : set3 ){
                    System.out.println( o + map3.get(o));
                }
                break;
            case 3:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object3.tamdid(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map3 = new LinkedHashMap<>();
                map3.put("name :" , object3.name);
                map3.put("last name:" , object3.lastname);
                map3.put("fathername: " , object3.fathername);
                map3.put("codemelly:" , object3.codemelly);
                map3.put("saltavalod : " , String.valueOf(object3.saltavalod));
                map3.put("melliyat : " , object3.melliyat);
                map3.put("engheza:", String.valueOf(object3.engheza));
                set3 = map3.keySet();
                for (Object o : set3 ){
                    System.out.println( o + map3.get(o));
                }
                break;
            case 4:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object3.mafghodi(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map3 = new LinkedHashMap<>();
                map3.put("name :" , object3.name);
                map3.put("last name:" , object3.lastname);
                map3.put("fathername: " , object3.fathername);
                map3.put("codemelly:" , object3.codemelly);
                map3.put("saltavalod : " , String.valueOf(object3.saltavalod));
                map3.put("melliyat : " , object3.melliyat);
                map3.put("engheza:", String.valueOf(object3.engheza));
                set3 = map3.keySet();
                for (Object o : set3 ){
                    System.out.println( o + map3.get(o));
                }

        }
        ///////////////////////////person4///////////////
        System.out.println("********person4********");
        System.out.println("1)sabtkart\n2)tagheeretelaat\n3)tamdid\n4)eelamemafghodi\n");
        int n4 ;
        scanner = new Scanner(System.in);
        KArt_melly object4 =new KArt_melly();
        n4=scanner.nextInt();
        switch (n4){
            case 1:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                //System.out.println("tarikh engheza:");
                //engheza1=scanner.nextInt();

                object4.sabtkart(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,0);

                Map<String,String> map4 = new LinkedHashMap<>();
                map4.put("name :" , object4.name);
                map4.put("last name:" , object4.lastname);
                map4.put("fathername: " , object4.fathername);
                map4.put("codemelly:" , object4.codemelly);
                map4.put("saltavalod : " , String.valueOf(object4.saltavalod));
                map4.put("melliyat : " , object4.melliyat);
                map4.put("engheza:", String.valueOf(object4.engheza));
                Set set4 = map4.keySet();
                for (Object o : set4 ){
                    System.out.println( o + map4.get(o));
                }
                break;
            case 2:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object4.edit(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1);

                map4 = new LinkedHashMap<>();
                map4.put("name :" , object4.name);
                map4.put("last name:" , object4.lastname);
                map4.put("fathername: " , object4.fathername);
                map4.put("codemelly:" , object4.codemelly);
                map4.put("saltavalod : " , String.valueOf(object4.saltavalod));
                map4.put("melliyat : " , object4.melliyat);

                set4 = map4.keySet();
                for (Object o : set4 ){
                    System.out.println( o + map4.get(o));
                }
                break;
            case 3:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object4.tamdid(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map4 = new LinkedHashMap<>();
                map4.put("name :" , object4.name);
                map4.put("last name:" , object4.lastname);
                map4.put("fathername: " , object4.fathername);
                map4.put("codemelly:" , object4.codemelly);
                map4.put("saltavalod : " , String.valueOf(object4.saltavalod));
                map4.put("melliyat : " , object4.melliyat);
                map4.put("engheza:", String.valueOf(object4.engheza));
                set4 = map4.keySet();
                for (Object o : set4 ){
                    System.out.println( o + map4.get(o));
                }
                break;

            case 4:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object4.mafghodi(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map4 = new LinkedHashMap<>();
                map4.put("name :" , object4.name);
                map4.put("last name:" , object4.lastname);
                map4.put("fathername: " , object4.fathername);
                map4.put("codemelly:" , object4.codemelly);
                map4.put("saltavalod : " , String.valueOf(object4.saltavalod));
                map4.put("melliyat : " , object4.melliyat);
                map4.put("engheza:", String.valueOf(object4.engheza));
                set4 = map4.keySet();
                for (Object o : set4 ){
                    System.out.println( o + map4.get(o));
                }
                break;
        }
        ////////////////////////person5////////////////////
        System.out.println("********person5********");
        System.out.println("1)sabtkart\n2)tagheeretelaat\n3)tamdid\n4)eelamemafghodi\n");
        int n5 ;
        scanner = new Scanner(System.in);
        KArt_melly object5 =new KArt_melly();
        n5=scanner.nextInt();
        switch (n5){
            case 1:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                object5.sabtkart(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,0);

                Map<String,String> map5 = new LinkedHashMap<>();
                map5.put("name :" , object5.name);
                map5.put("last name:" , object5.lastname);
                map5.put("fathername: " , object5.fathername);
                map5.put("codemelly:" , object5.codemelly);
                map5.put("saltavalod : " , String.valueOf(object5.saltavalod));
                map5.put("melliyat : " , object5.melliyat);
                map5.put("engheza:", String.valueOf(object5.engheza));
                Set set5 = map5.keySet();
                for (Object o : set5 ){
                    System.out.println( o + map5.get(o));
                }
                break;
            case 2:

                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();

                object5.edit(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1);

                map5 = new LinkedHashMap<>();
                map5.put("name :" , object5.name);
                map5.put("last name:" , object5.lastname);
                map5.put("fathername: " , object5.fathername);
                map5.put("codemelly:" , object5.codemelly);
                map5.put("saltavalod : " , String.valueOf(object5.saltavalod));
                map5.put("melliyat : " , object5.melliyat);
                set5 = map5.keySet();
                for (Object o : set5 ){
                    System.out.println( o + map5.get(o));
                }
                break;
            case 3:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object5.tamdid(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map5 = new LinkedHashMap<>();
                map5.put("name :" , object5.name);
                map5.put("last name:" , object5.lastname);
                map5.put("fathername: " , object5.fathername);
                map5.put("codemelly:" , object5.codemelly);
                map5.put("saltavalod : " , String.valueOf(object5.saltavalod));
                map5.put("melliyat : " , object5.melliyat);
                map5.put("engheza:", String.valueOf(object5.engheza));
                set5 = map5.keySet();
                for (Object o : set5 ){
                    System.out.println( o + map5.get(o));
                }
                break;
            case 4:
                System.out.println("name:");
                name1=scanner.next();
                System.out.println("lastname:");
                lastname1=scanner.next();
                System.out.println("fathername:");
                fathername1=scanner.next();
                System.out.println("codemelly:");
                codemelly1=scanner.next();
                System.out.println("melliat:");
                melliyat1=scanner.next();
                System.out.println("saletavadod:");
                saltavalod1=scanner.nextInt();
                System.out.println("tarikh engheza:");
                engheza1=scanner.nextInt();

                object5.mafghodi(name1,lastname1,saltavalod1,fathername1,melliyat1,codemelly1,engheza1);

                map5 = new LinkedHashMap<>();
                map5.put("name :" , object5.name);
                map5.put("last name:" , object5.lastname);
                map5.put("fathername: " , object5.fathername);
                map5.put("codemelly:" , object5.codemelly);
                map5.put("saltavalod : " , String.valueOf(object5.saltavalod));
                map5.put("melliyat : " , object5.melliyat);
                map5.put("engheza:", String.valueOf(object5.engheza));
                set5 = map5.keySet();
                for (Object o : set5 ){
                    System.out.println( o + map5.get(o));
                }
                break;

        }
    }
}
