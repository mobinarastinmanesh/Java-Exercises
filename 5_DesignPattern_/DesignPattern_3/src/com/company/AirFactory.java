package com.company;

public class AirFactory {
    public static AirPlane getairplan(int a){
        switch ( a ){
            case 1 : return new AirBus();
            case 2 : return new ATR();
            case 3 : return new Boeing();
            case 4 : return new McDonnellDouglas();
            default: return null ;
        }
    }
}
