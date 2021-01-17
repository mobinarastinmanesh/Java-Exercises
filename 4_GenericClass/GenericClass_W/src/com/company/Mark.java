package com.company;


public class Mark {
    public void mark (Double m) throws Exception {

        if(m <= 10.0){
            throw new MarkExp();
        }

    }
}
